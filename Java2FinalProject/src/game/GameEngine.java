package game;
import enums.*;
import rooms.*;
import interfaces.*;
import objects.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

/**
 * 
 */
public class GameEngine 
{	
	// Instantiate Logging Object to be used by the class
	final static Logger log = 
			LogManager.getLogger();

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			boolean isPlaying = true;

			// Instantiate room objects
			Room commonRoom = new CommonRoom();
			Room kitchen = new Kitchen();
			Room nellsRoom = new NellsRoom();
			Room nellsWorkshop = new NellsWorkshop();
			Room privy = new Privy();
			Room courtyard = new Courtyard();
			Room llensRoom = new LlensRoom();

			// Set up exits
			commonRoom.setExit("north", nellsRoom);
			nellsRoom.setExit("south", commonRoom);

			commonRoom.setExit("south", privy);
			privy.setExit("north", commonRoom);

			commonRoom.setExit("east", courtyard);
			courtyard.setExit("west", commonRoom);

			commonRoom.setExit("west", kitchen);
			kitchen.setExit("east", commonRoom);

			kitchen.setExit("south", llensRoom);
			llensRoom.setExit("north", kitchen);

			nellsRoom.setExit("west", nellsWorkshop);
			nellsWorkshop.setExit("east", nellsRoom);

			// Create the Player object
			Player player = new Player(commonRoom);
			
			// Create Helper Text
			Helper help = new Helper(
					"Available commands (action + noun)\n" +
					"DROP\n"+
					"EAT\n"+
					"EXAMINE\n"+
					"GO\n"+
					"OPEN\n"+
					"READ\n"+
					"TAKE\n"+
					"USE\n\n"+
					"Single-word actions (no noun required)\n"+
					"HELP\n"+
					"INVENTORY\n"+
					"QUIT"
					);

			// Ask Player for name
			//			System.out.println("Enter your name:");
			//			String name = sc.nextLine();

			System.out.println("You are currently in the " + player.getCurrentRoom().getRoomName().toString());

			while (isPlaying == true)
			{
				String command = sc.nextLine().toUpperCase().trim();

				if(command.length() < 1)
				{
					System.out.println("Please provide a command to continue.");
				}
				else
				{
					// Find where the first space is to parse the verb first, no space will be -1
					int firstSpaceIndex = command.indexOf(" ");
					String verb;
					String noun = "";

					// If the there is only one word, then set the verb
					if (firstSpaceIndex == -1)
					{
						verb = command;
					}

					// Otherwise, parse up to the first space as the "verb" and then the rest goes into the "noun"
					else 
					{
						verb = command.substring(0, firstSpaceIndex).toUpperCase();
						noun = command.substring(firstSpaceIndex + 1).trim().toUpperCase();
					}

					// try to find the verb in the list of acceptable actions in the enumeration
					try 
					{
						Action action = Action.valueOf(verb);
						System.out.println("Action provided: " + action);
						System.out.println("Noun provided: " + noun);

						switch (action) 
						{
						case HELP:

							// Show the game's help text
							help.displayHelpText();

							break;

						case INVENTORY:

							System.out.println("=== Inventory ===");

							// show the player's current inventory
							for (InteractableObject item : player.getInventory())
							{
								System.out.println("* " + item.getName().toString());
							}

							break;

						case QUIT:

							System.out.println("You have quit the game.");
							isPlaying = false;

							break;

						case DROP:

							// Check to see if the object exists in the player's current room
							InteractableObject objectToDrop = player.searchInventory(noun);

							// If the object exists
							if (objectToDrop != null) 
							{
								// if so, drop the item (and add it to the current room's inventory)
								// If yes, then add item to player inventory 
								player.removeItem(objectToDrop);

								// Remove it from room inventory
								player.getCurrentRoom().addItem(objectToDrop);

								// Tell the user it was added to their inventory
								System.out.println(objectToDrop.getName() + " was removed from your inventory.");
							}

							else
							{
								// if they don't have the item, tell them they cannot drop it
								System.out.println("You do not have that item.");
							}

							break;

						case EAT:

							// check that the item is in the room or is in the player's inventory

							// if it is, then check to see if the object is edible

							// if it is, then eat the item

							// else, tell the player they cannot do that

							break;

						case EXAMINE:

							// check that the item is in the room or is in the player's inventory

							// if it is, then examine the object

							// else, tell the player they cannot do that

							break;

						case GO:
							
							//TODO 
							//incorporate the direction enum

							// check if the direction the player chose has an exit
							Room newRoom = player.getCurrentRoom().getExit(noun);

							if (newRoom != null)
							{
								// if so, update the player's current room to the neighboring room
								player.setCurrentRoom(newRoom);
							}

							else 
							{
								// if not, tell the player they cannot go that way
								System.out.println("You cannot go that way.");
							}

							break;

						case OPEN:

							// ?? Not sure, maybe for a locked element

							break;

						case READ:

							// check that the item is in the room or is in the player's inventory

							// if it is, check to see it's able to be read

							// if yes, then read the item

							// if no, tell the player they cannot do that

							break;

						case TAKE:

							// Check to see if the object exists in the player's current room
							InteractableObject objectToTake = player.getCurrentRoom().searchInventory(noun);

							// If the object exists
							if (objectToTake != null) 
							{
								// Check that it can be added to the player's inventory
								if (objectToTake.getCanBeAddedToInventory()) 
								{
									// If yes, then add item to player inventory 
									player.addItem(objectToTake);

									// Remove it from room inventory
									player.getCurrentRoom().removeItem(objectToTake);

									// Tell the user it was added to their inventory
									System.out.println(objectToTake.getName() + " was added to your inventory.");
								}
								// If cannot be picked up, tell the player they cannot take that
								else
								{
									System.out.println("You cannot take that.");
								}
							}

							// If the object does not exist
							else
							{
								System.out.println("That item does not exist here.");
							}

							break;

						case USE:

							// Check to see if the object exists in the player's current room
							InteractableObject objectToUse = player.searchInventory(noun);

							// If the object exists
							if (objectToUse != null) 
							{
								// use the item, if item usage successful
								if (objectToUse.useItem(player.getCurrentRoom(), objectToUse)) 
								{
									// and the object is not reusable
									if (!objectToUse.getIsReusable())
									{
										player.removeItem(objectToUse);
									}
								}

								else
								{
									System.out.println("You cannot use that item here.");
								}
							}

							else
							{
								// if not, tell the player they don't have that item
								System.out.println("You do not have that item.");
							}		

							break;


						default:
							// Fallback code if no other case matches
							System.out.println("Unknown action.");
							break;
						}
					}

					catch (IllegalArgumentException e)
					{
						System.out.println("Invalid action:" + verb);
					}

					//for (String str : splitCommand) 
					//{
					//	System.out.println(str);
					//}	
				}
			}


			//			//Instantiate the Journal (InteractableObject)
			//			InteractableObject nellsJournal = new Journal(
			//					"Nell's Journal",
			//					"Llen must never know."
			//					);
			//
			//			nellsJournal.examine();

			//Instantiate the Kitchen (Room)
			//Kitchen homeKitchen = new Kitchen("This is the description of the kitchen.");

			//homeKitchen.examine();
		}
		catch (Exception ex)
		{
			//			log.debug("Hello World!");
		}
		finally 
		{
			//			log.info("Hello World, Again!");
			//			log.warn("Application warning");
			//			log.error("Something wrong happened");
		}
	}
}

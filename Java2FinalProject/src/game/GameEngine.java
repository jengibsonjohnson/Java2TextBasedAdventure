package game;
import enums.*;
import rooms.*;
import interfaces.*;
import objects.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Main class which controls the gameplay
 */
public class GameEngine 
{	
	// Instantiate Logging Object to be used by the class
	final static Logger log = 
			LogManager.getLogger();


	/**
	 * Main method which controls the overall gameplay
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Create locale
		Locale us = Locale.of("en", "US");
		Locale spanish = Locale.of("es");

		try 
		{
			
			Scanner sc = new Scanner(System.in);
			boolean isPlaying = true;

			// Instantiate room objects
			Room commonRoom = new CommonRoom();
			Room kitchen = new Kitchen();
			Room nellsRoom = new NellsRoom();
			Room nellsWorkshop = new NellsWorkshop();
			Room pantry = new Pantry();
			Room courtyard = new Courtyard();
			Room llensRoom = new LlensRoom();

			// Set up exits
			commonRoom.setExit("north", nellsRoom);
			nellsRoom.setExit("south", commonRoom);

			commonRoom.setExit("south", pantry);
			pantry.setExit("north", commonRoom);

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
			Helper help = new Helper();

			// Introduction to the game play
			// Use the user's locale
			LocalTime currentTime = LocalTime.now();
						
			GameState.getGreeting(us, currentTime);
			GameState.getGreeting(spanish, currentTime);

			//// Testing with manual time entry
			//LocalTime currentTimeManual = LocalTime.of(12, 00);
			
			//GameState.testGreeting(us, currentTimeManual);
			//GameState.testGreeting(spanish, currentTimeManual);

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
						//System.out.println("Action provided: " + action);
						//System.out.println("Noun provided: " + noun);

						switch (action) 
						{
						case HELP:

							// Show the game's help text
							help.displayHelpText();

							break;

						case INVENTORY:

							// Display player inventory
							player.displayPlayerInventory();

							break;

						case QUIT:

							System.out.println("You have quit the game.");
							isPlaying = false;

							break;

						case DRINK:

							//TODO

							break;

						case DROP:

							// Check to see if the object exists in the player's current room
							InteractableObject objectToDrop = player.searchInventory(noun);

							// If the object exists
							if (objectToDrop != null && objectToDrop instanceof Droppable d) 
							{
								// if so, drop the item (and add it to the current room's inventory)
								player.removeItem(objectToDrop);

								// Add it to room inventory
								player.getCurrentRoom().addItem(objectToDrop);

								// Tell the user it was dropped from their inventory
								d.drop();
								System.out.println(d.dropMessage());
							}

							else
							{
								// if they don't have the item, tell them they cannot drop it
								System.out.println("You do not have that item.");
							}

							break;

						case EAT:

							// TODO
							// check that the item is in the room or is in the player's inventory

							// if it is, then check to see if the object is edible

							// if it is, then eat the item

							// else, tell the player they cannot do that

							break;

						case EXAMINE:

							// Check if the player wants to examine the current room
							if (noun == null || noun.isEmpty() || noun.equalsIgnoreCase("room"))
							{
								player.getCurrentRoom().examine();
							}

							else 
							{
								InteractableObject objectToExamine = null;

								// Check player's inventory first
								objectToExamine = player.searchInventory(noun);

								// If not found, check the room's inventory
								if (objectToExamine == null) 
								{
									objectToExamine = player.getCurrentRoom().searchInventory(noun);
								}

								// Examine if found, otherwise give feedback
								if (objectToExamine != null) 
								{
									objectToExamine.examine();
								} 
								else 
								{
									System.out.println("You don't see that here.");
								}
							}

							break;

						case GO:

							try {

								// Get the direction the user has provided with the "go" command
								Direction direction = Direction.valueOf(noun);

								if (direction != null)
								{
									// check if the direction the player chose has an exit
									Room newRoom = player.getCurrentRoom().getExit(noun);

									if (newRoom != null)
									{
										// if so, update the player's current room to the neighboring room
										player.setCurrentRoom(newRoom);
										System.out.println(newRoom.getDescription());
									}

									else 
									{
										// if not, tell the player they cannot go that way
										System.out.println("You cannot go that way.");
									}
								}
							}
							catch (IllegalArgumentException e)
							{
								// Catches invalid strings and safely triggers your fallback feedback
								System.out.println("Not a valid direction.");
							}

							break;

						case READ:

							// check that the item is in the player's inventory
							InteractableObject objectToRead = player.searchInventory(noun);

							if (objectToRead != null)
							{
								// if it is, check to see it's able to be read
								if (objectToRead instanceof Legible l)
								{
									// if yes, then read the item
									l.read();
								}

								else
								{
									System.out.println("You cannot read that.");
								}
							}

							else 
							{
								// if no, tell the player they cannot do that
								System.out.println("You do not have that item.");
							}

							break;

						case TAKE:

							// Check to see if the object exists in the player's current room
							InteractableObject objectToTake = player.getCurrentRoom().searchInventory(noun);

							// If the object exists
							if (objectToTake != null) 
							{
								// Check that it can be added to the player's inventory (taken)
								if (objectToTake instanceof Takeable t)
								{
									// If yes, then add item to player inventory 
									player.addItem(objectToTake);

									// Remove it from room inventory
									player.getCurrentRoom().removeItem(objectToTake);

									// Tell the user it was added to their inventory
									t.take();
									System.out.println(t.pickupMessage());
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
								if (objectToUse instanceof Usable u)
								{
									// use the item, if item usage successful
									if (u.useItem(player.getCurrentRoom(), objectToUse)) 
									{
										System.out.println(u.useMessage());
										
										// and the object is not reusable
										if (!(objectToUse instanceof Reusable))
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
									System.out.println("You cannot use that item.");
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
						System.out.println(verb + " is not a valid action.");
					}
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally 
		{
			//			log.info("Hello World, Again!");
			//			log.warn("Application warning");
			//			log.error("Something wrong happened");
		}
	}
}

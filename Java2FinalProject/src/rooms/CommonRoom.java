package rooms;

import enums.*;
import interfaces.*;
import game.*;
import objects.*;

/**
 * Class for the Common Room, a Room a Player can enter and interact with
 */
public class CommonRoom extends Room 
{
	/*
	 * Constructor for superclass name and this room's description, generates all the objects in the room
	 */
	public CommonRoom() 
	{
		super("Common Room",
				"A cozy, well-traveled common room. A sturdy chair and a worn bench sit nearby. A door stands to the \n"
			  + "north leading to a bedroom, another to the south, a heavy wooden door to the west opens out to a \n"
			  + "courtyard, and the kitchen lies to the east. There is a book laying open on the bench.");
		
		InteractableObject chair = new InteractableObject("Chair","This is a chair.");
		InteractableObject bench = new InteractableObject("Bench","This is a bench.");
		NellsBook book = new NellsBook();
		book.setIsReadable(true);
		book.setCanBeAddedToInventory(true);
		book.setIsReusable(true);
		
		super.addItem(chair);
		super.addItem(bench);
		super.addItem(book);
	}
	
	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println("You are in the " + getRoomName() + ".");
	    System.out.println(getDescription());
	}

	/**
	 * Override method for what happens when a player enters the room
	 */
	@Override
	public void onEnter(Player player, GameState state) 
	{
		// TODO Auto-generated method stub
		
	}
}

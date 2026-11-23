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
		super("Common Room", """
				A cozy, well-traveled common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's room is to the
				NORTH of you, your room to the SOUTH, a heavy wooden FRONT DOOR to the WEST opens out to a
				courtyard, and the kitchen lies to the EAST. There is a BOOK laying open on the BENCH.
				""");

		InteractableObject chair = new InteractableObject("Chair","This is a chair.");
		InteractableObject bench = new InteractableObject("Bench","This is a bench.");
		InteractableObject frontDoor = new FrontDoor();
		NellsBook book = new NellsBook(this);
		
		super.addItem(chair);
		super.addItem(bench);
		super.addItem(book);
		super.addItem(frontDoor);
	}
	
	/**
	 * Remove the BOOK from the room description if the Player takes it
	 */
	public void removeBookFromRoomDescription()
	{
		this.setDescription("""
				A cozy, well-traveled common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's room is to the
				NORTH of you, your room to the SOUTH, a heavy wooden FRONT DOOR to the WEST opens out to a
				courtyard, and the kitchen lies to the EAST.
				""");
	}
	
	/**
	 * Add the BOOK from the room description if the Player takes it
	 */
	public void addBookToRoomDescription()
	{
		this.setDescription("""
				A cozy, well-traveled common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's room is to the
				NORTH of you, your room to the SOUTH, a heavy wooden FRONT DOOR to the WEST opens out to a
				courtyard, and the kitchen lies to the EAST. There is a BOOK laying open on the BENCH.
				""");
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

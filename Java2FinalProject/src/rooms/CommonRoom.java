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
				A cozy, well-maintained common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's 
				room is to the NORTH of you, the pantry to the SOUTH, a heavy wooden FRONT DOOR to the 
				WEST opens out to a courtyard, and the kitchen lies to the EAST. There is a BOOK laying 
				open on the BENCH.
				""",
				"""
				The common room is warm and inviting, clearly the heart of the house. Years of use have 
				smoothed the arms of the sturdy CHAIR and left the BENCH polished in places. A faint 
				scent of herbs and freshly baked bread drifts in from the kitchen. The open BOOK on the 
				bench appears well read, its pages dog-eared and marked by frequent visits.
				""");

		InteractableObject chair = new InteractableObject("Chair","""
				The chair looks surprisingly comfortable despite its plain design. A small cushion 
				rests on the seat, slightly flattened from regular use. It seems to be a favorite 
				spot for reading.
				""");
		InteractableObject bench = new InteractableObject("Bench","""
				The bench is old but dependable. Deep scratches and worn patches hint at decades of 
				regular use, yet it remains as sturdy as the day it was built.
				""");
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
				A cozy, well-maintained common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's 
				room is to the NORTH of you, your room to the SOUTH, a heavy wooden FRONT DOOR to the 
				WEST opens out to a courtyard, and the kitchen lies to the EAST.
				""");
		this.setExaminationDescription("""
				The common room is warm and inviting, clearly the heart of the house. Years of use have 
				smoothed the arms of the sturdy CHAIR and left the BENCH polished in places. A faint 
				scent of herbs and freshly baked bread drifts in from the kitchen.
				""");
	}

	/**
	 * Add the BOOK from the room description if the Player takes it
	 */
	public void addBookToRoomDescription()
	{
		this.setDescription("""
				A cozy, well-maintained common room. A sturdy CHAIR and a worn BENCH sit nearby. Nell's 
				room is to the NORTH of you, your room to the SOUTH, a heavy wooden FRONT DOOR to the 
				WEST opens out to a courtyard, and the kitchen lies to the EAST. There is a BOOK laying 
				open on the BENCH.
				""");
		this.setExaminationDescription("""
				The common room is warm and inviting, clearly the heart of the house. Years of use have 
				smoothed the arms of the sturdy CHAIR and left the BENCH polished in places. A faint 
				scent of herbs and freshly baked bread drifts in from the kitchen. The open book on the 
				bench appears well read, its pages dog-eared and marked by frequent visitors.
				""");
	}

	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println("You are in your house's " + getRoomName() + ".\n");
		System.out.println(getExaminationDescription());
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

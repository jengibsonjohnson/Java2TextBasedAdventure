package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class FireTools extends InteractableObject
{
	private Kitchen kitchen;
	private Boolean hasBeenExamined;

	/**
	 * Default constructor
	 */
	public FireTools()
	{
		super("FIRE TOOLS","""
				A wrought-iron stand resting beside the hearth, holding a blackened POKER, a pair of 
				long TONGS, and a small SHOVEL. The handles are worn smooth from use.
				""");
	}

	/**
	 * Constructor with the Kitchen Room input to tie the room to the fire tools so 
	 * new objects can be created in the same room
	 * @param kitchen
	 */
	public FireTools(Kitchen kitchen)
	{
		this();
		this.kitchen = kitchen;
	}

	/**
	 * Override the base class examine() method
	 */
	@Override
	public void examine()
	{
		if(!hasBeenExamined)
		{
			// Create the fire tool objects
			InteractableObject poker = new InteractableObject("POKER","""
					A long, heavy wrought-iron poker with a hooked tip and a handle.
					""");
			
			InteractableObject tongs = new InteractableObject("TONGS", """
					A sturdy pair of blackened iron fire tongs, hinged near the grip so you can safely 
					lift and reposition burning wood without getting too close to the heat.
					""");
			
			InteractableObject shovel = new InteractableObject("SHOVEL", """
					A small, flat-bladed iron hearth shovel with raised edges, brushed clean and ready 
					for clearing out the grate after a fire is done.
					""");
			
			kitchen.addItem(poker);
			kitchen.addItem(tongs);
			kitchen.addItem(shovel);
			
			// Show description
			System.out.println(getDescription());

			// Set that it has been examined
			hasBeenExamined = true;
		}
		else
		{
			System.out.println(getDescription());
		}
	}
}

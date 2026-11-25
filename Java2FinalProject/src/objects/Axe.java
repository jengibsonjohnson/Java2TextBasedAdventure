package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class Axe extends InteractableObject implements Takeable, Droppable, Usable, Reusable
{
	/**
	 * Default constructor
	 */
	public Axe()
	{
		super("AXE","""
				The axe feels natural in your hands, balanced and familiar. The edge bears fresh marks"
				from recent use.
				"""
				);	
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String useMessage(Room playerCurrentRoom) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void drop() 
	{

	}

	@Override
	public String dropMessage() 
	{
		return "AXE removed from your inventory.";
	}

	@Override
	public void take() 
	{

	}

	@Override
	public String pickupMessage() 
	{
		return "AXE add to your inventory.";
	}
}



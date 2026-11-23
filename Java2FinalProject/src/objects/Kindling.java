package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

/**
 * Class for the Kindling InteractableObject
 */
public class Kindling extends InteractableObject implements Takeable, Droppable, Usable
{

	/**
	 * Default constructor
	 */
	public Kindling() 
	{
		super("KINDLING", "You can use this object to start a fire.");
//		setCanBeAddedToInventory(true);
//		setIsReusable(true);
	}

	/**
	 * (Override) Use the item
	 */
	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item)
	{
		if (currentRoom instanceof Kitchen)
		{
			System.out.println("You are in the kitchen, so you can use this item");
			return true;
		}

		else
		{
			System.out.println("You cannot use KINDLING here.");
			return false;
		}
	}

	/**
	 * Take the object and put in inventory
	 */
	@Override
	public void take()
	{

	}

	/**
	 * Message presented to player when attempting to take object
	 */
	@Override
	public String pickupMessage()
	{
		return "KINDLING add to your inventory.";
	}

	/**
	 * Drop the object and remove from inventory
	 */
	@Override	
	public void drop()
	{

	}

	/**
	 * Message presented to player when attempting to drop object
	 */
	@Override
	public String dropMessage()
	{
		return "KINDLING was removed from your inventory.";
	}

	/**
	 * Message presented to player when attempting to use object
	 */
	@Override
	public String useMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}

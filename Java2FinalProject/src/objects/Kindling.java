package objects;

import game.*;
import rooms.*;
import interfaces.*;

import java.util.List;

import enums.*;

/**
 * Class for the Kindling InteractableObject
 */
public class Kindling extends InteractableObject implements Takeable, Droppable, Usable
{
	String resultMessage = null;
	
	/**
	 * Default constructor
	 */
	public Kindling() 
	{
		super("KINDLING", "You can use this item to start a small fire.");
	}

	/**
	 * (Override) Use the item
	 */
	@Override
	public Boolean useItem(Room currentRoom, InteractableObject targetItem)
	{
		resultMessage = null;
		
		// Check if target item is null
		if (targetItem == null)
		{
			return false;
		}

		// Check if currentRoom is null
		if (currentRoom == null)
		{
			return false;
		}

		// Check that the Player is in the kitchen
		if (currentRoom instanceof Kitchen k)
		{
			// Player can only set a fire in the hearth
			if (targetItem instanceof Hearth h)
			{
				if (!h.getFireLit())
				{
					resultMessage = """
							After a few tries, you get a spark lit and a small fire starts to glow. Without 
							more fuel, it will surely burn out in a few minutes. You wonder if there is any
							FIREWOOD to feed it.
							""";
					h.setFireLit(true);
					return true;
				}
				else
				{
					resultMessage = """
							The fire is already lit in the hearth. Without more fuel, it will surely burn out
							in a few minutes. You wonder if you can find some FIREWOOD to feed it.
							""";
					return false;
				}
			}
			else 
			{
				resultMessage = "You cannot use KINDLING on " + targetItem.getName().toUpperCase();
				return false;
			}
		}
		else
		{
			return false;
		}
	}


	/**
	 * Take the object and put in inventory
	 */
	@Override
	public void take()
	{
		// No special actions
	}

	/**
	 * Message presented to player when attempting to take object
	 */
	@Override
	public String pickupMessage()
	{
		return "KINDLING addded to your inventory.";
	}

	/**
	 * Drop the object and remove from inventory
	 */
	@Override	
	public void drop()
	{
		// No special actions
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
	public String useMessage(Room playerCurrentRoom) 
	{
		return resultMessage;
	}
}
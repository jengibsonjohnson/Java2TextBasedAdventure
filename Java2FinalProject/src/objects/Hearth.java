package objects;

import interfaces.Reusable;
import interfaces.Usable;
import rooms.Kitchen;
import rooms.Room;

/**
 * Class for Hearth InteractableObejct
 */
public class Hearth extends InteractableObject implements Usable, Reusable
{

	/**
	 * Default constructor
	 */
	public Hearth()
	{
		super("HEARTH", """
				The stone hearth is cold and dark. Freshly swept and free of ASH, it looks as though 
				it hasn't been used recently.
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) 
	{
		if (currentRoom instanceof Kitchen)
		{
			System.out.println("You are in the kitchen so you can use the HEARTH");
			return true;
		}

		else
		{
			System.out.println("You cannot use HEARTH here.");
			return false;
		}
	}

	@Override
	public String useMessage() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}

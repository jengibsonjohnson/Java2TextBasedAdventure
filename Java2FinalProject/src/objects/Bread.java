package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

/**
 * Class for Bread InteractableObject 
 */
public class Bread extends InteractableObject implements Takeable, Droppable, Edible, Usable
{

	/**
	 * Default constructor
	 */
	public Bread() 
	{
		super("BREAD", """
				A freshly baked loaf of sliced BREAD with a golden crust. Its warm, inviting aroma 
				fills the kitchen.
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) 
	{
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
	public void eat() 
	{
		System.out.println(getEatMessage());
	}

	@Override
	public boolean isEaten() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getEatMessage() 
	{
		return """
				You eat a slice of bread. It is plain, hearty, and filling, though it offers no 
				restorative effects.
				""";
	}

	@Override
	public void drop() 
	{

	}

	@Override
	public String dropMessage() 
	{
		return "BREAD was removed from your inventory.";
	}

	@Override
	public void take() 
	{
		
	}

	@Override
	public String pickupMessage() 
	{
		return "BREAD was added to your inventory.";
	}

}

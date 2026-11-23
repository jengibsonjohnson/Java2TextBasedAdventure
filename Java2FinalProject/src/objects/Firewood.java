package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class Firewood extends InteractableObject implements Takeable, Droppable, Usable
{
	public Firewood()
	{
		super("FIREWOOD", """
				The logs have been split cleanly and stacked with care. Fresh snow dusts the top of 
				the pile, but not enough to conceal how recently the work was done. Somehow, you know 
				you were the one who cut them. The certainty is unsettling, as you remember none of it.
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) 
	{
		if (currentRoom instanceof Kitchen)
		{
			System.out.println("You lay the FIREWOOD in the HEARTH.");
			return true;
		}

		else
		{
			System.out.println("You cannot use FIREWOOD here.");
			return false;
		}
	}

	@Override
	public String useMessage() {
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
		return "FIREWOOD removed from your inventory.";
	}

	@Override
	public void take() 
	{

	}

	@Override
	public String pickupMessage() 
	{
		return "FIREWOOD add to your inventory.";
	}
}

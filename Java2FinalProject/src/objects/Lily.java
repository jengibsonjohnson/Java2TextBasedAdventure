package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;


public class Lily extends InteractableObject implements Takeable, Droppable, Usable
{

	public Lily() 
	{
		super("LILY", """
				A pale white lily lingering past its prime as the air turns crisp. Its petals are 
				cool to the touch and soft on your fingers.
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String useMessage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void drop() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dropMessage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void take() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pickupMessage() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}

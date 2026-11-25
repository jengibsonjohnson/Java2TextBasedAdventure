package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;


public class Rose extends InteractableObject implements Takeable, Droppable, Usable
{

	public Rose() 
	{
		super("ROSE", """
				A deep red rose holding onto the last of its color before the cold arrives. A few 
				outer petals look slightly curled at the edges, but the core is still rich and intact.
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

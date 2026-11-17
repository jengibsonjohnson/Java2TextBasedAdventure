package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class NellsBook extends InteractableObject implements Takeable, Droppable, Legible, Usable, Reusable
{
	private String pickupMessage = "You have added BOOK to your inventory";
	private String dropMessage = "You have removed BOOK from your inventory.";
	private String text = "Nell's careful script appears in the margin for a tonic of clarity: \n"
			    + "The formal texts call for nightshade, but my own trials prove a gentler hand works better. Steep \n"
			    + "three petals of a red rose alongside the pollen of a white lily. The mixture will boil violently \n"
			    + "until you temper it with a pinch of ash from the hearth. \n"
			    + "\n"
			    + "Must gather fresh kindling before attempting another batch!";
	private boolean hasBeenRead = false;
	
	public NellsBook() 
	{
		super("BOOK", "This is Nell's book of alchemy. The pages are worn and stained in places.");
		//setCanBeAddedToInventory(true);
		setIsReusable(true);
	}

	/* Take the object and put in inventory */
	@Override
	public void take()
	{

	}

	/* Message presented to player when attempting to take object */
	@Override
	public String pickupMessage()
	{
		return pickupMessage;
	}

	/* Drop the object and remove from inventory */
	@Override
	public void drop()
	{

	}

	/* Message presented to player when attempting to drop object */
	@Override
	public String dropMessage()
	{
		return dropMessage;
	}

	/* Reads the objects and marks as read */
	@Override
	public void read()
	{
		System.out.println(getText());
		hasBeenRead = true;
	}

	/* Get the text the object has to read */
	@Override
	public String getText()
	{
		return text;
	}

	/* Checks whether the object has been read */
	@Override
	public boolean hasBeenRead()
	{
		return hasBeenRead;
	}
	
	/* Use the object */
	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item)
	{	
		return true;
	}
	
	/* Message presented to player when attempting to use object */
	@Override
	public String useMessage() 
	{
		return "You used the book!";
	}
}

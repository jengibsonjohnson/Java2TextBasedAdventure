package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

/**
 * Class for Nell's Alchemy Book which is an InteractableObject
 */
public class NellsBook extends InteractableObject implements Takeable, Droppable, Legible, Usable, Reusable
{
	private CommonRoom commonRoom;
	private String pickupMessage = "You have added BOOK to your inventory";
	private String dropMessage = "You have removed BOOK from your inventory.";
	private String text = """

			You see Nell's hasty script in the margin for a TONIC of clarity:

			\tText calls for nightshade, but a gentler herb works better!
			\tSteep three petals of red ROSE, pollen of white LILY
			\tThe mixture will boil violently until you temper with a pinch of ASH.

			\tMust gather fresh KINDLING before attempting another batch!

			""";
	private boolean hasBeenRead = false;

	/**
	 * Default constructor
	 */
	public NellsBook()
	{
		super("BOOK", """
				The BOOK falls open to a recipe towards the middle. The pages crackle from being dampened
				and dried several times. You remember that Nell got this BOOK from Old Martha Whittle, 
				the local witch and alchemist.

				Nell desperately wanted to learn the healing arts since your parents died two years ago. Many
				times you would come home and find Nell studying these pages.
				""");
	}

	/**
	 * Constructor with the Common Room input to tie the room to the book
	 * @param commonRoom	Room object
	 */
	public NellsBook(CommonRoom commonRoom) 
	{
		this();
		this.commonRoom = commonRoom;
	}

	/**
	 * Take the object and put in inventory
	 */
	@Override
	public void take()
	{
		commonRoom.removeBookFromRoomDescription();
	}

	/**
	 * Message presented to player when attempting to take object
	 */
	@Override
	public String pickupMessage()
	{
		return pickupMessage;
	}

	/**
	 *  Drop the object and remove from inventory 
	 */
	@Override
	public void drop()
	{
		commonRoom.addBookToRoomDescription();
	}

	/**
	 *  Message presented to player when attempting to drop object
	 */
	@Override
	public String dropMessage()
	{
		return dropMessage;
	}

	/**
	 *  Reads the objects and marks as read 
	 */
	@Override
	public void read()
	{
		System.out.println(getText());
		hasBeenRead = true;
	}

	/** 
	 * Get the text the object has to read 
	 */
	@Override
	public String getText()
	{
		return text;
	}

	/**
	 * Checks whether the object has been read 
	 */
	@Override
	public boolean hasBeenRead()
	{
		return hasBeenRead;
	}

	/** 
	 * Use the object 
	 */
	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item)
	{	
		return true;
	}

	/** 
	 * Message presented to player when attempting to use object 
	 */
	@Override
	public String useMessage(Room playerCurrentRoom) 
	{
		return "You used the book!";
	}
}

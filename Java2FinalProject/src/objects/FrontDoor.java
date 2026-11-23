package objects;

/**
 * Class for the Front Door InteractableObject
 */
public class FrontDoor extends InteractableObject implements Openable
{
	// Variables
	private Boolean isOpen = true;

	/**
	 * Default constructor
	 */
	public FrontDoor()
	{
		super("FRONT DOOR", """
				This sturdy front door has clearly weathered many seasons. Its iron hinges are slightly
				tarnished, but the door itself remains solid and dependable.
				""");
	}

	/**
	 * Open the object
	 */
	public void open()
	{
		if(isOpen == false)
		{
			this.isOpen = true;
			System.out.println("You open the FRONT DOOR with a squeak. To the WEST, you can see the courtyard beyond.");
		}
		else
		{
			System.out.println("The FRONT DOOR is already open.");
		}
	}

	/**
	 * Close the object
	 */
	public void close()
	{
		if(isOpen == true)
		{
			this.isOpen = false;			
			System.out.println("""
					The FRONT DOOR closes with a sharp squeak of its iron hinges. The draft you felt
					previously is gone.
					""");
		}
		else
		{
			System.out.println("The FRONT DOOR is already closed.");
		}
	}

	/**
	 * Check whether the object is open or closed
	 * @return	isOpen flag
	 */
	public Boolean isOpen()
	{
		return isOpen;
	}	
}

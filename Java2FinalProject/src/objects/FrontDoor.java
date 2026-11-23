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
		super("FRONT DOOR", "The front door of your house.");
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
			System.out.println("The FRONT DOOR closes with a sharp snap. The draft you felt is gone.");
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

/**
 * Class for Nell's Journal (InteractableObject)
 */
public class Journal extends InteractableObject
{
	// Variables
	private String entryText;
	
	// Constructor
	public Journal(String objectName, String objectDescription, String text)
	{
		super(objectName, objectDescription);
		this.entryText = text;
	}
	
	/**
	 * 
	 */
	@Override
	public void examine()
	{
		System.out.println("You open the journal to its last entry:");
		System.out.println("\"" + entryText + "\"");
	}
	
	/*
	 * 
	 */
	//@Override
	//public void interact(Player player, Room currentRoom)
	//{
	//	
	//}
}

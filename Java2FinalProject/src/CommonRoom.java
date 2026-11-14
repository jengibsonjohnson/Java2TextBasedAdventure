
public class CommonRoom extends Room 
{
	// Variables
	String description;
	
	// Constructor for superclass name and this room's description
	public CommonRoom() 
	{
		super("Common Room","Common Room description");
		
		InteractableObject nellsDoor = new NellsDoor("Nell's Door", "This is the door to Nell's room.");
		InteractableObject chair = new InteractableObject("Chair","This is a chair.");
		InteractableObject bench = new InteractableObject("Bench","This is a bench.");
		InteractableObject book = new InteractableObject("Book","This is Nell's book on alchemy.");
		book.setIsReadable(true);
		book.setCanBeAddedToInventory(true);
		book.setIsReusable(true);
		
		super.addItem(nellsDoor);
		super.addItem(chair);
		super.addItem(bench);
		super.addItem(book);
	}
	
	// Getter for description of this room
	public String getDescription() 
	{
		return description;
	}
	
	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println(getRoomName());
		System.out.println(getDescription());
	}
	
	@Override
	public void onEnter(Player player, GameState state)
	{
		
	}
}

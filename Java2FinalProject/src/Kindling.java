
public class Kindling extends InteractableObject
{

	public Kindling() 
	{
		super("Kindling", "You can use this object to start a fire.");
		setCanBeAddedToInventory(true);
		setIsReusable(true);
	}
	
	/**
	 * 
	 */
	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item)
	{
		if (currentRoom instanceof Kitchen)
		{
			System.out.println("You are in the kitchen, so you can use this item");
			return true;
		}

		else
		{
			System.out.println("You are NOT in the kitchen, so you cannot use this item");
			return false;
		}
		
	}

	//@Override
	//public void interact(Player player, Room currentRoom)
	//{
	//	player.getCurrentRoom();
	//}

}

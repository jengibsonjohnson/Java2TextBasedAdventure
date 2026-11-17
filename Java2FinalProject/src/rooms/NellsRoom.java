package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

public class NellsRoom extends Room 
{
	// Constructor for superclass name and this room's description
	public NellsRoom() 
	{
		super("Nell's Room", "Nell's Room Description");
		
		InteractableObject nellsDoor = new NellsDoor("Nell's Door", "This is the door to Nell's workshop.");
		
		super.addItem(nellsDoor);
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

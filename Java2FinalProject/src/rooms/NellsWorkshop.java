package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

public class NellsWorkshop extends Room 
{
	// Constructor for superclass name and this room's description
	public NellsWorkshop() 
	{
		super("Nell's Workshop", "Nell's workshop description");
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

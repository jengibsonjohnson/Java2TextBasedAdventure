package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

/**
 * Class for Nell's Workshop, a Room a Player can enter and interact with
 */
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
	
	/**
	 * Override method for what happens when a player enters the room
	 */
	@Override
	public void onEnter(Player player, GameState state)
	{
		
	}
}

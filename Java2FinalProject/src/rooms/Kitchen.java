package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;
/**
 * Class for the Kitchen (Room)
 */
public class Kitchen extends Room 
{
	// Constructor for superclass name and this room's description
	public Kitchen() 
	{
		super("Kitchen", "Kitchen description");
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
	
	/*
	 * 
	 */
	@Override
	public void onEnter(Player player, GameState state)
	{
		
	}
}

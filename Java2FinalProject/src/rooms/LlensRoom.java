package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

public class LlensRoom extends Room
{
	// Variables
	
	// Constructor for superclass name and this room's description
	public LlensRoom() 
	{
		super("Llen's Room", "Llen's room description");
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

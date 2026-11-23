package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

/**
 * Class for Llen's (Player's) Room, a Room a Player can enter and interact with
 */
public class LlensRoom extends Room
{
	// Variables
	
	// Constructor for superclass name and this room's description
	public LlensRoom() 
	{
		super("Llen's Room", "Llen's room description","Llen's reeom examination");
	}
	
	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println(getRoomName());
		System.out.println(getExaminationDescription());
	}
	
	/**
	 * Override method for what happens when a player enters the room
	 */
	@Override
	public void onEnter(Player player, GameState state)
	{
		
	}
}

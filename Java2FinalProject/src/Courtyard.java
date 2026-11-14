
public class Courtyard extends Room 
{
	// Variables
	String description;
	
	// Constructor for superclass name and this room's description
	public Courtyard() 
	{
		super("Courtyard", "Courtyard description");
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

/**
 * Class for the Kitchen (Room)
 */
public class Kitchen extends Room 
{
	// Variables
	String description;
	
	// Constructor for superclass name and this room's description
	public Kitchen(String roomDescription) 
	{
		super("Kitchen");
		this.description = roomDescription;
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
}

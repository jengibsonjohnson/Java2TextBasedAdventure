/**
 * Abstract Class for Room
 * Making Room an abstract class with an abstract examine() method requires
 * instances to define its own text upon examination
 */

public abstract class Room 
{
	// Variables
	protected String roomName;
	
	// Constructor
	public Room (String name)
	{
		this.roomName = name;
	}
	
	// Getter for room name
	public String getRoomName()
	{
		return roomName;
	}
	
	/**
	 * Abstract method to force child class to define its own description upon examination
	 */
	public abstract void examine();
	{
		
	}

}

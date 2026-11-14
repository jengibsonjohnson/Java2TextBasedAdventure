import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Abstract Class for Room
 * Making Room an abstract class with an abstract examine() method requires
 * instances to define its own text upon examination
 */
public abstract class Room 
{
	// Variables
	protected String roomName;
	private String roomDescription;
	private Map<String, Room> exits;
	private Inventory itemList;
	
	// Constructor
	public Room (String name, String description)
	{
		this.roomName = name;
		this.roomDescription = description;
		this.exits = new HashMap<>();
		this.itemList = new Inventory();
	}
	
	// Getters and Setters
	public String getRoomName()
	{
		return roomName;
	}
	
	public String getDescription() 
	{
        return roomDescription;
    }
	
    public Room getExit(String direction) 
    {
        return exits.get(direction.toUpperCase());
    }
	
	public void setExit(String direction, Room neighbor) 
	{
        exits.put(direction.toUpperCase(), neighbor);
    }

	// Get the current inventory for the Player
	public List<InteractableObject> getInventory()
	{
		return itemList.getInventory();
	}

	// Add item to room inventory
	public void addItem(InteractableObject item)
	{
		itemList.addItem(item);
	}

	// Remove item from room inventory
	public void removeItem(InteractableObject item)
	{
		itemList.removeItem(item);
	}

	// Check to see if room has an object
	public Boolean hasItem(String name) 
	{
		return itemList.hasItem(name);
	}
	
	// Search the room inventory/item list
	public InteractableObject searchInventory(String name)
	{
		return itemList.searchInventory(name);
	}
	
	
	/**
	 * Abstract method: Every room must define its own description upon examination
	 */
	public abstract void examine();

	
	/**
     * Abstract method: Every room must define what happens when the player enters
	 */
    public abstract void onEnter(Player player, GameState state);


}

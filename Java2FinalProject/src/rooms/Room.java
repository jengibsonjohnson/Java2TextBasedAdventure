package rooms;

import enums.*;
import game.*;
import interfaces.*;
import objects.*;

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
	private String roomDescription;			// general room description on entering
	private String examinationDescription;	// further details when Player examines the room
	private Map<String, Room> exits;
	private Inventory itemList;
	
	/**
	 * Default constructor for the Room object
	 * @param name			the name of the room
	 * @param description	the base description for the room when the Player enters/examines
	 */
	public Room (String name, String description, String examine)
	{
		this.roomName = name;
		this.roomDescription = description;
		this.examinationDescription = examine;
		this.exits = new HashMap<>();
		this.itemList = new Inventory();
	}
	
	/**
	 * Get the room name
	 * @return	roomName
	 */
	public String getRoomName()
	{
		return roomName;
	}
	
	/**
	 * Get the room description
	 * @return	description
	 */
	public String getDescription() 
	{
        return roomDescription;
    }
	
	/**
	 * Get the examination description text
	 * @return
	 */
	public String getExaminationDescription()
	{
		return examinationDescription;
	}
	
	/**
	 * Get if an exit exists for a Room in a given direction
	 * @param direction		which direction the Player wants to go
	 * @return				what Room is in that direction, if any
	 */
    public Room getExit(String direction) 
    {
        return exits.get(direction.toUpperCase());
    }
    
    /**
     * Set a new description for a room
     * @param newDescription
     */
    public void setDescription(String newDescription)
    {
    	this.roomDescription = newDescription;
    }
    
    /**
     * Set a new examination description for a room
     * @param newDescription
     */
    public void setExaminationDescription (String newDescription)
    {
    	this.examinationDescription = newDescription;
    }
	
    /**
     * Set the exits for a Room
     * @param direction		which direction
     * @param neighbor		what Room is in that direction, if any
     */
	public void setExit(String direction, Room neighbor) 
	{
        exits.put(direction.toUpperCase(), neighbor);
    }

	/**
	 * Get the current inventory for the Player
	 * @return 	the list
	 */
	public List<InteractableObject> getInventory()
	{
		return itemList.getInventory();
	}

	/**
	 * Add item to room inventory
	 * @param item		item to add
	 */
	public void addItem(InteractableObject item)
	{
		itemList.addItem(item);
	}

	/**
	 * Remove item from room inventory
	 * @param item		item to remove
	 */
	public void removeItem(InteractableObject item)
	{
		itemList.removeItem(item);
	}

	/**
	 * Check to see if the room has a given object
	 * @param name		item to search for
	 * @return			whether that object exists
	 */
	public Boolean hasItem(String name) 
	{
		return itemList.hasItem(name);
	}
	
	/**
	 * Search the room inventory/item list
	 * @param name		item to search for
	 * @return			the InteractableObject matching that name
	 */
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

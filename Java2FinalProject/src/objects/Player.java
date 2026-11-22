package objects;
import game.*;
import rooms.*;
import interfaces.*;
import enums.*;
import java.util.List;

/**
 * Class for the Player
 */
public class Player 
{
	// Variables
	private Room currentRoom;
	private Inventory inventory;

	/**
	 * Default constructor
	 * @param startingRoom	the room they start in
	 */
	public Player(Room startingRoom)
	{
		this.currentRoom = startingRoom;
		this.inventory = new Inventory();
		
		// Add starting inventory
		inventory.addItem(new Kindling());
	}

	/**
	 * Get the Player's current room/location
	 * @return	the Room they are in
	 */
	public Room getCurrentRoom()
	{
		return currentRoom;
	}

	/**
	 * Set the current room/location
	 * @param newRoom	the Room they are going to
	 */
	public void setCurrentRoom(Room newRoom)
	{
		this.currentRoom = newRoom;
	}

	/**
	 * Get the current inventory for the Player
	 * @return	the Inventory List
	 */
	public List<InteractableObject> getInventory()
	{
		return inventory.getInventory();
	}
	
	/**
	 * Display the inventory
	 */
	public void displayPlayerInventory()
	{
		System.out.println("======Inventory======");

		// show the player's current inventory
		for (InteractableObject item : this.getInventory())
		{
			System.out.println("* " + item.getName().toString());
		}

		System.out.println("=====================");
	}

	/**
	 * Add item to inventory
	 * @param item		item to add
	 */
	public void addItem(InteractableObject item)
	{
		inventory.addItem(item);
	}

	/**
	 * Remove item from inventory
	 * @param item		item to remove
	 */
	public void removeItem(InteractableObject item)
	{
		inventory.removeItem(item);
	}

	/**
	 * Check to see if Player has an object
	 * @param name		object to search for
	 * @return			bool for if they have that object
	 */
	public Boolean hasItem(String name) 
	{
		return inventory.hasItem(name);
	}
	
	/**
	 * Search the inventory for an item by name
	 * @param name		object to search for
	 * @return			InteractableObject 
	 */
	public InteractableObject searchInventory(String name)
	{
		return inventory.searchInventory(name);
	}
	
}

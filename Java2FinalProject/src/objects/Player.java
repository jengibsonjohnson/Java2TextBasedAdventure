package objects;
import game.*;
import rooms.*;
import interfaces.*;
import enums.*;
import java.util.List;

public class Player 
{
	// Variables
	private Room currentRoom;
	private Inventory inventory;

	public Player(Room startingRoom)
	{
		this.currentRoom = startingRoom;
		this.inventory = new Inventory();
		
		// Add starting inventory
		inventory.addItem(new Kindling());
	}

	// Get the Player's current room/location
	public Room getCurrentRoom()
	{
		return currentRoom;
	}

	// Set the current room/location
	public void setCurrentRoom(Room newRoom)
	{
		this.currentRoom = newRoom;
	}

	// Get the current inventory for the Player
	public List<InteractableObject> getInventory()
	{
		return inventory.getInventory();
	}
	
	// List inventory
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

	// Add item to inventory
	public void addItem(InteractableObject item)
	{
		inventory.addItem(item);
	}

	// Remove item from inventory
	public void removeItem(InteractableObject item)
	{
		inventory.removeItem(item);
	}

	// Check to see if Player has an object
	public Boolean hasItem(String name) 
	{
		return inventory.hasItem(name);
	}
	
	public InteractableObject searchInventory(String name)
	{
		return inventory.searchInventory(name);
	}
	
}

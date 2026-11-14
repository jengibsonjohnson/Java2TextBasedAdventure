package objects;
import java.util.ArrayList;
import java.util.List;

public class Inventory 
{
	private List<InteractableObject> itemList;

	public Inventory()
	{
		this.itemList = new ArrayList<>();
	}
	
	// Add item to inventory
	public void addItem(InteractableObject item)
	{
		itemList.add(item);
	}

	// Remove item from inventory
	public void removeItem(InteractableObject item)
	{
		itemList.remove(item);
	}
	
	// Get the current inventory for the Player
	public List<InteractableObject> getInventory()
	{
		return itemList;
	}

	// Check to see if an inventory has an object
	public Boolean hasItem(String name) 
	{
		return itemList.stream().anyMatch(item -> item.getName().equalsIgnoreCase(name));
	}
	
	// Search the inventory by keyword and return the object
	public InteractableObject searchInventory(String name)
	{
		return getInventory().stream().filter(item -> item.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}

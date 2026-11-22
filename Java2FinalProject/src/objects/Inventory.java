package objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for the Inventory. Both the Player and Rooms can have an Inventory
 */
public class Inventory 
{
	private List<InteractableObject> itemList;

	/**
	 * Default constructor
	 */
	public Inventory()
	{
		this.itemList = new ArrayList<>();
	}
	
	/**
	 * Add item to inventory
	 * @param item		item to add
	 */
	public void addItem(InteractableObject item)
	{
		itemList.add(item);
	}

	/**
	 * Remove item from inventory
	 * @param item		item to remove
	 */
	public void removeItem(InteractableObject item)
	{
		itemList.remove(item);
	}
	
	/**
	 * Get the current inventory for the Player
	 * @return		inventory List<InteractableObject>
	 */
	public List<InteractableObject> getInventory()
	{
		return itemList;
	}

	/**
	 * Check to see if an inventory has an object
	 * @param name
	 * @return
	 */
	public Boolean hasItem(String name) 
	{
		return itemList.stream().anyMatch(item -> item.getName().equalsIgnoreCase(name));
	}
	
	/**
	 * Search the inventory by keyword and return the object
	 * @param name
	 * @return
	 */
	public InteractableObject searchInventory(String name)
	{
		return getInventory().stream().filter(item -> item.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
}

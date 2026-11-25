package objects;

import interfaces.Reusable;
import interfaces.Usable;
import rooms.Kitchen;
import rooms.Room;

/**
 * Class for Hearth InteractableObejct
 */
public class Hearth extends InteractableObject implements Usable, Reusable
{

	private Boolean fireLit = false;
	private Boolean woodAdded = false;
	private Boolean ashesCreated = false;
	
	/**
	 * Default constructor
	 */
	public Hearth()
	{
		super("HEARTH", """
				The stone hearth is cold and dark. Freshly swept and free of ASH, it looks as though 
				it hasn't been used recently.
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) 
	{
		if (currentRoom instanceof Kitchen)
		{
			System.out.println("You are in the kitchen so you can use the HEARTH");
			return true;
		}

		else
		{
			System.out.println("You cannot use HEARTH here.");
			return false;
		}
	}

	@Override
	public String useMessage(Room playerCurrentRoom) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Get flag that the fire was lit
	 * @return
	 */
	public Boolean getFireLit()
	{
		return fireLit;
	}
	
	/**
	 * Get flag that wood was added to fire
	 * @return
	 */
	public Boolean getWoodAdded()
	{
		return woodAdded;
	}
	
	/**
	 * Get the flag that ashes were created
	 * @return
	 */
	public Boolean getAshesCreated()
	{
		return ashesCreated;
	}
	
	/**
	 * Set flag that the fire was lit
	 * @param fireLit
	 */
	public void setFireLit(Boolean fireLit)
	{
		this.fireLit = fireLit;
	}
	
	/**
	 * Set flag that wood was added to fire
	 * @param woodAdded
	 */
	public void setWoodAdded(Boolean woodAdded)
	{
		this.woodAdded = woodAdded;
	}
	
	/**
	 * Set the flag that ashes were created
	 * @param ashesCreated
	 */
	public void setAshesCreated(Boolean ashesCreated)
	{
		this.ashesCreated = ashesCreated;
	}
}

package objects;

import enums.*;
import game.*;
import interfaces.*;
import rooms.*;

/**
 * Class for Nell's Door, which is an InteractableObject
 */
public class NellsDoor extends InteractableObject implements Lockable
{
	/* Variables */
	private boolean isLocked;
	private String keyName = "Nell's Key";

	/*
	 * Constructor
	 * @param name			the name of the object
	 * @param description	the description
	 */
	public NellsDoor(String name, String description) 
	{
		super(name, description);
		this.lock();
	}

	/**
	 * Lock the object 
	 */
	@Override
	public void lock()
	{
		this.isLocked = true;
	}

	/** 
	 * Check the current locked state of the object 
	 */
	@Override
	public boolean isLocked()
	{
		return this.isLocked;
	}

	/** 
	 * Method to handle unlocking an object with specific item/key 
	 */
	@Override
	public boolean unlock(InteractableObject key)
	{
		// Check if correct key was provided
		if (key != null && key.getName().equalsIgnoreCase(keyName))
		{
			// Unlock the door
			this.isLocked = false;

			// Display successful message to player
			System.out.println("You unlock " + getName() + " with " + key.getName());
			return true;
		}
		else
		{
			// Display unsuccessful message to player
			System.out.println("That key does not fit " + getName());
			return false;
		}
	}

	/** 
	 * Message presented to player when attempting to interact with locked object 
	 */
	@Override
	public String getLockedMessage()
	{
		return getName() + " is firmly locked. You'll need to find a way to unlock it.";
	}
}

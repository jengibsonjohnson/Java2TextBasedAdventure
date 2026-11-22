package interfaces;

import enums.*;
import game.*;
import rooms.*;
import objects.*;

/**
 * Takeable Interface, indicates that an object can be added to the Player inventory 
 */
public interface Takeable 
{
	/** 
	 * Take the object and put in inventory 
	 */
	public void take();
	
	/** 
	 * Message presented to player when attempting to take object 
	 */
	public String pickupMessage();
}

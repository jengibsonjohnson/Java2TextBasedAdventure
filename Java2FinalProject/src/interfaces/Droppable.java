package interfaces;

import enums.*;
import game.*;
import rooms.*;
import objects.*;

/**
 * Droppable Interface, indicates that an object can be dropped
 */
public interface Droppable 
{
	/**
	 * Drop the object and remove from inventory 
	 */
	public void drop();
	
	/** 
	 * Message presented to player when attempting to drop object 
	 */
	public String dropMessage();
}

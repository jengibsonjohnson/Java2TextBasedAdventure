package interfaces;

import enums.*;
import game.*;
import rooms.*;
import objects.*;

/**
 * Legible Interface, indicates whether an object can be read
 */
public interface Legible 
{
	/** 
	 * Reads the objects and marks as read 
	 */
	public void read();
	
	/** 
	 * Get the text the object has to read 
	 */
	public String getText();
	
	/** 
	 * Checks whether the object has been read 
	 */
	public boolean hasBeenRead();
	
}

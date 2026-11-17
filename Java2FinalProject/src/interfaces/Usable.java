package interfaces;

import enums.*;
import game.*;
import rooms.*;
import objects.*;

public interface Usable 
{	
	/* Use the object, return true if successfully used */
	public Boolean useItem(Room currentRoom, InteractableObject item);
	
	/* Message presented to player when attempting to use object */
	public String useMessage();
	
}

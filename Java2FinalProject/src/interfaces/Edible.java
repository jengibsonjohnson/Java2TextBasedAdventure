package interfaces;

import enums.*;
import game.*;
import rooms.*;
import objects.*;

public interface Edible 
{
	/* Eat the item */
	public void eat();
	
	/* Check the current eaten status of the item */
	public boolean isEaten();
	
	/* Message presented to player when eating the item */
	public String getEatMessage();
}

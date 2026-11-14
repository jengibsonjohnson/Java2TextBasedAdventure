package game;

import enums.*;
import rooms.*;
import interfaces.*;
import objects.*;

/*
 * 2.4. Use of the Immutable Object pattern. This implementation is efficient because the object never changes after 
 * instantiation. The helper text is never going to change and requires no methods to update it. There is a tradeoff 
 * if, somehow at some point, I would want to recreate or otherwise update the Helper text (such as new unlocked 
 * abilities for the Player), but for this implementation, it is a safe, reliable way to store the helper text.
 */

public final class Helper 
{
	private final String helpText;
	
	/* Constructor */
	public Helper(String text)
	{
		this.helpText = text;
	}
	
	/* Get helper text */
	public String getHelpText()
	{
		return helpText;
	}
	
	/* Display help text */
	public void displayHelpText()
	{
		System.out.println(helpText);
	}
}

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

/**
 * Class for In-game Helper
 */
public final class Helper 
{
	private final String helpText;

	/**
	 * Default constructor 
	 */
	public Helper()
	{
		this.helpText = """
				
				======Help Menu======
				
				Most common commands are:
				ACTION + OBJECT
				
				Example:
				\tGO NORTH
				\tTAKE KEY
				\tREAD LETTER
				\tOPEN DOOR
				
				Available commands
				---------------------
				CLOSE\t\t- Close an object
				DRINK\t\t- Drink a liquid
				DROP\t\t- Drop an item from inventory
				EAT\t\t- Eat a food item
				EXAMINE\t\t- Examine an object more closely
				GO\t\t- Move to another location
				OPEN\t\t - Open an object
				READ\t\t- Read an object
				TAKE\t\t- Add an item to your inventory
				USE\t\t- Use an item

				Single-word commands
				---------------------
				HELP\t\t- Display this help menu
				INVENTORY\t- View your current inventory
				QUIT\t\t- Exit the game
				
				=====================
				""";
	}

	/** 
	 * Get helper text 
	 */
	public String getHelpText()
	{
		return helpText;
	}

	/**
	 *  Display help text 
	 */
	public void displayHelpText()
	{
		System.out.println(helpText);
	}
}

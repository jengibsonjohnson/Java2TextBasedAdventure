package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

/**
 * Class for the Courtyard, a Room a Player can enter and interact with
 */
public class Courtyard extends Room 
{
	/*
	 * Constructor for superclass name and this room's description, generates all the objects in the room
	 */
	public Courtyard() 
	{
		super("Courtyard", """
				You feel the air change and the temperature drop significantly as you step out into 
				the courtyard. You feel a early winter storm coming soon. Barely visible snowflakes
				swirl in the breeze.  
				""",
				"""
				Against a large oak tree, you see a stack of FIREWOOD and an AXE. 

				That's right, you remember you were chopping wood before... There isn't much accumulated 
				snow on these items, so you guess it's been only a handful of hours.

				You don't see any footprints other than your own.
				""");

		InteractableObject axe = new Axe();
		InteractableObject firewood = new Firewood();
		
		super.addItem(axe);
		super.addItem(firewood);
	}

	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println("You are in your house's " + getRoomName() + ". Your FRONT DOOR is to the east.\n");
		System.out.println(getExaminationDescription());
	}

	/**
	 * Override method for what happens when a player enters the room
	 */
	@Override
	public void onEnter(Player player, GameState state)
	{

	}
}

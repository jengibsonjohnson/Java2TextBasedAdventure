package rooms;
import game.*;
import objects.*;
import interfaces.*;
import enums.*;

/**
 * Class for the Kitchen, a Room a Player can enter and interact with
 */
public class Kitchen extends Room 
{
	// Constructor for superclass name and this room's description
	public Kitchen() 
	{
		super("KITCHEN", "Kitchen description","""
				The kitchen holds the faint scent of fresh bread and burning firewood. A sturdy TABLE 
				surrounded by several CHAIRS occupies the center of the room. A loaf of BREAD rests 
				beside a worn CUTTING BOARD and a sharp KNIFE. A VASE of fresh FLOWERS brightens the 
				space. To one side, a stone HEARTH is unlit and swept clean. The HEARTH supports a 
				blackened COOKING POT, while a set of FIRE TOOLS hangs within easy reach.
				""");
		
		InteractableObject table = new InteractableObject("TABLE", """
				A solid wooden table scarred by years of meals, conversations, and daily work. Despite 
				the scratches and stains, it remains sturdy and well cared for.
				""");
		
		InteractableObject chairs = new InteractableObject("CHAIRS", """
				Several simple wooden chairs surround the table. Though plain, they appear comfortable 
				enough for long meals and friendly gatherings.
				""");
		
		InteractableObject bread = new Bread();
		
		InteractableObject cuttingBoard = new InteractableObject("CUTTING BOARD", """
				A thick wooden cutting board marked by countless knife cuts. Years of use have left 
				its surface worn but functional.
				""");
		
		// Hearth
		
		// Flowers
		
		// Cooking Pot
		
		// Fire Tools
		
		
		super.addItem(table);
		super.addItem(chairs);
		super.addItem(bread);
		super.addItem(cuttingBoard);
	}
	
	/**
	 * Override method for examining this room
	 */
	@Override
	public void examine()
	{
		System.out.println(getRoomName());
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

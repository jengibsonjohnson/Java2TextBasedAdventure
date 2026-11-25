package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class CookingPot extends InteractableObject implements Usable, Reusable
{
	public CookingPot()
	{
		super("COOKING POT","""
				
				""");
	}

	@Override
	public Boolean useItem(Room currentRoom, InteractableObject item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String useMessage(Room playerCurrentRoom) {
		// TODO Auto-generated method stub
		return null;
	}
}

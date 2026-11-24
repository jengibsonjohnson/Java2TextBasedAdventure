package objects;

import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

public class Flowers extends InteractableObject
{
	// Variables
	private Kitchen kitchen;
	private Boolean hasBeenExamined;

	/**
	 * Default constructor
	 */
	public Flowers() 
	{
		super("FLOWERS","""
				A small, fragrant bouquet of the last surviving blooms before the winter sets in. 
				Nestled in the greenery, you spot a velvety red ROSE, a cluster of SAGE, a delicate 
				white LILY, and the slender petals of a cream-colored DAISY.
				""");
		this.hasBeenExamined = false;
	}

	/**
	 * Constructor with the Kitchen Room input to tie the room to the flowers so 
	 * new objects can be created in the same room
	 * @param kitchen
	 */
	public Flowers(Kitchen kitchen)
	{
		this();
		this.kitchen = kitchen;
	}

	/**
	 * Override the base class examine() method
	 */
	@Override
	public void examine()
	{
		if(!hasBeenExamined)
		{
			// Create the new flower objects
			InteractableObject daisy = new InteractableObject("DAISY","""
					A handful of daisies with elongated white petals and a butter-yellow center.
					""");

			InteractableObject sage = new InteractableObject("SAGE","""
					A bundle of late-season sage with silvery-green leaves toughened by the 
					approaching cold. Crushing a leaf releases a sharp, earthy scent.
					""");

			Rose rose = new Rose();
			Lily lily = new Lily();

			kitchen.addItem(daisy);
			kitchen.addItem(sage);
			kitchen.addItem(rose);
			kitchen.addItem(lily);

			// Show description
			System.out.println(getDescription());

			// Set that it has been examined
			hasBeenExamined = true;
		}
		else
		{
			System.out.println(getDescription());
		}
	}
}

package objects;
import game.*;
import rooms.*;
import interfaces.*;
import enums.*;

/**
 * Base class for InteractableObject
 */
public class InteractableObject 
{
	// Variables
	private String name;
	private String description;
//	private boolean canBeAddedToInventory;
//	private boolean isReusable;
//	private boolean isReadable;
//	private boolean isEdible;

	/**
	 * Default constructor for InteractaleObject
	 * @param objectName			the name of the object
	 * @param objectDescription		the description of the object
	 */
	public InteractableObject(String objectName, String objectDescription)
	{
		//, Boolean canBePickedUp, Boolean objectIsReusable, Boolean objectCanBeRead, Boolean objectEdible
		this.name = objectName;
		this.description = objectDescription;
//		this.canBeAddedToInventory = false;
//		this.isReusable = false;
//		this.isReadable = false;
//		this.isEdible = false;
	}

	/**
	 * Get the name of the object
	 * @return	the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Get the description of the object
	 * @return	the description
	 */
	public String getDescription()
	{
		return description;
	}

//	/* */
//	public boolean getCanBeAddedToInventory()
//	{
//		return canBeAddedToInventory;
//	}
//
//	/* */
//	public boolean getIsReusable()
//	{
//		return isReusable;
//	}
//
//	/* */
//	public boolean getIsReadable()
//	{
//		return isReadable;
//	}
//
//	/* */
//	public boolean getIsEdible()
//	{
//		return isEdible;
//	}

	/**
	 * Set the name of the object
	 * @param objectName
	 */
	public void setName(String objectName)
	{
		this.name = objectName;
	}

	/**
	 * Set the description of the object
	 * @param objectDescription
	 */
	public void setDescription(String objectDescription)
	{
		this.description = objectDescription;
	}

//	/* */
//	public void setCanBeAddedToInventory(Boolean value)
//	{
//		this.canBeAddedToInventory = value;
//	}
//
//	/* */
//	public void setIsReusable(Boolean value)
//	{
//		this.isReusable = value;
//	}
//
//	/* */
//	public void setIsReadable(Boolean value)
//	{
//		this.isReadable = value;
//	}
//
//	/* */
//	public void setIsEdible(Boolean value)
//	{
//		this.isEdible = value;
//	}

	/**
	 * Method that will print the object's description when the object is examined
	 */
	public void examine()
	{
		System.out.println(this.description);
	}
}

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

	/**
	 * Method that will print the object's description when the object is examined
	 */
	public void examine()
	{
		System.out.println(this.description);
	}
}

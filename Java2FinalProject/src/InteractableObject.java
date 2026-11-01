/**
 * 
 */
public abstract class InteractableObject 
{
	// Variables
	private String name;
	
	// Getter
	public String getName()
	{
		return name;
	}
	
	// Constructor
	public InteractableObject(String objectName)
	{
		this.name = objectName;
	}
	
	/**
	 * 
	 */
	public abstract void examine();
	{
		
	}
}

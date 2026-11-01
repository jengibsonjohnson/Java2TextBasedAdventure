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
	 * Adding some notes that I will revert later through git
	 */
	public abstract void examine();
	{
		
	}
}

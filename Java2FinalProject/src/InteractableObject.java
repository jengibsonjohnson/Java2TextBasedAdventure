/**
 * 
 */
public class InteractableObject 
{
	// Variables
	private String name;
	private String description;
	private boolean canBeAddedToInventory;
	private boolean isReusable;
	private boolean isReadable;
	private boolean isEdible;
//	private boolean isLocked;
//	private InteractableObject key;
	
	/*
	 * Constructor
	 */
	public InteractableObject(String objectName, String objectDescription)
	{
		//, Boolean canBePickedUp, Boolean objectIsReusable, Boolean objectCanBeRead, Boolean objectEdible
		
		this.name = objectName;
		this.description = objectDescription;
		this.canBeAddedToInventory = false;
		this.isReusable = false;
		this.isReadable = false;
		this.isEdible = false;
//		this.isLocked = true;
//		this.key = requiredKey;
	}
	
	/*
	 * 
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * 
	 */
	public String getDescription()
	{
		return description;
	}
	
	/*
	 * 
	 */
	public boolean getCanBeAddedToInventory()
	{
		return canBeAddedToInventory;
	}
	
	/*
	 * 
	 */
	public boolean getIsReusable()
	{
		return isReusable;
	}
	
	/*
	 * 
	 */
	public boolean getIsReadable()
	{
		return isReadable;
	}
	
	/*
	 * 
	 */
	public boolean getIsEdible()
	{
		return isEdible;
	}
		
//	/*
//	 * 
//	 */
//	public boolean getIsLocked()
//	{
//		return isLocked;
//	}
//	
	/*
	 * 
	 */
	public void setName(String objectName)
	{
		this.name = objectName;
	}
	
	/*
	 * 
	 */
	public void setDescription(String objectDescription)
	{
		this.description = objectDescription;
	}
	
	/**
	 * 
	 */
	public void setCanBeAddedToInventory(Boolean value)
	{
		this.canBeAddedToInventory = value;
	}
	
	/**
	 * 
	 */
	public void setIsReusable(Boolean value)
	{
		this.isReusable = value;
	}
	
	/**
	 * 
	 */
	public void setIsReadable(Boolean value)
	{
		this.isReadable = value;
	}
	
	/**
	 * 
	 */
	public void setIsEdible(Boolean value)
	{
		this.isEdible = value;
	}
	
//	/*
//	 * 
//	 */
//	public void setIsLocked(Boolean value)
//	{
//		this.isLocked = value;
//	}
//	
//	/*
//	 * 
//	 */
//	public void setRequiredKey(InteractableObject requiredKey)
//	{
//		this.key = requiredKey;
//	}
	
	/**
	 * 
	 */
	public void examine()
	{
		System.out.println(this.description);
	}
	
	/**
	 * 
	 */
	public Boolean useItem(Room currentRoom, InteractableObject item)
	{
		// TODO
		return true;
	}
	
	/*
	 * 
	 */
	//public abstract void interact(Player player, Room currentRoom);
}

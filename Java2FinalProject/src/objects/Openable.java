package objects;

/**
 * Openable Interface, indicated that an object can be opened or closed
 */
public interface Openable 
{
	/**
	 * Open the object
	 */
	public void open();
	
	/**
	 * Close the object
	 */
	public void close();
	
	/**
	 * Check whether the object is open or closed
	 * @return	isOpen flag
	 */
	public Boolean isOpen();
	
}

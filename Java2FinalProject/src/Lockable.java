/*
 * 1.2. Polymorphic class structure with use of parent classes and interfaces
 */
public interface Lockable 
{
	/* Lock the object */
	public void lock();

	/* Check the current locked state of the object */
	public boolean isLocked();

	/* Method to handle unlocking an object with specific item/key */
	public boolean unlock(InteractableObject key);

	/* Message presented to player when attempting to interact with locked object */
	public String getLockedMessage();
}

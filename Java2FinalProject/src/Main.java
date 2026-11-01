import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */
public class Main 
{
	// Instantiate Logging Object to be used by the class
	final static Logger log = 
			LogManager.getLogger();
	
	public static void main(String[] args) 
	{
		try 
		{
			//Instantiate the Journal (InteractableObject)
			InteractableObject nellsJournal = new Journal(
					"Nell's Journal",
					"Llen must never know."
				);
			
			nellsJournal.examine();
			
			//Instantiate the Kitchen (Room)
			Kitchen homeKitchen = new Kitchen("This is the description of the kitchen.");
			
			homeKitchen.examine();
		}
		catch (Exception ex)
		{
			log.debug("Hello World!");
			
		}
		finally 
		{
			log.info("Hello World, Again!");
			log.warn("Application warning");
			log.error("Something wrong happened");
		}
	}
}

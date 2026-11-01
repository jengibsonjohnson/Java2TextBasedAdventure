/**
 * 
 */
public class Main 
{
	public static void main(String[] args) 
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
}

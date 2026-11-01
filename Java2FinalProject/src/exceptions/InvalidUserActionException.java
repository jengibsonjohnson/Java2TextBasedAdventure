package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InvalidUserActionException extends Exception 
{
	// Default Constructor
		public InvalidUserActionException() {
			super();
		}
		
		// Additional Constructor to handle specific error
		public InvalidUserActionException(Exception e) {
			super(e);
		}
		
		// Customize error
		public InvalidUserActionException(String message) {
			super(message);
		}
}

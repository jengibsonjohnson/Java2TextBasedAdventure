package game;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

import enums.*;
import rooms.*;
import interfaces.*;
import objects.*;

/**
 * Handles time-of-day evaluation and localized text for the game.
 */
public class GameState 
{
	/**
     * Get the correct localized greeting that matches the given time
     *
     * @param locale      the locale used to select the resource bundle
     * @param currentTime the time of day evaluated
     */
	public static void getGreeting(Locale locale, LocalTime currentTime)
	{
		if (!currentTime.isAfter(LocalTime.of(6, 0, 0)))
		{
			getLocalizedText(locale, "EarlyMorning");
		}
		else if (!currentTime.isAfter(LocalTime.of(11, 59, 59)))
		{
			getLocalizedText(locale, "Morning");
		}
		else if (!currentTime.isAfter(LocalTime.of(12, 59, 59)))
		{
			getLocalizedText(locale, "Noon");
		}
		else if (!currentTime.isAfter(LocalTime.of(20, 59, 59)))
		{
			getLocalizedText(locale, "Afternoon");
		}
		else
		{
			getLocalizedText(locale, "Evening");
		}
	}
	
	/**
     * Loads the resource bundle for the specified locale, looks up the message key,
     * and prints the resulting text to standard output.
     *
     * @param locale the target locale for bundle
     * @param key    the key corresponding to the message
	 */
	public static void getLocalizedText(Locale locale, String key)
	{
		ResourceBundle rb = ResourceBundle.getBundle("Game", locale);
		
		System.out.println(rb.getString(key));
	}
	
	/**
     * Test helper method that accepts a time and locale to verify text output.
     *
     * @param currentTime the simulated time to test
     * @param locale      the locale to test against the resource bundle
     */
    public static void testGreeting(Locale locale, LocalTime currentTime) 
    {
        System.out.println("Testing time = " + currentTime + " & locale = " + locale);
        
        getGreeting(locale, currentTime);
    }
}

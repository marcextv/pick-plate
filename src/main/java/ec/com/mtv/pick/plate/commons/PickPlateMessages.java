package ec.com.mtv.pick.plate.commons;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Load Pick & Plate properties files.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public final class PickPlateMessages {
	
	/**
	 * Instance of class.
	 */
	private static final PickPlateMessages INSTANCE = new PickPlateMessages();
	
	/**
	 * Bundle property.
	 */
	private final ResourceBundle resourceBundle;
	
	/**
	 * Bundle file name.
	 */
	private static final String BUNDLE_NAME = "ec.com.mtv.pick.plate.resources.pickplate";
	
	/**
	 * Empty constructor.
	 */
	private PickPlateMessages() {
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
	}
	
	
	/**
	 * @return the instance
	 */
	public static PickPlateMessages getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Returns a string message
	 * 
	 * @param key of parameter
	 * @param placeHolders additional arguments as location
	 * @return the message data
	 */
	public String getMessageForKey(String key, Object... placeHolders) {
		try {
			String value = resourceBundle.getString(key);
			if (placeHolders.length > 0) {
				return MessageFormat.format(value, placeHolders);
			}

			return value;

		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

}

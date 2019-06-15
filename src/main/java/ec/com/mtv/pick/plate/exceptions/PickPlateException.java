package ec.com.mtv.pick.plate.exceptions;

/**
 * Extends from exception for Pick and Plate generated errors.
 * 
 * @author Marcelo Torres Vinueza
 *
 */
public class PickPlateException extends Exception {

	/**
	 * Value for UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Empty constructor.
	 * 
	 * @see Exception
	 */
	public PickPlateException() {
		super();
	}

	/**
	 * Set message exception.
	 * 
	 * @see Exception
	 * 
	 * @param message new message exception
	 */
	public PickPlateException(String message) {
		super(message);
	}

	/**
	 * Set throwable cause.
	 * 
	 * @see Exception
	 * 
	 * @param cause the throwable
	 */
	public PickPlateException(Throwable cause) {
		super(cause);
	}

}

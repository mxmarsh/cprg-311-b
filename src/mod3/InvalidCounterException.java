package mod3;

/**
 * Class description: Represents an exception thrown if Counter is set to an
 * invalid value.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class InvalidCounterException extends Exception {

	/**
	 * Initializes the newly created InvalidCounterException
	 */
	public InvalidCounterException() {
		super();
	}

	/**
	 * Initializes the newly created InvalidCounterException
	 * 
	 * @param message specific error message
	 */
	public InvalidCounterException(String message) {
		super(message);
	}

}

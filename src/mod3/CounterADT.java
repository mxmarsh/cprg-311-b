package mod3;

/**
 * Class description: This interface is the contract for the implementation of a
 * Counter class.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public interface CounterADT {

	/**
	 * Mutator method to modify the value of the counter.
	 * 
	 * Precondition: A valid Counter object exists, and an integer value is passed
	 * in.
	 * 
	 * Postcondition: The counter is set to the value specified.
	 * 
	 * @param num the new counter value
	 * @throws InvalidCounterException thrown if the provided value is a negative
	 *                                 number.
	 */
	public void setCounter(int num) throws InvalidCounterException;

	/**
	 * Mutator method to increase the value of the counter by 1.
	 * 
	 * Precondition: A valid Counter object exists, with a value for counter set.
	 * 
	 * Postcondition: The Counter value has been increased by 1.
	 */
	public void incCounter();

	/**
	 * Mutator method to decrease the value of the counter by 1.
	 * 
	 * Precondition: A valid Counter object exists, with a value for counter set.
	 * 
	 * Postcondition: The Counter value has been decreased by 1.
	 * 
	 * @throws InvalidCounterException thrown if the Counter was previously set to a
	 *                                 value of 0.
	 */
	public void decCounter() throws InvalidCounterException;

	/**
	 * Accessor method that returns the value of the counter.
	 * 
	 * Precondition: A valid Counter object exists, with a value for counter set.
	 * 
	 * Postcondition: An integer value representing the count is returned.
	 * 
	 * @return the counter as an integer value
	 */
	public int getCounter();

	/**
	 * Overrides the toString() method.
	 * 
	 * Precondition: A valid Counter object exists, with a value for counter set.
	 * 
	 * Postcondition: The current value of counter is returned as a String.
	 * 
	 * @return the current value of counter
	 */
	@Override
	public String toString();

	/**
	 * Transformer method to check if the current value of the counter is zero.
	 * 
	 * Precondition: A valid Counter object exists, with a value for counter set.
	 * 
	 * Postcondition: A Boolean value is returned: true if the current value of
	 * counter is zero, false otherwise.
	 * 
	 * @return true if the current value of counter is zero, false otherwise.
	 */
	public Boolean isZero();
}

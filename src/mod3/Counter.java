package mod3;

/**
 * Class description: Implementing the CounterADT interface.
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class Counter implements CounterADT {

	private int count;

	/**
	 * Initializes the newly created Counter
	 */
	public Counter() {
	}

	/**
	 * Initializes the newly created Counter
	 * 
	 * @param num starting value of count
	 */
	public Counter(int num) {
		count = num;
	}

	@Override
	public void setCounter(int num) throws InvalidCounterException {
		if (num < 0)
			throw new InvalidCounterException("number too small");
		else
			count = num;
	}

	@Override
	public void incCounter() {
		count++;
	}

	@Override
	public void decCounter() throws InvalidCounterException {
		if (count > 0)
			count--;
		else
			throw new InvalidCounterException("cannot have negative count");
	}

	@Override
	public int getCounter() {
		return count;
	}

	@Override
	public String toString() {
		return "Counter value is " + count;
	};

	@Override
	public Boolean isZero() {
		if (count == 0)
			return true;
		else
			return false;
	}

}

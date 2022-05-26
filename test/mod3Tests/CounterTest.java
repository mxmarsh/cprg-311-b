package mod3Tests;

import static org.junit.Assert.*;

import org.junit.*;

import mod3.Counter;
import mod3.InvalidCounterException;

/**
 * Class description: testing the Counter class
 *
 * @author Dana Marsh (dana.marsh@sait.ca)
 *
 */

public class CounterTest {

	// test objects:
	Counter counter1;
	Counter counter2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		counter1 = new Counter();
		counter2 = new Counter(2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		counter1 = null;
		counter2 = null;
	}

	@Test
	public void testSetCounterHappyPath() {
		// set counter to 5:
		try {
			counter1.setCounter(5);
		} catch (InvalidCounterException e) {
			fail("unexpected exception was thrown");
		}

		// compare the actual value to my expected value
		int expected = 5;
		int actual = counter1.getCounter();
		assertEquals("expected value does not match", expected, actual);
	}

	@Test
	public void testSetCounterZero() {
		// set counter to 0:
		try {
			counter2.setCounter(0);
		} catch (InvalidCounterException e) {
			fail("unexpected exception was thrown");
		}

		// compare the actual value to my expected value
		int expected = 0;
		int actual = counter1.getCounter();
		assertEquals("expected value does not match", expected, actual);
	}

	@Test
	public void testSetCounterNegative() {
		// try to set the counter to a negative value
		try {
			counter2.setCounter(-10);
			fail("expected exception was not thrown");
		} catch (InvalidCounterException e) {
			assertTrue(true);
		}
	}

	@Test
	public void testIncCounter() {
		counter2.incCounter();
		int expected = 3;
		int actual = counter2.getCounter();
		assertEquals(expected, actual);
	}

	@Test
	public void testDecCounterHappy() {
		try {
			counter2.decCounter();
		} catch (InvalidCounterException e) {
			fail("unexpected exception");
		}

		int expected = 1;
		int actual = counter2.getCounter();
		assertEquals(expected, actual);
	}

	@Test
	public void testDecCounterZero() {
		try {
			counter1.decCounter();
			fail("expected exception not thrown");
		} catch (InvalidCounterException e) {
			assertTrue(true);
		}
	}

	@Test
	public void testIsZero() {
		Boolean expected = true;
		Boolean actual = counter1.isZero();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsNotZero() {
		Boolean expected = false;
		Boolean actual = counter2.isZero();
		assertEquals(expected, actual);
	}

	@Test
	public void testToString() {
		String expected = "Counter value is 2";
		String actual = counter2.toString();
		assertEquals(expected, actual);

	}
}

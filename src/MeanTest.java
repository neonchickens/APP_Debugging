import static org.junit.Assert.*;

import org.junit.Test;

public class MeanTest {

	@Test
	public void testEven() {
		assertEquals(Driver.findMean(1, 2, 3, 4), 2.5, 0);
		assertEquals(Driver.findMean(-1, 1), 0, 0);
		assertEquals(Driver.findMean(1, 1, 1, 2), 1.25, 0);
		assertEquals(Driver.findMean(0, 10), 5, 0);
	}
	
	@Test
	public void testOdd() {
		assertEquals(Driver.findMean(1, 2, 3), 2, 0);
		assertEquals(Driver.findMean(-1, 0, 1), 0, 0);
		assertEquals(Driver.findMean(1, 1, 1), 1, 0);
		assertEquals(Driver.findMean(1), 1, 0);
	}	
	
	@Test
	public void testEmpty() {
		assertEquals(Driver.findMean(), 0, 0);
		assertEquals(Driver.findMean(null), 0, 0);
	}
	
}

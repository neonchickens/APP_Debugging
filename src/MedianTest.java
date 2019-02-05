import static org.junit.Assert.*;

import org.junit.Test;

public class MedianTest {

	@Test
	public void testEven() {
		assertEquals(Driver.findMedian(1, 2, 3, 4), 2.5, 0);
		assertEquals(Driver.findMedian(-1, 1), 0, 0);
		assertEquals(Driver.findMedian(1, 1, 1, 2), 1, 0);
		assertEquals(Driver.findMedian(0, 10), 5, 0);
	}
	
	@Test
	public void testOdd() {
		assertEquals(Driver.findMedian(1, 2, 3), 2, 0);
		assertEquals(Driver.findMedian(-1, 0, 1), 0, 0);
		assertEquals(Driver.findMedian(1, 1, 1), 1, 0);
		assertEquals(Driver.findMedian(1), 1, 0);
	}	
	
	@Test
	public void testEmpty() {
		assertEquals(Driver.findMedian(), 0, 0);
		assertEquals(Driver.findMedian(null), 0, 0);
	}

}

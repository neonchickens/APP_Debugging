import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class GenTesting {

	@Test(timeout = 5000)
	public void testTimeout() {
		assertTrue(Driver.runInfiniteLoop());
	}
	
	@Test(expected = Exception.class)
	public void testException() throws Exception {
		assertFalse(Driver.runThrowException());
	}

}

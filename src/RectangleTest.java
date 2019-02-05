import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class RectangleTest {

	private Rectangle r1, r2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		r1 = new Rectangle();
		r2 = new Rectangle(3, 4);
	}

	@Ignore
	@Test
	public void testDiagonal() {
		assertEquals(r1.getDiagonal(), Math.sqrt(2), 0);
		assertEquals(r2.getDiagonal(), Math.sqrt(25), 0);
	}

	@Ignore
	@Test
	public void testPerimeter() {
		assertEquals(r1.getPerimeter(), 4, 0);
		assertEquals(r2.getPerimeter(), 14, 0);
	}

	@Ignore
	@Test
	public void testArea() {
		assertEquals(r1.getArea(), 1, 0);
		assertEquals(r2.getArea(), 12, 0);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}

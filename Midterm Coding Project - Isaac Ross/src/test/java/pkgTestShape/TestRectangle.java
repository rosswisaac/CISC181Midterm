package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgShape.Rectangle;

public class TestRectangle {

	@Test
	public void RectangleConTest1() throws Exception {
		new Rectangle(5,10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConTest2() throws Exception {
		new Rectangle(-3, 18);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConTest3() throws Exception {
		new Rectangle(4, -2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConTest4() throws Exception {
		new Rectangle(-7, -23);
	}
	
	@Test
	public void RectangleGetterTest1() throws Exception {
		Rectangle recG = new Rectangle(5,10);
		assertEquals(recG.getiWidth(), 5);
		assertEquals(recG.getiLength(), 10);
	}
	
	@Test
	public void RectangleSetterTest1() throws Exception {
		Rectangle recS = new Rectangle(3,6);
		recS.setiWidth(4);
		recS.setiLength(8);
		assertEquals(recS.getiWidth(), 4);
		assertEquals(recS.getiLength(), 8);
	}
	
	@Test
	public void RectangleAreaTest1() throws Exception {
		Rectangle recA = new Rectangle(5,6);
		assertEquals(recA.area(), 30, .001);
	}
	
	@Test
	public void RectanglePerimeterTest1() throws Exception {
		Rectangle recP = new Rectangle(4,7);
		assertEquals(recP.perimeter(), 22, .001);
	}
}

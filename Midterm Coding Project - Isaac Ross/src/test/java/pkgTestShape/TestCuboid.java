package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgShape.Cuboid;

public class TestCuboid {

	@Test
	public void CuboidConTest1() throws Exception {
		new Cuboid(3,4,5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConTest2() throws Exception {
		new Cuboid(-2,6,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConTest3() throws Exception {
		new Cuboid(4,-2,9);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConTest4() throws Exception {
		new Cuboid(2,9,-10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConTest5() throws Exception {
		new Cuboid(-12,-2,-3);
	}
	
	@Test
	public void CuboidGetterTest1() throws Exception {
		Cuboid cubG = new Cuboid(1,2,3);
		assertEquals(cubG.getiWidth(), 1);
		assertEquals(cubG.getiLength(), 2);
		assertEquals(cubG.getiDepth(), 3);
	}
	
	@Test
	public void CuboidSetterTest1() throws Exception {
		Cuboid cubS = new Cuboid(6,2,8);
		cubS.setiWidth(3);
		cubS.setiLength(9);
		cubS.setiDepth(2);
		assertEquals(cubS.getiWidth(), 3);
		assertEquals(cubS.getiLength(), 9);
		assertEquals(cubS.getiDepth(), 2);
	}
	
	@Test
	public void CuboidVolumeTest() throws Exception {
		Cuboid cubV = new Cuboid(2,4,6);
		assertEquals(cubV.volume(), 48, .001);
	}
	
	@Test
	public void CuboidAreaTest1() throws Exception {
		Cuboid cubA = new Cuboid(2,3,5);
		assertEquals(cubA.area(), 62, .001);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void CuboidPerimeterTest1() throws Exception {
		Cuboid cubP = new Cuboid(2,6,3);
		cubP.perimeter();
	}
}

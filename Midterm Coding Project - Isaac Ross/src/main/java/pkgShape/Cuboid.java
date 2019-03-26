package pkgShape;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception {
		super(iWidth, iLength);
		if (iDepth < 0) {
			throw new IllegalArgumentException("Depth must be a positive value.");
		}
		else {
			this.iDepth = iDepth;
		}
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return (double)(getiWidth() * getiLength() * iDepth);
	}

	public double area() {
		int halfArea = ((getiWidth() * getiLength()) + (getiWidth() * iDepth) + (getiLength() * iDepth));
		return (double)(2 * halfArea);
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("A Cuboid does not have a perimeter.");
	}
	
	public int compareTo(Object obj) {
		Cuboid cub = (Cuboid) obj;
		return Double.compare(this.area(),cub.area());
	}
}

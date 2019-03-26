package pkgShape;

import java.util.Comparator;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) throws Exception {
		super();
		if (iWidth < 0 || iLength < 0) {
			throw new IllegalArgumentException("Length and Width must be positive values.");
		}
		else {
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return (double)(iWidth * iLength);
	}
	
	public double perimeter() {
		return (double)((2*iWidth)+(2*iLength));
	}
	
	public int compareTo(Object obj) {
		Rectangle rect = (Rectangle) obj;
		return Double.compare(this.area(),rect.area());
	}
	
	
	
	public class SortByArea implements Comparator<Cuboid> {
		
		public int compare(Cuboid cub1, Cuboid cub2) {
			return cub1.compareTo(cub2);
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		
		public int compare(Cuboid cub1, Cuboid cub2) {
			return Double.compare(cub1.volume(), cub2.volume());
		}
	}
}

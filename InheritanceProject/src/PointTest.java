
public class PointTest {
	public static void main(String[] args) {
	
		Point2D p1 = new Point2D(30, 40);
		p1.showData();
		Point3D p2 = new Point3D(30, 50, 22);
		p2.showData();
	}
}
class Point2D{
	private int x;
	private int y;
	Point2D(int x,int y){
		this.x = x;
		this.y = y;
		System.out.println("Point2D(int,int) invoked");
	}	
	void showData() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}
class Point3D extends Point2D{
	private int z;
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z = z;
		System.out.println("Point3D(int,int,int) invoked");
	}
	@Override
	void showData() {
		super.showData();
		System.out.println("z : "+z);
	}
}


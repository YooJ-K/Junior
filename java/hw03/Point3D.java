
public class Point3D extends Point{
	private double x, y, z;
	
	/**
	 * Precondition: -
	  Postcondition: �Ű������� 3���� ������, ���� �Ҵ����ش�.
	 */
	public Point3D(double x, double y, double z){
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z; 
	}
	
	/**
	 * Precondition: -
	  Postcondition: Point class�� z�� �������� �����Ƿ�, ���⼭ z�� ���� ����
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	/**
	 * Precondition: -
	  Postcondition: Point class�� z�� �������� �����Ƿ�, ���⼭ z�� ���� return
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * Precondition: x, y, z, pt
	  Postcondition: ���� �� ������ �Ÿ��� ������ش�.
	 */	
	public double distance(Point3D pt) {
		return Math.sqrt(Math.pow(pt.getX() - x, 2.0) + Math.pow(pt.getY() - y, 2.0) + Math.pow(pt.getZ() - z, 2.0));
	}
}


public class Point {
	private double x, y;
	
	/**
	  Precondition: -
	  Postcondition: �������̴�. �Ű������� ���� x ���� y ������ �����Ѵ�.
	 */
	public Point(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	/**
	  Precondition: -
	  Postcondition: ���� Class �Ӹ� �ƴ϶�, �ٸ� Class���� x ���� ������ �� �ִ� method�̴�.
	 */
	public double getX() {
		return x;
	}
	
	/**
	  Precondition: -
	  Postcondition: ���� Class �Ӹ� �ƴ϶�, �ٸ� Class������ y ���� ������ �� �ִ� method�̴�.
	 */
	public double getY() {
		return y;
	}
	
	/**
	  Precondition: -
	  Postcondition: ���� Class �Ӹ� �ƴ϶�, �ٸ� Class������ x ���� ������ �� �ִ� method�̴�.
	 */
	public void setX(double x1) {
		x = x1;
	}
	
	/**
	  Precondition: -
	  Postcondition: ���� Class �Ӹ� �ƴ϶�, �ٸ� Class������ y ���� ������ �� �ִ� method�̴�.
	 */
	public void setY(double y1) {
		y = y1;
	}
	
	/**
	  Precondition: -
	  Postcondition: ���� �� ������ �Ÿ��� ��½����ִ� method�� �Ű����� pt�� ���� this ��ü�� ����ִ� �� ������ �Ÿ��� �������ش�.
	 */
	public double distance(Point pt) {	
		return Math.sqrt(Math.pow(this.x - pt.x, 2.0) + Math.pow(this.y - pt.y, 2.0));
	}
}

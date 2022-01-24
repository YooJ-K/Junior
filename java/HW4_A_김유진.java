import java.io.FileInputStream;
import java.io.FileOutputStream; // ObjectOutputStream ��ü ���� �� �ʿ���ϴ� Ŭ���� ������Ʈ
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

public class Point implements Serializable{
	private double x;
	private double y;
	
	public Point() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(Point pt) {
		return Math.sqrt(Math.pow(pt.getX() - x, 2.0) + Math.pow(pt.getY() - y, 2.0));
	}
	
	public static Point loadPoint(String fileName)
	{
		/*
		 * ���Ͽ��� Point ��ü�� value�� read�ϴ� �Լ�	
		 * static�� ����? ���� ���� �ڵ带 ���� ��ü �̸��� ���ؼ� �Լ��� �θ��� ���� �ƴ϶�
		 * 				Ŭ������ �̸��� ���ؼ� ȣ���ϹǷ� static�� ����ؾ߸� �Ѵ�.
		 */
		ObjectInputStream inputStream = null;
		
		// ���� open�� ���� try-catch��
		try
		{
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
		}
		catch(IOException e)
		{
			System.out.println("Error opening input file " + fileName + ".");
			System.exit(0);
		}
		
		// Point ��ü�� value �Ҵ� try-catch��
		Point p = null;
		try {
			p = (Point)inputStream.readObject();
			inputStream.close();
		}
		catch(Exception e)
		{
			System.out.println("Error reading from file " + fileName + ".");
			System.exit(0);
		}
		
		return p;
	}
	
	public static void savePoint(String fileName, Point pt)
	{
		/*
		 * ���Ͽ� Point ��ü�� value�� write���ִ� �Լ�
		 * static�� ����? ���� ���� �ڵ带 ���� ��ü �̸��� ���ؼ� �Լ��� �θ��� ���� �ƴ϶�
		 * 				Ŭ������ �̸��� ���ؼ� ȣ���ϹǷ� static�� ����ؾ߸� �Ѵ�.
		 */
		ObjectOutputStream outputStream = null;
		
		// ����� ���� open
		try
		{
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
		}
		catch(IOException e)
		{
			System.out.println("Error opening output file " + fileName + ".");
			System.exit(0);
		}
		
		// ���Ͽ� value write
		try
		{
			outputStream.writeObject(pt);
			outputStream.close();
		}
		catch(IOException e)
		{
			System.out.println("Error writing to file " + fileName + ".");
			System.exit(0);
		}
	}
	
	public String toString()
	{
		/*
		 * ������ ������ ����, ���Ƿ� ��� ���ڿ� ����
		 * csv ������ �����Ѵٸ� x + "," + y�� �ϴ°� ������,
		 */
		// 
		return ("x�� ��ǥ : " + x + " " +
				"y�� ��ǥ : " + y + '\n');
	}
}

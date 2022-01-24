import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;

public class CsvWriter 
{
	PrintWriter outputStream;
	
	public CsvWriter()
	{
		outputStream = null;
	}
	
	public CsvWriter(String fileName)
	{
		/*
		 * output file�� �������ִ� Ŭ������ �������̴�.
		 * ���÷� �ö�� csv ������ ���� �ܼ��� ���� ���Ͽ� append���� �Ӹ� �ƴ϶�, 
		 * x, y ������ ���� ��ܿ� ��ġ�������� �� �� �ִ�.
		 * ���� File class�� import �����, �� Ŭ������ �޼ҵ��� exists�� �̿��� ���翩�θ� Ȯ���ߴ�.
		 * ���� �������� �ʴ´ٸ�, ���� ��ܿ� x,y�� print������ϰ� �ƴ϶�� �Ѿ��.
		 * */
		try
		{
			boolean forVal = false;
			File isExistConfirm = new File(fileName);
			if (isExistConfirm.exists()) forVal = true;

			outputStream = new PrintWriter(new FileOutputStream(fileName,true));
			if (!forVal) outputStream.println("x,y");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
	}
	
	public void writeRow(Point pt)
	{
		/*
		 * ���� ���Ͽ� Point ��ü pt�� ���� csv ���·� �߰����ش�.
		 * ���� �ʿ�� ������, Ȯ���� ���ؼ� Success ��¼�� ���ڿ��� �־����.
		 */
		try
		{
			outputStream.println(pt);
			System.out.println("Success for adding line about " + pt.getX() + ", " + pt.getY());
		}
		catch (Exception e)
		{
			System.out.println("Error writing to file csv.");
			System.exit(0);
		}
	}
	
	public void close()
	{
		/*
		 * ������ �ݱ� ���ؼ� ���� �Լ�
		 * */
		outputStream.close();
	}
	
	public String toString()
	{
		return null;
	}
}

import java.util.ArrayList;

public class PrimeArray {
	
	private ArrayList<Integer> list;
	
	public PrimeArray(int size)
	{
		// ���� size��ŭ �迭�� prime num �������ִ� �Լ�
		list = new ArrayList<Integer>(size);
		
		// size��ŭ�� prime number�� arraylist�� �������ֱ� ���� ����
		int count, i = 2;
		while (list.size() < size) {
			count = 0;
			for (int j = 2; j<=i; j++)
			{
				if (i % j == 0) count++;
				if (count > 1) break;
			}
			if (count == 1)
				list.add(i);
			
			if (list.size() >= size) break;
			i++;
		}
	}
	
	public void add()
	{
		// 1���� prime number�� ��������Ѵ�.
		
		// ���� main�������� ó������ size�� 0�� �ƴ�����, Ȥ�ó� size�� 0�� ��츦 ����� if�� ����
		if (list.size() == 0) {
			list.add(2);
			return;
		}
		
		int num = list.get(list.size()-1); 
		// ���ʿ��� ������ �������� ������ ������ ���� ������ prime���� �ƴ��� �Ǻ��� �����Ѵ�.
		int count, i = num + 1;
		while (true) {
			count = 0;
			for (int j = 2; j<=i; j++)
			{
				if (i % j == 0) count++;
				if (count > 1) break;
			}
			if (count == 1) {
				list.add(i);
				return;
			}
			i++;
		}
	}
	
	public int[] getArray()
	{
		// arrayList�� �ƴ� array�� return�� ������ϴ� �Լ�
		int[] nums = new int[list.size()];
		int i=0;
		
		// for each ������ �̿��ؼ� obj�� intŸ������ ��ȯ������ �� �迭�� �������ش�.
		for(Object obj : list.toArray())
		{
			nums[i] = (int) obj;
			i++;
		}
		return nums;
	}
}

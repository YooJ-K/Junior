
public class GenericsType<T> {
	private T t;
	
	public T get() // return type�� T�� ������ϹǷ�, �̰ɷ� �ٲ����.
	{
		return t;
	}
	
	public void set(T t1) // set�Լ��� �Ű������� T�� ���´�.
	{
		t = t1;
	}
	
	public static boolean isEqual(GenericsType g1, GenericsType g2)
	{		
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]){
		 GenericsType<String> type = new GenericsType();
		 type.set("Pankaj");
		 GenericsType type1 = new GenericsType();
		 type1.set("Pankaj");
		 type1.set(10); // ���� �� ���� �ּ�ó���ȴٸ� true�� ����Ѵ�.
		 boolean isEqual = GenericsType.isEqual(type, type1);
		 System.out.println(isEqual);
		}
}


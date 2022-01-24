
public class Counter {
	private int value;
	
	/**
	  Precondition: -
	  Postcondition: value�� ���� 1��ŭ ���������ִ� method
	 */
	public void increase() {
		value++;
	}
	
	/**
	 * Precondition: -
	  Postcondition: value�� ���� 1��ŭ ���ҽ����ִ� method
	  	��, value���� negative value�� �� �� �����Ƿ� ���׿����ڸ� �̿��Ͽ� 
	  	value ���� 0���� ũ�� 1��ŭ decrease�� ���ְ�, 0 ���ϸ� 0�� value�� ���� �־��ش�
	 */
	public void decrease() {
		value = value > 0? (value--) : 0;
	}
	
	/**
	  Precondition: -
	  Postcondition: value ���� 0���� �ʱ�ȭ�����ش�.
	 */
	public void reset() {
		value = 0;
	}
	
	/**
	  Precondition: -
	  Postcondition: value ���� ȭ�鿡 ��½����ִ� method
	 */
	public void displayValue() {
		System.out.println(value);
	}
}

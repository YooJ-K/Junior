
public class RightArrow extends ShapeBase {
	private int offset, tail, length;
	
	/**
	 * Precondition: -
	  Postcondition: ������, �ƹ��͵� ������ �ʴ´ٸ�, tail�� length ��� 0���� �ʱ�ȭ
	 */
	public RightArrow() {
		super();
		offset = getOffset();
		tail = 0;
		length = 0;
	}
	
	/**
	 * Precondition: -
	  Postcondition: �Ű������� 3���� ������, ���� �Ҵ����ش�.
	 */
	public RightArrow(int theOffset, int theTail, int theLength) {
		super(theOffset);
		offset = theOffset;
		tail = theTail;
		length = theLength;
	}
	
	/**
	 * Precondition: -
	  Postcondition: ���Ӱ� tail�� length�������� �־��� �� ����ϴ� �Լ�
	 */
	public void set(int newTail, int newLength) {
		tail = newTail;
		length = newLength;
	}
	
	/**
	 * Precondition: offset, length, tail
	  Postcondition: ���� Ŭ������ ShapeBase Ŭ������ drawAt���� ���� �ҷ����� �Լ�. superŬ������ �߻��Լ��� ������ �κ�
	  	
	 */
	public void drawHere() {

		for(int i = 0; i < length*2-1; i++) {
			// offset�� ũ�⸸ŭ ������ ����ϱ� ���� �ݺ���
			for(int j=0; j<offset; j++) {
				System.out.print(' ');
			}
			
			// ȭ��ǥ�� �� �� ��� (tail)
			char c = ' ';
			if(i == length-1) c = '*';
			
			for(int j = 0; j < tail-1; j++) {
				System.out.print(c);
			}
			
			// head�� ���� ���� �κ� ����� ����
			if(i % 2 == 0) c = '*';
			else c = ' ';
			System.out.print(c);
			
			// head�� ������ �κ� ����� ���� condition ���� �κ� (�ﰢ�� ���)
			int condition = i;
			if (condition > length) condition = (length - 1) * 2 - condition;
			
			// ������ �������� condition�� ���� ���
			for(int j=0; j < condition; j++) {
				if(j == condition - 1 && i % 2 == 0) c = '*';
				else c = ' ';
				System.out.print(c);
			}
			
			System.out.println();
		}
	}
	
}

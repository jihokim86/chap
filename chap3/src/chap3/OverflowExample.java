package chap3;

public class OverflowExample {

	public static void main(String[] args) {
		
		//�����÷ο�
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		
		System.out.println(z); // -727379968
		
		// ���� ������ ���� ������ �߸��� ���� ��µȴ�.
		
		int i = 1000000;
		int j = 1000000;
		long k = (long)i * j; // ������ȯ
		
		System.out.println(k); //1000000000000
	}

}
package chap3;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		// ��ȣ ������
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1="+result1); // -100
		System.out.println("result2="+result2); // 100
		
		short s = 100;
		//short result3 = -s; > �ǿ�����(s)�� �����ϱ� ���� intŸ������ ��ȯ�ȴ�.
		int result3= -s; // ������ �°� int Ÿ������ �����ؾ��Ѵ�.
		short result4 = (short) -s; // ���� ��ȯ�� �ϴ�
		
		System.out.println("result3="+result3); //-100
		System.out.println("result3="+result4); //-100
	}

}
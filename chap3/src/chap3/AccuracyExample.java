package chap3;

public class AccuracyExample {

	public static void main(String[] args) {
		
		// ��Ȯ�ϰ� ����� ������ �ε��Ҽ��� Ÿ���� ������� �ʴ´�.
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7������ ����");
		System.out.println(result +"������ ���´�."); //0.299999999999
		
		// float, double Ÿ���� 0.1�� ��Ȯ�ϰ� ǥ���Ҽ� ���� �ٻ�ġ�� ó��
		
		int temp = apple*10 - number;
		double result1 = (double)temp/10;
		
		System.out.println(result1); //0.3
	}

}
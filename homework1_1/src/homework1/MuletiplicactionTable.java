package homework1;

public class MuletiplicactionTable {

	public static void main(String[] args) {
		
		//������ ��� 2~9�� ,�ܼ�â���� �Ѵ��� �� �� �ְ�
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d X %d = %2d\t",j,i,(i*j));	
				//	1x2 1x3 1x4 ...-> �յ� ������ �ٲ㼭 ���
				// %2d : 2�ڸ�����(���ʰ���), %-2d :2�ڸ�����(�����ʰ���)
				// %06d : 6�ڸ�����(���ʺ��ڸ� 0���� ä��),
			}
			System.out.println(""); // 1x9 ���� ��ٲ�
		}
		
	} //end of main
} // end of class

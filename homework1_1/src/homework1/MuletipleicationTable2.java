package homework1;

public class MuletipleicationTable2 {

	public static void main(String[] args) {
		
		//������ ��� 2~5�� / 6~9�� �ܼ�â���� �Ѵ��� �� �� �ְ�
		
		for(int k=0;k<2;k++) {
		for(int i=1;i<=9;i++) {
			for(int j=2+4*k;j<=5+k*4;j++) {
				System.out.printf("%d X %d = %2d\t",j,i,(i*j));	
			}
			System.out.println(""); // 1 x 5 �Ϸ� �� �� �ٲٰ� 2 x 2 �� ����
		  }
		System.out.println(""); // 5�� ���� �� �ٲ�
		}
		
	} //end of main
}//end of class

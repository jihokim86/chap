package homework1;

public class test {

	public static void main(String[] args) {
		int x=5;
		for(int i=1;i<=x-1;i++) {
			for(int j=1;j<=1*(i-1)+1;j++) {		//������ d, ù°�� 1�� ���������� �Ϲ��� d(n-1)+1
				System.out.print(" "); 			//������ �ֱ� ���� for��
			}
			for(int k=1; k<=-2*(i-1)+3; k++) { 	//������ -d, ù°�� 1�� ���������� �Ϲ��� -d(n-1)+1 
				System.out.print("*");			//���� �ֱ� ���� for��		
			}
				System.out.println();
	}
	}
}



package homework1;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		
		//* �� �̷���� ���̾Ƹ�� ���� ���
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Ȧ�� ���� �Է��ϼ���:");
		int x = scan.nextInt(); //nextline�� ���� ����??
		
//		int x=7; // �� ���� ��
		int y=x-x/2; //���� �Ʒ��� �����ϱ� ���� ����
		for(int i=1;i<=x/2+1;i++) {
			for(int j=1;j<=-1*(i-1)+x/2;j++) { 	//������ -d, ù°�� (x/2)�� ���������� �Ϲ��� -d(n-1)+x/2
				System.out.print(" ");			//������ �ֱ� ���� for��
			}
			for(int k=1; k<=2*(i-1)+1 ; k++) { 	//������ d, ù°�� 1�� ���������� �Ϲ��� d(n-1)+1 
				System.out.print("*");			//���� �ֱ� ���� for��
			}
				System.out.println();
		}
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=1*(i-1)+1;j++) {		//������ d, ù°�� 1�� ���������� �Ϲ��� d(n-1)+1
				System.out.print(" "); 			//������ �ֱ� ���� for��
			}
			for(int k=1; k<=-2*(i-1)+(x-2); k++) { 	//������ -d, ù°�� (x-2)�� ���������� �Ϲ��� -d(n-1)+(x-2) 
				System.out.print("*");			//���� �ֱ� ���� for��		
			}
				System.out.println();
		}
		scan.close();
	}//end of main
}//end of class

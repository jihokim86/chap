package homework1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		//Ű����� �Է� �޾� ����ϱ�
		Scanner scan= new Scanner(System.in);
		
		int input1=scan.nextInt(); 
		System.out.println("�Էµ�����:"+input1);
		// ������ �����ϰ� Enter���� �����ؼ� ���� ���ڿ� �ҽ��� �Ѿ����
		
		//String input5 = scan.nextLine();
		// nextLine�� �߰��ؼ� enter���� �����ִ�??
		
		String input = scan.nextLine();		
		System.out.println("�Էµ� ���ڿ� :"+input);
		//Enter�� ġ�� ������ �� ��� ���ڿ��� ����
		
		double input2=scan.nextDouble();
		System.out.println("�ԷµȽǼ�:"+input2);
		
		String input3 =scan.next();
		System.out.println("�Էµ� ���ڿ�:"+input3);
		//Space���������� �Էµ� ���ڿ��� ����
		
		scan.close();
		
		
		
		
	}

}

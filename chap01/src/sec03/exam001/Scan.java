package sec03.exam001;
import java.util.Scanner; // java���� Scanner Ŭ���� ȣ��?

public class Scan {

	public static void main(String[] args) {
		
		//�����κ��� ���� ���� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scan = new Scanner(System.in); //Scanner ��ü ����
		
		System.out.println("x���� �Է��Ͻÿ� : ");
		
		int x = scan.nextInt(); // int �� �Է� �� ����
		
		System.out.println("y���� �Է��Ͻÿ� :");
		
		int y = scan.nextInt(); // int �� �Է� �� ����
        
		int z=0;
        		
		z= x+y;
		
		System.out.println("x��y�� ����="+z);
		scan.close(); // Scanner resource leak error �߻��ϸ� �߰� �Է� �ʿ�
	

	}

}

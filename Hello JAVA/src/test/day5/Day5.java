package test.day5;
import java.util.Scanner;

public class Day5 {
	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		
		//������ �ý��� �����
		//System.out �ý����� ǥ�� ��� ��ġ.
		//System.in.read(); ǥ�� �Է� ��ġ.
		//System.out.println(���ͷ� �Ǵ� ����);
		//ln=line ���� �����϶�� �ǹ̸� ����
		//printf �� print ��ɿ� ���ؼ� ����
		
		System.out.printf("�̸�:%s\n" , "�ڹ�"); //�̸�:�ڹ� 
		System.out.printf("�̸�:%d\n", 123); // �̸� : 123
		System.out.printf("�̸�:%s\n", 123); // �̸� :123
		// %s�� ���ڿ��� ����, %d�� ������ ����, \n�� �ٹٲ�
		// ����� ������ ���ڿ����� �������� �Ǵ��� �ȵ�.		
		//System.out.printf("�̸�:%s\n", �ڹ�); ���� �����ϱ�?
		
		System.out.printf("�̸�:%1$s,����:%2$d\n", "�ڹ�", 123);
		System.out.printf("�̸�:%2$s\n����:%1$d\n", 456, 123);
		
		String pN1="010";
		String pN2="118";
		String pN3="358";
		
		System.out.printf("��ȭ��ȣ:%1$s- %2$s - %3$s\n",pN1,pN2,pN3);
		
		int rad = 16;
		float area=3.14f*rad*rad;
		String area1= String.valueOf(area); //����Ÿ�� -> ���ڿ� Ÿ������ ������ȯ
		String area2= area+""; // area������ ���ڿ�"����"�� ����Ǹ� �ڵ����� ���ڿ��̵Ǵ� Ư��
		System.out.printf("�������� %1$d�� ���� ���̴�:%2$10.2f\n",rad,area);
		System.out.printf("�������� %1$d�� ���� ���̴�:%2$s\n",rad,area1);
		System.out.printf("�������� %1$d�� ���� ���̴�:%2$s\n",rad,area2);
		
		
		//Ű���忡�� �Էµ� ������ ������ �����ϱ�(Ű���忡 �Էµ� Ű�� Ű�ڵ�� �б�)
		//public static void main(String[] args) throws Excepton{ //���Ŀ� ���
		
		/*System.out.println("Ű�� �Է��Ͻø� Ű�ڵ� ���� ��µ˴ϴ�.");
		int keyCode = System.in.read(); 
		System.out.printf("�Էµ� Ű�ڵ� ���� %d\n",keyCode);
		System.out.println(keyCode); //a�� �ܼ�â���� �Է��ϸ� Ű�ڵ� 97�� ��µ�
		
		int code;
		code=System.in.read();
		System.out.println(code); // �ܼ�â�� a �Է´��� Enter�Է� ���� ���� ��°� 13
		
		code=System.in.read();
		System.out.println(code); // 10 ��µ� ���� �����ϸ� ���͸� ���Զ� �ѹ� ���涧 �ѹ� �ν�
		
		code=System.in.read();
		System.out.println(code); // �״��� Ű���� �Է��ϸ� Ű�ڵ� �����*/
		
		/*// �Էµ� Ű�� ������ ������� Ű�ڵ� ����
		while(true) { //�ݺ��� 
			int code2;
			code2=System.in.read();
			System.out.println(code2);
			if(code2==113) { //q(Ű�ڵ�113) �϶� ����
				break;			
			}
		}
		System.out.println("����");*/
		
		
		
		//2�� �̻��� Ű�� ���յ� �ѱ��� �б����� scannerŬ������ ����.
		Scanner scanner=new Scanner(System.in); //������ Scanner�� ������ ����
		//String srt; //���� ���� ���� Ȯ�� ���. �����ص� ������ ����
		
		while(true) {
		System.out.println("���� �Է��Ͻÿ�");
		String str=scanner.nextLine(); // �����Է������� ���� StringŸ���� ���� str�� ����
		System.out.printf("�Էµ� ���� %s �Դϴ�\n", str);
			if(str.equals("����")) {
			break;
		 	}
		System.out.println("���Ḧ ���ҽ� \"����\"�� �Է��Ͻÿ�");
		}
		System.out.println("����Ǿ����ϴ�.");
		scanner.close();
		}
	
	}
	
	



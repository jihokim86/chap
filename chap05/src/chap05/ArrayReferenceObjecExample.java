package chap05;

public class ArrayReferenceObjecExample {

	public static void main(String[] args) {
		// ��ü�� �����ϴ� �迭
		// �⺻Ÿ�� �迭�� �� �׸� ���� ���� ���� ������, ����Ÿ�� �迭�� �� �׸� ��ü
		// �� ������ ������ �ִ�.
		String[] strArray = new String[3];
		strArray[0] = "java"; //������ ���°� �ƴ϶� ���� ����??
		strArray[1] = "java"; //�⺻Ÿ�Կ��� ���� �־���
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]); 	//true
		System.out.println(strArray[0] == strArray[2]); 	//false
		System.out.println(strArray[0].equals(strArray[2]));//true
		
	}

}

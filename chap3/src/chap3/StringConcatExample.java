package chap3;

public class StringConcatExample {

	public static void main(String[] args) {
		
		//���ڿ� ���� ������
		String str1 = "JDK"+6.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str1); // JDK6.0
		System.out.println(str2); // JDK6.0Ư¡
		
		String str3 = "JDK"+3+3.0;
		String str4 = 3+3.0+"JDK";
		System.out.println(str3); //JDK33.0
		System.out.println(str4); //6.0JDK
	}

}

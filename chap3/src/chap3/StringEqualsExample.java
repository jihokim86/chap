package chap3;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		//문자열 비교
		String strVar1 = "JAVA";
		String strVar2 = "JAVA";
		String strVar3 = new String("JAVA");
		
		System.out.println(strVar1 == strVar2); //true
		System.out.println(strVar1 == strVar3); //false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true
		System.out.println(strVar1.equals(strVar3)); //true
	}

}


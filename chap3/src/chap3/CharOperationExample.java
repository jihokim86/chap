package chap3;

public class CharOperationExample {

	public static void main(String[] args) {
		
		// char 타입 연산
		char c1 = 'A'+1; //자바에서 리터널 간의 연산은 문제 없다!
		char c2 = 'A';
//		char c3 = c2+1; //피연산자는 int타입으로 변환되고 1과 연산함
		int c3 = c2+1;  // int타입으로 받아줘야 한다.
		char c4 = (char)(c2+1); //강제변환을 하던지!
		
		System.out.println("c1="+c1); // B
		System.out.println("c2="+c2); // A
		System.out.println("c3="+c3); // 66
		System.out.println("c4="+c4); // B
		
	}

}

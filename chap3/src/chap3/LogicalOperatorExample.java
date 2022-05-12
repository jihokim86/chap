package chap3;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// 논리 연산자
		int charCode = 'A';
		
		if((charCode>=65)&&(charCode<=90)) {
			System.out.println("대문자이군요");
		}
		
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자이군요");
		}
		
		if((charCode<48)&&(charCode>57)) {
			System.out.println("0~9숫자이군요");
		}
		
		int value = 6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2또는3의배수군요");
		}
		
		if((value%2==0)||(value%3==0)) {
			System.out.println("2또는3의배수군요");
		}
	
	}

}

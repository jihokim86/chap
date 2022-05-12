package chap3;

public class CompareOperatorExample {

	public static void main(String[] args) {
			
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1="+result1); //true
		System.out.println("result2="+result2); //false
		System.out.println("result3="+result3); //true
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4="+result4); //true
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); //true 
		//비교시에도 큰쪽으로 자동타입변환되어 연산한다.
		
		double v4 = 0.1;
		float v5 = 0.1f; // 0.1에 근사한 값이지 0.1은 아니다.
		System.out.println(v4==v5); //false 
		System.out.println((float)v4==v5); // true
		System.out.println((int)v4*10==(int)v5*10); //true
		
	}

}

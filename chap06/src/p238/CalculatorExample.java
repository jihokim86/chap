package p238;

public class CalculatorExample {

	public static void main(String[] args) {
		// 정적멤버사용
		
		//Calculator.pi = 52; 값이 변경되네???
		
		double result1 = 10*10*Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		//Calculator.pi = 52; 값이 변경되네???
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
	
	}

}

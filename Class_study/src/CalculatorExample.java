
public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
		Calculator calculator = new Calculator(); //객체를 생성(new 생산자())해서 클래스타입 변수 calculator에 주소저장
		
		// 메소드를 호출하기 위해서는 (클래스변수 + 도트(.)+메소드명)를 사용한다.
		
		calculator.powerOn();
		
		int result1 =  calculator.plus(10, 5);
		System.out.println(result1);
		calculator.divide(10, 5);
		
		calculator.powerOff();
		
		
	}

}

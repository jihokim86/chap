package class1_1;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
				Calculator calculator = new Calculator(); //객체를 생성(new 생산자())해서 클래스타입 변수 calculator에 주소저장
				
				// 메소드를 호출하기 위해서는 (클래스변수 + 도트(.)+메소드명)를 사용한다.
				
				calculator.powerOn();
				
//				System.out.println(result); 
				
				int result1 =  calculator.plus(10, 5); // 리턴값을 저장하기 위해 변수선을 또 해줘야한다.
				System.out.println(result1);
				
				byte x=10;
				byte y=5;
				double result2 = calculator.divide(x, y); //메소드에서 리턴값의 타입이 double이므로 리턴받을 변수도 동일하게 해주는게 좋음!
				System.out.println(result2);
				
				calculator.powerOff(); // 리턴 값이 없는 메소드 이므로 변수가 필요없다.

	}

}

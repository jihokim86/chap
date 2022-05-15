package class1_4;

public class CalculatorExample {

	public static void main(String[] args) {
		//참조 변수를 통해 객체를 생성해야 외부 클래스의 메소드를 호출할수있다!
		Calculator calculator = new Calculator();
		
		calculator.execute();
	}

}

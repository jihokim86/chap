package p217;

public class CalculatorExample {

	public static void main(String[] args) {
		//메소드 호출
		
		Calculator myCarlc = new Calculator();
		myCarlc.powerOn(); //매소드 호출
		
		int result1 = myCarlc.plus(5,6);
		System.out.println("result1:"+result1);
		
		byte x=10;
		byte y =4;
		double result2 = myCarlc.divide(x,y);
		System.out.println("result2:"+result2);
		
		myCarlc.powerOff();
	}

}

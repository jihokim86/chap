package p296;

public class ComputerExample {

	public static void main(String[] args) {
		//메소드 오버라디이 테스트
		
		int r=10;
		Calculator calculator = new Calculator();
		System.out.println("원면적 :"+calculator.areaCircle(r));
//		System.out.println("원면적 :"+calculator.areaCircle(double r));
		//잘생각해봐? 부모클래스의 필드에 접근코자 할때 car.model ="dd"
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 :"+computer.areaCircle(r));
	}

}

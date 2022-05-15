package class1_3;

public class CarExample {

	public static void main(String[] args) {
		//다른 클래스에서 메소드를 호출하고 할때
		//1. 클래스 설계도에서 new연산자를 통해 객체를 생성해야한다!(인스턴스)
		//객체가 존해해야 메소드도 존재하기 때문이다!!!!
		Car car = new Car();
		
		//외부 클래스에 접근하여 상호작용을 하기 위해서는 ! 생성 객체의 참조변수명+도트(.)+필드명 or 매소드명
		
		//car.gas; 이렇게는 정의가 안되네!!
		System.out.println(car.gas);//필드명인 gas값을 호출 // 0 출력됨!
		
		car.setGas(10); //리턴값이 없는 메소드! 필드값을 초기화해주기 위함!! gas=10이라고 초기화해줌!
		System.out.println(car.gas); //10 출력 (필드 gas=10으로 저장됨!)
		
		//car.isLeftgas(); 리턴값이 있으니 변수에 저장을 해야지!!!
		boolean gasState = car.isLeftgas();
		System.out.println(gasState); //true
		
		if(gasState) {  // true이면 실행하겠지!!!
			System.out.println("출발합니다");
			car.run(); //run()메소드 호출! 리턴값은 없는 놈임!
						// 필드 값인 gas값이 1씩 줄어드는 기능이 있음!
						//run()함수는 반복문이다!!
		}
		
		if(car.isLeftgas()) { //gas의 값에 따라 isLeftgas의 리턴값이 참 or 거짓으로 
			System.out.println("gas를 주입할 필요가 없습니다"); // 이건 출력이 되는걸까?????
		}else {
			System.out.println("gas를 주입해주세요!");//run()메소드가 완료되면 gas=0이지!!!
		}
		
	}
}

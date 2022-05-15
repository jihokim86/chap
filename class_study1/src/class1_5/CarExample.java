package class1_5;

public class CarExample {

	public static void main(String[] args) {
		//외부 클래스에서 메소드를 호출하려면 참조변수를 통해 객체를 먼저 생성해야한다!
		Car car = new Car();
		
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		
		System.out.println("현재속도:"+ speed + "km/h");
		//System.out.println("현재속도:"+ car.speed + "km/h"); 
		//이렇게 해도 결과 값은 동일해 보인다!! 구지 getSpeed()메소드가 없어도 될듯?
		//마지막에 필드 speed 변수에 50이 저장되기에. car.speed를 통해 출력해도 50이겠지?
	}
}

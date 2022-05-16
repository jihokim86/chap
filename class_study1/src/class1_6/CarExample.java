package class1_6;

public class CarExample {

	public static void main(String[] args) {
		//외부 클래스에서 Car 필드 값 읽기와 변경
		//외부 클래스의 필드에 접근하고 하면 객체를 먼저 생성해야한다
		//필드가 객체에 소속된 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
		
		//객체생성
		Car car = new Car();
		
		
		//필드값 변경
		//같은 클래스 내부에서 필드값의 사용방법은 변수와 동일하지만
		//차이점은 변수는 자신이 선언된 생성자 또는 메소드 블록내부에서만 사용가능하지만
		// 필드는 생성자와 모든 메소드에서 사용가능하다
		System.out.println(car.color);		//검정
		System.out.println(car.company);	//현대자동차
		System.out.println(car.maxSeed);	//350
		System.out.println(car.model);		//그랜져
		System.out.println(car.speed);		//0 필드는 자동으로 초기화된다.
		
		//필드값 변경
		car.speed = 60;
		System.out.println(car.speed);		//60
		
	}

}

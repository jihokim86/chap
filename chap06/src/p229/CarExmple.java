package p229;

public class CarExmple {

	public static void main(String[] args) {
		//클래스 외부에서 메소드 호출
		
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getspeed(); //객체 외부에서 메소드 호출
		System.out.println("현재속도:"+speed+"km/h)");
	}

}

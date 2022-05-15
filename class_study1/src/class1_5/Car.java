package class1_5;

public class Car {
	//필드
	int speed;
	//생성자
	Car(){
	}

	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void run() {
		for(int i=0; i<=50; i++) {
			speed = i;
			System.out.println("시속:"+speed+"km/h");
		}
	}
}


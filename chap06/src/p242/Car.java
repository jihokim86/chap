package p242;

public class Car {

//정적 메소드와 블록 선언 시 주의할 점
	int speed;
		
		void run() {
			System.out.println(speed + "으로 달립니다");
		}
		
		public static void main(String[] args) {
			Car myCar = new Car();
			myCar.speed = 60;
			myCar.run();
		}
	}



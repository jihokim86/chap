package p201;

public class CarExample {
	public static void main(String[] args) {
		//외부 클래스에서 Car필드값 읽기와 변경
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사 :"+myCar.company);
		System.out.println("모델명 :"+myCar.model);
		System.out.println("색깔 : "+ myCar.color);
		System.out.println("최고속도 : "+ myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed); //0 ,필드에서 자동으로 초기화됨.
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);
		Car2();
	}//end of main
		
//		Car2(); //함수 실행문
		public static void Car2() { //함수 내에서 필드 값이 변경되나 확인중?
			Car myCar = new Car();
			System.out.println("???"+myCar.maxSpeed);
			myCar.maxSpeed=100;
			System.out.println("???"+myCar.maxSpeed);
		}
	}


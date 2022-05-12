package p296;

public class Computer extends Calculator {
	//자식 클래스
	//메소드
	@Override
	double areaCircle(double r) {
		System.out.println("areaCircle 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}

package p314;

public class HankookTire extends Tire{
	
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	//메소드

	@Override
	public boolean roll() {
		++accumulatedRotation; 		//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {	
			System.out.println(location + " HankookTire 수명"+
					(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
	}
}

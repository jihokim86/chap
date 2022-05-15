package class1_2;

public class Computer {
	//매개변수의 개수를 모를 경우
	//필드
	//생성자
	public Computer() {
	}
	
	//메소드
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values ) {
		int sum1=0;
		for(int i=0; i<values.length;i++) {
			sum1 += values[i];
		}
		return sum1; //리턴후 무조건 메소드 종료
		//System.out.println("리턴이후 메소드 종료"); !!적합하지 않음
		//조건식안에 리턴이 있을 경우도있음!! 제일 마지막 리턴값 이후 메소드 종료
	}
}

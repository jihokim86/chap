package class1_2;

public class ComputerExample {

	public static void main(String[] args) {
		//매개 변수의 개수를 모를 경우
		
		//1.사용하고자 하는 클래스에서 객체를 만들어야한다!(인스턴스!)
		//2. 객체를 만드는 방법은 클래스타입 참조변수명 = new 해당 클래스의 생성자
		Computer computer = new Computer();
		
		int[] values1= {1,2,3};
		int result1 = computer.sum1(values1);
		System.out.println(result1);	//6
		int result2 = computer.sum2(values1);
		System.out.println(result2);	//6
		
		int result3 = computer.sum1(new int[] {1,2,3,4,5}); //new 안쓰면 에러발생
		System.out.println(result3);	//15
		int result4 = computer.sum2(new int[] {1,2,3,4,5}); //new 안쓰면 에러발생
		System.out.println(result4);	//15
		
//		int result5 = computer.sum1(1,2,3); //sum1(int[] values)와 매칭되지 않아서 오류
//		System.out.println(result5);	
		int result6 = computer.sum2(1,2,3); //sum2(int ... values)와 매칭잘됨
		System.out.println(result6);	//6
		
	}
}

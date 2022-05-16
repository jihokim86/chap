package class1_6;

public class KoreanExample {

	public static void main(String[] args) {
		//외부클래스 객체생성
		Korean korean = new Korean("김자바", "010-10110-10", "미국");
		
		System.out.println(korean.name); 	//김자바
		System.out.println(korean.nation);	//미국
		System.out.println(korean.ssn);		//010-10110-10
	}

}

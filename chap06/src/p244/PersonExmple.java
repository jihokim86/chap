package p244;

public class PersonExmple {

	public static void main(String[] args) {
//fanal  v필드 테스트
		Person p1 = new Person("12213312-121232","계백");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "33434-3434"; final 에러
		p1.name = "을지";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}

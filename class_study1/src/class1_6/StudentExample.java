package class1_6;

public class StudentExample {

	public static void main(String[] args) {
		//클래스로 부터 객체 생성
		// 생성된 객체들은 student 클래스의 인스턴트 들이다.
		Student student1 = new Student();
		System.out.println("s1 변수가 Student1 객체를 참조합니다");
		
		Student student2 = new Student();
		System.out.println("s2 변수가 Student2 객체를 참조합니다");
		
		System.out.println(student1); // 7c30a502
		System.out.println(student2); // 49e4cb85
	}

}

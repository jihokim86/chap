package p294;

public class StudentExample {

	public static void main(String[] args) {
		//자식 객체 이름
		Student student = new Student("홍길도","13245-123456",1);
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
		System.err.println("studentNo : "+student.studentNo);
	}

}

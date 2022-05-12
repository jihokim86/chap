package p294;

public class Student extends People{
	//자식클래스
	public int studentNo;
	
	//생성자
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
}

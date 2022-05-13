package p195;

public class SutdentExample {

	public static void main(String[] args) {
// 클래스로부터 객체 생성
		Student student1 = new Student();
		System.out.println("student1 변수가 Student 객체를 참조합니다");
		
		Student student2 = new Student();
		System.out.println("student2 변수가 Student 객체를 참조합니다.");
		
//		System.out.println(student1); // p195.Student@7637f22 주소가 출력되는듯
//		System.out.println(student2); // p195.Student@4926097b 
		
		//???????????????????? 주소가 객체 따라 정해지는게 아니라?? 출력순서에 따라 달라지네?
		
		 System.out.println(student2); // p195.Student@7637f22 
		 System.out.println(student1); // p195.Student@4926097b 
		
	}
	

}

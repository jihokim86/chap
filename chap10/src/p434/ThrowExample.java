package p434;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않는다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.Srint2");
	
    }
}

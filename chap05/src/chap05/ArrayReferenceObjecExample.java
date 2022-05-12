package chap05;

public class ArrayReferenceObjecExample {

	public static void main(String[] args) {
		// 객체를 참조하는 배열
		// 기본타입 배열은 각 항목에 직접 값을 갖고 있지만, 참조타입 배열은 각 항목에 객체
		// 의 번지를 가지고 있다.
		String[] strArray = new String[3];
		strArray[0] = "java"; //번지가 들어가는게 아니라 값이 들어가네??
		strArray[1] = "java"; //기본타입에는 값을 넣었지
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]); 	//true
		System.out.println(strArray[0] == strArray[2]); 	//false
		System.out.println(strArray[0].equals(strArray[2]));//true
		
	}

}

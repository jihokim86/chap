package p426;

public class ArrayIndexOutBoundsException {

	public static void main(String[] args) {
		String data1 = args[0];//외부에서 배열 생성을 한듯합니다
		String data2 = args[1];
		
		System.out.println("args[0]:"+data1);
		System.out.println("args[1]:"+data2);
	}

}

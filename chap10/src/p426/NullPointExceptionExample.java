package p426;

public class NullPointExceptionExample {

	public static void main(String[] args) {
		String data= null;
		System.out.println(data.toString());
		//객체의 데이터가 없는데 String 객체를 참조하고 있지 않음
		System.out.println(data);
	}

}

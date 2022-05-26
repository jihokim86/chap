package p658;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
//		Box<String> box1 = new Box<>();  위와 동일
		box1.set("hello");
		
		String str = box1.get();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
//		Box<Integer> box2 = new Box<>(); 위와 동일
		 
		box2.set(6);
		int value = box2.get();
		System.out.println(value);

	}

}

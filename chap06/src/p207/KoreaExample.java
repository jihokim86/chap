package p207;

public class KoreaExample {

	public static void main(String[] args) {
		Korea k1 = new Korea("박자바", "0015-1588");
		System.out.println("k1.name:"+k1.name);
		System.out.println("k1.ssn:"+k1.ssn);
		System.out.println("k1.ssn:"+k1.nation);
		
		Korea k2 = new Korea("박바", "1010-4848");
		System.out.println("k2.name:"+k2.name);
		System.out.println("k2.ssn:"+k2.ssn);
	}

}

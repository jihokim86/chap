package p426;

public class NumberFromatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int values1 =Integer.parseInt(data1);
		//int values2 =Integer.parseInt(data2);
		
		System.out.println(data1+5);
		System.out.println(values1+5);
	}

}

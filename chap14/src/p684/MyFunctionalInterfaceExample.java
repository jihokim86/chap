package p684;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		fi.method(2,5);
		System.out.println(fi.method(2,5));
		
		fi = (x,y) -> {return x+y;};
		System.out.println(fi.method(2,5));
		
		fi = (x,y) -> x+y; //리턴문만 있을경우 {} return 생략가능
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return x+y;
	}
}

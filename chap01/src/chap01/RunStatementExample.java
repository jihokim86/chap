package chap01;

public class RunStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 타입을 선언하는 이유는 메모리의 낭비를 줄이기 위해서이다
//		int x=1;
//		short int x=5;
		short x=3;
		int y=2;
		int result = x+y;
		System.out.println(x+"+"+y+"="+result);
		System.out.print(x+"\n");
		System.out.print(y+"\n");
		System.out.println(x+"+"+y+"="+x+y);
		System.out.println(x+"+"+y+"="+(x+y));
		
	}

}

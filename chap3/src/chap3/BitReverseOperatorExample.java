package chap3;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		
		// 비트 반전 연산사 (- 연산자 사용 해도 됨)
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1+1;
		
		System.out.println(toBinaryString(v1)+"(십진수 :"+v1+")");
		System.out.println(toBinaryString(v2)+"(십진수 :"+v2+")");
		System.out.println(toBinaryString(v3)+"(십진수 :"+v3+")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		
		System.out.println(toBinaryString(v4)+"(십진수 :"+v4+")");
		System.out.println(toBinaryString(v5)+"(십진수 :"+v5+")");
		System.out.println(toBinaryString(v6)+"(십진수 :"+v6+")");
		
	}
	// 정수값을 총 32비트의 2진문자열로 리턴하는 메소드.앞의 비트가 모두 0이면 0은 생략하고 나머지 문자열만 리턴
	// 32개의 문자열을 모두 얻기 위해 반복문을 통해 32보다 짧으면 0을 붙이도록 함.
	public static String toBinaryString(int value) { 	
		String str = Integer.toBinaryString(value);		
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}

}

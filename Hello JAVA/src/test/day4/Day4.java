package test.day4;

public class Day4 {

	public static void main(String[] args) {
		System.out.println("hello"); //hello
		
		//타입변환
		byte a=10;
		int b=a;	
		System.out.println(a); //10
		System.out.println(b); //10
		
		//자동타입변환(작은범위타입은 큰범위타입으로 자동변환이 가능함)
		// byte < short < int < long < float < double
		byte c=100;
		int d=c;
		byte h=c;
		float f=3.14f;
		double g=f;
		long q=c;
		//char z=c; //범위는 맞으나 char는 음수를 가지지 못하기에 컴파일 오류
		System.out.println(c); //100
		System.out.println(d); //100
		System.out.println(f); //3.14
		System.out.println(g); //3.140000104904175 ??????
		System.out.println(h); //100
		System.out.println(q); //100
		
		char p='A'동이
		int y=p;
		//byte r=p; 컴파일 오류 char 범위가 큼
		long x=p;
		float v=p;
		System.out.println(p); //A
		System.out.println(y); //65 유니코드
		System.out.println(x); //65
		System.out.println(v); //65.0
		
		
		//강제타입변환(큰범위 타입을 작은범위 타입으로 강제 변환 시킴. 구지???)
		int kim=65;
		byte ji=(byte)kim;
		char how=(char)kim;
		float hue=(float)kim;
		double iow=3.14;
		int oiw=(int) iow;
		System.out.println(ji); //65 
		System.out.println(how); // kim=10 공백이 출력됨. 유니코드 10의미는?
		System.out.println(hue); //65.0
		System.out.println(oiw); //3 ,소수부분은 버림
		
		//정수에서 자동타입변환
		//산술연산자가 사용되는 과정에서 int보다 작은 변수(byte short)는 int로 
		//자동변환되어 계산함.왜?? 변환해서 계산하는건데???
		byte a1=10;
		byte a2=100;
		int a3=a1+a2;
		//byte a4=a1+a3; 오류남.int로 변환해서 계산하였기에 범위를 벗어난 결과임
		long a5=a1+a2; //범위안이라서 자동변환되어도 결과 도출됨
		int a6=(int)a1 + (int)a2 + a3; //강제변환
		byte a7=10+10; 
		long a8=a1+a3+a5; //byte + int + long
		double a9=a6 + 3.14;
		//float a10=a6 + 3.14; // 컴파일 에러 3.14뒤에 f를 안쓰면 double로 인식.
		double a11= a1/a7; // 10/20=0.5 가출력되야하지만.
		double a12=(double)a1/(double)a7;
		int a13=a1/a7;
		
		System.out.println(a3); //110 
		System.out.println(a5); //110 왜 byte를 int로 자동변환하냐고..구지?
		System.out.println(a6); //220 강제변환하여 연산하면 가능함
		System.out.println(a7); //20 변수가 피연사자로 사용될때만 자동변환됨
		System.out.println(a8); //230 피연산자의 타입이 다양할경우 큰변수타입으로 변환하고 계산함
		System.out.println(a9);	//223.14 실수타입일때도 마찬가지임
		System.out.println(a11); //0.0 자바에서는 정수연산의 결과는 정수로 됨. 그래서 0.0이나옴
		System.out.println(a12); //0.5 그렇기에 실수연산으로 변경해줘야함.
		System.out.println(a13); //0 자바에서는 정수연산결과를 정수로 한다는걸 알수있음.
		
		
		//연산에서의 문자열 자동타입변환
		int b1=10+8+2;
		System.out.println(b1); //20
		//String b2=10+8+2; 컴파일 에러
		String b3=10+8+"2";
		System.out.println(b3); // 18+"2" -> "182" 왜 여기서는 계산을 하는거지???
		
		String b4="10"+8+2;
		System.out.println(b4); //"108"+2 -> "1082"
		
		String b5= 10+"8"+2;
		System.out.println(b5); //"108"+2 -> "1082"
		
		String b6="10"+(8+2);
		System.out.println(b6); //"10"+10 -> "1010"
		
		
		//문자열을 기본타입으로 강제타입변환( 숫자를가진 문자열만 가능함)
		String c1="10";
		String c2="A";
		System.out.println(c1); //10
		System.out.println(c2); //A
		
		int c3=Integer.parseInt(c1);
		System.out.println(c3); //10 출력값을 보고 문자열인지 정수인지 어떻게 구별하지?
		System.out.println(Integer.parseInt(c1)); //10
		System.out.println(Integer.parseInt("10"));//10
		
		//char c4='1';
		String c5="5000";
		//int c6=Integer.parseInt(c4); string에만 적용가능함
		int c7=Integer.parseInt(c5);
		System.out.println(c7); //5000
		//System.out.println(Integer.parseInt("3.14")); 
		System.out.println(Float.parseFloat("3.14")); //3.14
		System.out.println(Double.parseDouble("3.14")); //3.14
		
		//Int c8=10; 변수타입은 소문
		//System.out.println(c8);
		
		
		
		
	}

}

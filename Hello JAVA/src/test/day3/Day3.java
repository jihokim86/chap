package test.day3;

public class Day3 {
	public static void main(String[] args) {
		
		//값 저장
		int a=0,x=1;
		int b=3,y=a+b;
		int z=x+10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(z);
		System.out.println("a+b="+y);
		//System.out.println("a+b="a+b); 오류발생 Why?
		System.out.println("a+b="+a+b); //결과 이상함
		System.out.println("a+b="+(a+b)); //괄호 해주니 먼저 계산하는구나....
		
		//변수사용
		int hour=3;
		int minute=5;
		int total=hour*60+minute;
		
		System.out.println(hour+"시간"+minute+"분");
		System.out.println("총"+total+"분");
		
		//복사(저장)개념
		int c=10;
		int k=c;
		int l=k+5;
		System.out.println(c);
		System.out.println(k);
		System.out.println(l);
		
		/*변수사용범위
		int v1=15;
		int v2=0;
		if(v1<10) {
			//int v2;
			v2=v1+10;
			System.out.println(v2); //조건이 안맞으면 실행을 안하는군
		}
		 	//int v3=v1+v2; v2는 if 블럭 안에서만 가능
           	int v3=v1;		
		System.out.println(v1);
		//System.out.println(v2); 에러발생. v2는 if블럭 안에서만 가능
		System.out.println(v3);
		*/
		

		int c1=10000000;
		//long c2=10000000000000; //에러발생
		long c2=10000000000000L;
		char c3='가';
	    int c4='가';
	    String c5="안녕!자바";
	    String c6="안녕\n자바\n\"출력";
	    float c7=3.142464845136584f; //f가 생명이다.
	    double c8=3.142464845136584; 
	    
	    boolean stop = true; //만약 fulse값이면 else블록실행
	    if(stop) {
	    	System.out.println("중지합니다");
	    }else {
	    	System.out.println("시작합니다");
	    }
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println(c5);
	    System.out.println(c6);
	    System.out.println(c7); //float 7자리
	    System.out.println(c8); //double이 15자리
	    
	
	}
}

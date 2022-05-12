package test.day5;
import java.util.Scanner;

public class Day5 {
	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		
		//변수와 시스템 입출력
		//System.out 시스템의 표준 출력 장치.
		//System.in.read(); 표준 입력 장치.
		//System.out.println(리터럴 또는 변수);
		//ln=line 행을 변경하라는 의미를 가짐
		//printf 와 print 기능에 대해서 공부
		
		System.out.printf("이름:%s\n" , "자바"); //이름:자바 
		System.out.printf("이름:%d\n", 123); // 이름 : 123
		System.out.printf("이름:%s\n", 123); // 이름 :123
		// %s는 문자열을 뜻함, %d는 정수를 뜻함, \n은 줄바꿈
		// 결과값 만으로 문자열인지 정수인지 판단이 안됨.		
		//System.out.printf("이름:%s\n", 자바); 무슨 오류일까?
		
		System.out.printf("이름:%1$s,나이:%2$d\n", "자바", 123);
		System.out.printf("이름:%2$s\n나이:%1$d\n", 456, 123);
		
		String pN1="010";
		String pN2="118";
		String pN3="358";
		
		System.out.printf("전화번호:%1$s- %2$s - %3$s\n",pN1,pN2,pN3);
		
		int rad = 16;
		float area=3.14f*rad*rad;
		String area1= String.valueOf(area); //정수타입 -> 문자열 타입으로 강제변환
		String area2= area+""; // area정수와 문자열"공백"이 연산되면 자동으로 문자열이되는 특성
		System.out.printf("반지름이 %1$d인 원의 넓이는:%2$10.2f\n",rad,area);
		System.out.printf("반지름이 %1$d인 원의 넓이는:%2$s\n",rad,area1);
		System.out.printf("반지름이 %1$d인 원의 넓이는:%2$s\n",rad,area2);
		
		
		//키보드에서 입력된 내용을 변수에 저장하기(키보드에 입력된 키를 키코드로 읽기)
		//public static void main(String[] args) throws Excepton{ //추후에 배움
		
		/*System.out.println("키를 입력하시면 키코드 값이 출력됩니다.");
		int keyCode = System.in.read(); 
		System.out.printf("입력된 키코드 값은 %d\n",keyCode);
		System.out.println(keyCode); //a를 콘솔창에서 입력하면 키코드 97이 출력됨
		
		int code;
		code=System.in.read();
		System.out.println(code); // 콘솔창에 a 입력다음 Enter입력 값에 대한 출력값 13
		
		code=System.in.read();
		System.out.println(code); // 10 출력됨 쉽게 이해하면 엔터를 투입때 한번 개방때 한번 인식
		
		code=System.in.read();
		System.out.println(code); // 그다음 키보드 입력하면 키코드 출려됨*/
		
		/*// 입력된 키의 개수와 상관없이 키코드 읽이
		while(true) { //반복문 
			int code2;
			code2=System.in.read();
			System.out.println(code2);
			if(code2==113) { //q(키코드113) 일때 중지
				break;			
			}
		}
		System.out.println("종료");*/
		
		
		
		//2개 이상의 키가 조합된 한글을 읽기위해 scanner클래스를 제공.
		Scanner scanner=new Scanner(System.in); //생성된 Scanner를 변수에 저장
		//String srt; //변수 범위 설정 확인 요망. 선언해도 문제는 없네
		
		while(true) {
		System.out.println("값을 입력하시오");
		String str=scanner.nextLine(); // 엔터입력전까지 값을 String타입의 변수 str에 저장
		System.out.printf("입력된 값은 %s 입니다\n", str);
			if(str.equals("종료")) {
			break;
		 	}
		System.out.println("종료를 원할시 \"종료\"를 입력하시오");
		}
		System.out.println("종료되었습니다.");
		scanner.close();
		}
	
	}
	
	



package homework1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		//키보드로 입력 받아 출력하기
		Scanner scan= new Scanner(System.in);
		
		int input1=scan.nextInt(); 
		System.out.println("입력된정수:"+input1);
		// 정수를 리턴하고 Enter값도 리턴해서 다음 문자열 소스가 넘어가버림
		
		//String input5 = scan.nextLine();
		// nextLine을 추가해서 enter값을 없애주는??
		
		String input = scan.nextLine();		
		System.out.println("입력된 문자열 :"+input);
		//Enter를 치기 전까지 쓴 모든 문자열을 리턴
		
		double input2=scan.nextDouble();
		System.out.println("입력된실수:"+input2);
		
		String input3 =scan.next();
		System.out.println("입력된 문자열:"+input3);
		//Space공백전까지 입력된 문자열을 리턴
		
		scan.close();
		
		
		
		
	}

}

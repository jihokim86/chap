package chap02;

import java.io.IOException;
import java.util.Scanner;

public class Java_Jinsu {
	public static void main(String[] args) throws IOException {

		Scanner my_in = new Scanner(System.in);	 	// 클래스의 형식을 가진 메모리를 만들어라(new 객체 생성 연산자)
													// my_in은 Scanner로 시스템에서 입력을 읽어오는 객체
		
		while(true) {
			
		System.out.print("10진수를 입력하세요 : ");		
		
		
		int ken = Integer.parseInt(my_in.next());	// ken은 my_in에서 읽어온 값을 정수형으로 변환한 값	
		
		my_in.close();								// Scanner는 계속 입력을 받기 때문에 닫아주어야 함.


		System.out.println("10진수는 : " + ken);
		System.out.println("2진수는 : " + Integer.toBinaryString(ken));
		System.out.println("8진수는 : " + Integer.toOctalString(ken));
		System.out.println("16진수는 : " + Integer.toHexString(ken));
		}
	}
}

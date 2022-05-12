package homework_1;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// 2개의 변수 a,b 값을 읽어서 a,b의 대솔 관계를 다음과 같이 표시해라
		// a가크다 , b가크다 , a와b가 같다.
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("a값을 입력하세요");
		int a = input1.nextInt();
		System.out.println("b값을 입력하세요");
		int b = input2.nextInt();
		
		if(a>b) {
			System.out.println("a가 크다");
		}else if(a<b) {
			System.out.println("b가 크다");
		}else {
			System.out.println("a와b가 같다");
		}
		input1.close();
		input2.close();
	}

}

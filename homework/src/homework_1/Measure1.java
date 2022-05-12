package homework_1;

import java.util.Scanner;

public class Measure1 {

	public static void main(String[] args) {
		// 2개의 양의 정수값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다"
		// 라고 표시하고 그렇지 않으면 B는 A의 약수가 아니다"라는 프로그램을 작성하시오
		
		
//		System.out.println("양수A ,양수B의 값을 입력하세요");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("양수 A값을 입력하세요");
		int num1 = input1.nextInt();
		System.out.println("양수 B값을 입력하세요");
		int num2 = input2.nextInt();
		
		
		int measure = num1%num2;
		
		if(measure==0) { //논리부정연산자 != 사용하면된다.
			System.out.println("B="+num2+"는 A="+num1+"의 약수이다");
		}else {
			System.out.println("B="+num2+"는 A="+num1+"의 약수가 아니다");
		}
		
		
		input1.close();
		input2.close();
	}

}


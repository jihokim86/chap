package homework_1;

import java.util.Scanner;

public class Multiple0f10 {

	public static void main(String[] args) {
		//입력한 정수값이 10의 배수이면 이 값은 10의 배수입니다
		//그렇지 않으면 10의 배수가 아닙니다
		//음수를 읽은 경우 음수입니다라고 출력하기
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수값을 입력하세요");
		
		int a = input.nextInt();
		int b=a%10;
		System.out.println(b);
		if(a>=0) {
		  if (b == 0) {
			  System.out.println("입력 값 :"+ a);
			  System.out.println("이 값은 10의 배수입니다.");
		  }else if(b != 0) {
			  System.out.println("입력 값 :"+ a);
			  System.out.println("이 값은 10의 배수가 아닙니다.");
		  }
		}else {
			System.out.println("입력 값 :"+ a);
		    System.out.println("음수를 입력하셨습니다.");
		}
		input.close();
		
	}

}

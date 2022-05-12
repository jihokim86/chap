package homework_1;

import java.util.Scanner;

public class Nagative {

	public static void main(String[] args) {
		// 키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다." 라고 표시하는
		// 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요!");
		
		int input = scan.nextInt();
		
		if(input>0) {
		System.out.println(input);
		}else {
			System.out.println("이 값은 음의 값입니다");
		}
		scan.close();
	}
}

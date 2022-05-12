package homework_1;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
//		읽은 정수 값은 부호를 판정해서 표시
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int num = input.nextInt();
		
		if(num>0) {
			System.out.println("정수값:"+num);
			System.out.println("입력된 정수는 양수입니다");
		}else if(num<0) {
			System.out.println("정수값:"+num);
			System.out.println("입력된 정수는 음수입니다");
		}else {
			System.out.println("정수값:"+num);
			System.out.println("입력된 정수는 0입니다");
		}
		input.close();
	}

}

package homework_1;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {
		//정수값을 읽어서 절대 값으로 표시
		do {
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("입력한 정수값의 절대값을 구합니다. 정수를 입력해주세요");
			
			int input = scan.nextInt();
			
			if(input<=0) {
				System.out.println("입력하신 값"+input+"의 절대값은"+-input+"입니다");
			}else {
				System.out.println("입력하신 값"+input+"의 절대값은"+input+"입니다");
			}
		scan.close();
			
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("=========================================");
		}
		}while(true);
		
	}

}

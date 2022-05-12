package homework_1;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		//입력한 점수에 따라 수/우/미/양/가 를 판정하는 프로그램을 작성해라
		//점수를 기준으로 성적 판정(논리곱 연산자 &&를 이용
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("성적을 입력하시면 등급이 출력됩니다");
		
		int a= input.nextInt();
		
		if(a<=100 && a >= 90) {
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("\"수\" 등급입니다");
		}else if(a <90 && a>=80) {
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("\"우\" 등급입니다");
		}else if(a <80 && a>=70) {
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("\"미\" 등급입니다");
		}else if(a <70 && a>=60) {
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("\"양\" 등급입니다");
		}else if(a<60 && a>=0){
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("\"가\" 등급입니다.");
		}else {
			System.out.print("입력된 점수 "+a+" 점은 ");
			System.out.println("잘못 입력 하셨습니다.");
		}
		input.close();
	}

}

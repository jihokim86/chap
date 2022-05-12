package chap04;

public class IfElseExample {

	public static void main(String[] args) {
		
		//if - else 문
		int score = 55;
		
		if(score >=90) {
		System.out.println("점수가 100~90 입니다");
		System.out.println("등급은 A입니다");
		}else if(score >=80) {
			System.out.println("점수가 89~80 입니다");
			System.out.println("등급은 B입니다");
		}else if(score >=70) {
			System.out.println("점수가 79~70 입니다");
			System.out.println("등급은 C입니다");
		}else if(score >=60) {
			System.out.println("점수가 69~60 입니다");
			System.out.println("등급은 D입니다");
		}else {
				System.out.println("점수가 60점 미만입니다");
				System.out.println("등급은 F입니다");
			}
}
}
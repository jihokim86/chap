package chap04;

public class Sungjuk {

	public static void main(String[] args) {
		
		int score = 95;
		
		int num = score/10;
		if(num == 10) {
			num = 9;
		}
		
		switch(num) {
		case 9:
			System.out.println("A 학점 입니다");
			break;
		case 8:
			System.out.println("B 학점 입니다");
			break;
		case 7:
			System.out.println("C 학점 입니다");
			break;
		case 6:
			System.out.println("D 학점 입니다");
			break;
		
		default:
			System.out.println("F 학점 입니다");
			break;		
	}

}
}

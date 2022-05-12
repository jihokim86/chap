package sec03.exam001;
import java.util.Scanner; // java에서 Scanner 클래스 호출?

public class Scan {

	public static void main(String[] args) {
		
		//유저로부터 받은 값을 연산하여 출력하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("x값을 입력하시오 : ");
		
		int x = scan.nextInt(); // int 형 입력 및 리턴
		
		System.out.println("y값을 입력하시오 :");
		
		int y = scan.nextInt(); // int 형 입력 및 리턴
        
		int z=0;
        		
		z= x+y;
		
		System.out.println("x와y의 합은="+z);
		scan.close(); // Scanner resource leak error 발생하면 추가 입력 필요
	

	}

}

package homework1;

public class MuletiplicactionTable {

	public static void main(String[] args) {
		
		//구구단 출력 2~9단 ,콘솔창에서 한눈에 볼 수 있게
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d X %d = %2d\t",j,i,(i*j));	
				//	1x2 1x3 1x4 ...-> 앞뒤 순서만 바꿔서 출력
				// %2d : 2자리정수(왼쪽공백), %-2d :2자리정수(오른쪽공백)
				// %06d : 6자리정수(왼쪽빈자리 0으로 채움),
			}
			System.out.println(""); // 1x9 이후 행바꿈
		}
		
	} //end of main
} // end of class

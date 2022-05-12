package homework1;

public class MuletipleicationTable2 {

	public static void main(String[] args) {
		
		//구구단 출력 2~5단 / 6~9단 콘솔창에서 한눈에 볼 수 있게
		
		for(int k=0;k<2;k++) {
		for(int i=1;i<=9;i++) {
			for(int j=2+4*k;j<=5+k*4;j++) {
				System.out.printf("%d X %d = %2d\t",j,i,(i*j));	
			}
			System.out.println(""); // 1 x 5 완료 후 행 바꾸고 2 x 2 를 시전
		  }
		System.out.println(""); // 5단 이후 행 바꿈
		}
		
	} //end of main
}//end of class

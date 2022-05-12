package homework1;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		
		//* 로 이루어진 다이아몬드 형태 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.print("홀수 행을 입력하세요:");
		int x = scan.nextInt(); //nextline과 무슨 차이??
		
//		int x=7; // 총 행의 수
		int y=x-x/2; //위쪽 아래쪽 구분하기 위한 변수
		for(int i=1;i<=x/2+1;i++) {
			for(int j=1;j<=-1*(i-1)+x/2;j++) { 	//공차가 -d, 첫째항 (x/2)은 등차수열의 일반항 -d(n-1)+x/2
				System.out.print(" ");			//공백을 넣기 위한 for문
			}
			for(int k=1; k<=2*(i-1)+1 ; k++) { 	//공차가 d, 첫째항 1은 등차수열의 일반항 d(n-1)+1 
				System.out.print("*");			//별을 넣기 위한 for문
			}
				System.out.println();
		}
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=1*(i-1)+1;j++) {		//공차가 d, 첫째항 1은 등차수열의 일반항 d(n-1)+1
				System.out.print(" "); 			//공백을 넣기 위한 for문
			}
			for(int k=1; k<=-2*(i-1)+(x-2); k++) { 	//공차가 -d, 첫째항 (x-2)은 등차수열의 일반항 -d(n-1)+(x-2) 
				System.out.print("*");			//별을 넣기 위한 for문		
			}
				System.out.println();
		}
		scan.close();
	}//end of main
}//end of class

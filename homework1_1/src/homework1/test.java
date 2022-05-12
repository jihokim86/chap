package homework1;

public class test {

	public static void main(String[] args) {
		int x=5;
		for(int i=1;i<=x-1;i++) {
			for(int j=1;j<=1*(i-1)+1;j++) {		//공차가 d, 첫째항 1은 등차수열의 일반항 d(n-1)+1
				System.out.print(" "); 			//공백을 넣기 위한 for문
			}
			for(int k=1; k<=-2*(i-1)+3; k++) { 	//공차가 -d, 첫째항 1은 등차수열의 일반항 -d(n-1)+1 
				System.out.print("*");			//별을 넣기 위한 for문		
			}
				System.out.println();
	}
	}
}



package chap04;


public class ContinueExample {

	public static void main(String[] args) {
		
		// continue를 사용한 for문
		for(int i=0; i<=50; i++){
			if(i%5 !=0) {
				continue;
			}
			if(i!=0) {
			System.out.println(i);
			}
		}
	}

}

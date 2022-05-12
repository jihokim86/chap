package chap05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 값의 리스트로 배열 생성
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1=0;
		for(int i=0;i<scores.length;i++) {
			sum1+=scores[i];
		}
		System.out.println("총합 :"+sum1);
	
	
		int sum2 = add(new int[] {83,90,87}); 
		//배열이 선언된 매소드가 있을 경우 값 목록으로 배열을 생성함과 동시에 
		//메소드의 매개값으로 사용하고자 할때 new연산자를 사용해야한다.
		System.out.println("총합 :"+sum2);
		System.out.println("");
	}
	
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		return sum;
	}
}

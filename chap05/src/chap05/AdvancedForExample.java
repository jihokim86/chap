package chap05;

public class AdvancedForExample {

	public static void main(String[] args) {
		//향상된 for문
		
		int[] scores = {95,71,84,93,87};
		int sum=0;
		for(int score:scores) { //for(배열에서 꺼낼 타입의 변수선언 : 배열)
			sum = sum + score;  // 배열의 항목수가 완료되어서 더이상 꺼낼 변수가 없을때 
								// 까지 반복한다.
		}
		System.out.println("점수총합 : "+sum);
		System.out.println("점수평균 : "+(double)sum/scores.length);
	}

}

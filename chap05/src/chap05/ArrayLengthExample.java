package chap05;
public class ArrayLengthExample {

	public static void main(String[] args) {
		//�迭�� length �ʵ�
		int[] scores = {83,90,87};
		int sum=0;
		for(int i =0; i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("���� : "+ sum);
		System.out.println("��� : "+ (double)sum/scores.length);
	}

}

package chap05;

public class AdvancedForExample {

	public static void main(String[] args) {
		//���� for��
		
		int[] scores = {95,71,84,93,87};
		int sum=0;
		for(int score:scores) { //for(�迭���� ���� Ÿ���� �������� : �迭)
			sum = sum + score;  // �迭�� �׸���� �Ϸ�Ǿ ���̻� ���� ������ ������ 
								// ���� �ݺ��Ѵ�.
		}
		System.out.println("�������� : "+sum);
		System.out.println("������� : "+(double)sum/scores.length);
	}

}

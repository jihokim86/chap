package chap05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// ���� ����Ʈ�� �迭 ����
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1=0;
		for(int i=0;i<scores.length;i++) {
			sum1+=scores[i];
		}
		System.out.println("���� :"+sum1);
	
	
		int sum2 = add(new int[] {83,90,87}); 
		//�迭�� ����� �żҵ尡 ���� ��� �� ������� �迭�� �����԰� ���ÿ� 
		//�޼ҵ��� �Ű������� ����ϰ��� �Ҷ� new�����ڸ� ����ؾ��Ѵ�.
		System.out.println("���� :"+sum2);
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
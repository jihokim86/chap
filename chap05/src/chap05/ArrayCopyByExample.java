package chap05;

public class ArrayCopyByExample {

	public static void main(String[] args) {
		//�迭 ����
		int[] oldIntArry = {1,2,3};
		int[] newIntArry = new int[5];
		
		for(int i=0;i<oldIntArry.length;i++) {
			newIntArry[i]=oldIntArry[i];
			System.out.println(newIntArry[i]);
		}
		
		for(int i=0;i<newIntArry.length;i++) {
			System.out.println(newIntArry[i]);
		}
	}

}

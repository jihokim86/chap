package chap04;

public class ForPrintFrom1to10Example {

	public static void main(String[] args) {
		
		// 1~10 합계구하기
		int sum=0;
		for(int i=1;i<=10;++i) {
			sum = sum+i;
		}
		System.out.println("sum="+sum);
	}

}

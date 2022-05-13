package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		
		
		// 산술 연산 전에 오버플로우를 탐지
		try {
			int result = safeAdd(2000000000, 1900000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
		
	}

	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if((long)left+right>(Integer.MAX_VALUE)) {  //(x+y>21억이면 에러발생)
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left+right;
	}
	
	

}
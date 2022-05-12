package chap04;

public class SrtingEqualsExample {

	public static void main(String[] args) {
		
		//문자열 비교
		String strVar1 = "김지호";
		String strVar2 = "김지호";
		
		if(strVar1 == strVar2){
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같음");
		}
		
//==================================================================		
		String strVar3 = new String("김지호");
		String strVar4 = new String("김지호");
		
		if(strVar3 == strVar4){
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("같음");
		
	}
  }
}

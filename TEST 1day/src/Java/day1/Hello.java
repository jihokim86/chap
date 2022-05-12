package Java.day1; /* 패키지 소스파일 및 컴파일된 바이트 코드 파일들을 
                      기능별로 쉽게 관리하기 위해 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello { // Class 블록
	
	public static void main(String[] arg) { //main 블록
		
		Date day = new Date();
		System.out.println(day);
		
		//long realTime = System.currentTimeMillis();
		//System.out.println(realTime);
		
		long realTime = 86400000;
		
		SimpleDateFormat conversion = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(conversion.format(realTime));
		System.out.println(conversion.format(day));
		
			}

}
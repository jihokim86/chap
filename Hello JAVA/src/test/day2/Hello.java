package test.day2;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		long realTime= System.currentTimeMillis();
		System.out.println(realTime);
		System.out.println(System.currentTimeMillis());
		
		SimpleDateFormat conversion = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(conversion.format(realTime));
		
		Date day = new Date();
		System.out.println(conversion.format(day));

	}

}

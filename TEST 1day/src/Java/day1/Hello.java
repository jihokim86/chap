package Java.day1; /* ��Ű�� �ҽ����� �� �����ϵ� ����Ʈ �ڵ� ���ϵ��� 
                      ��ɺ��� ���� �����ϱ� ���� */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello { // Class ���
	
	public static void main(String[] arg) { //main ���
		
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
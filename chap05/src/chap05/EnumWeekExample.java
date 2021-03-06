package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		//열거타입과 열거상수
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.THUSDAY;
			break;
		case 4:
			today = Week.WEDNEDAY;
			break;
		case 5:
			today = Week.THUSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : "+ today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 잠을 잔다");
		}else {
			System.out.println("그래도 잠을 잔다");
		}
	}

}

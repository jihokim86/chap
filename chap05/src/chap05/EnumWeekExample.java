package chap05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// ����Ÿ�԰� ���� ���
		Week today = null ; //����Ÿ�� ���� today����
		//Week today = Week.SUNDAY ���Ż�� �Ѱ��� ���� ����
		// -> today�� ����Ǵ� ���� ���Ż���� SUNDAY�� ��������
		Calendar cal = Calendar.getInstance();
		
		//Calendar.getInstance()�żҽ��� �����ϴ� Calendar��ü�� ��´�.
		//int year = now.get(Calendar.YEAR);//��
		int week = cal.get(Calendar.DAY_OF_WEEK);//��~�����(1~7)���� ���ڸ� ����
		//int month = now.get(Calendar.MONTH)+1;//��
		//int day = now.get(Calendar.Day_OF_MONTH);//��
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESAY;
			break;
		case 4:
			today = Week.WEDNSEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURADAY;
			break;

		default:
			break;
		}
		System.out.println("���� ����:"+today);
		
		if(today ==Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�");
		}else {
			System.out.println("������ Ƽ�� ���ϴ�.");
		}
	  }
	}


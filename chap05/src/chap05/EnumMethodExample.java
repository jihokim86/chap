package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {
		// ���� ��ü�� �żҵ�
		// name()�żҵ�
		Week today = Week.SUNDAY; // today������ �������� ����
		String name = today.name();//���Ű�ü�� ������ �ִ� ���ڿ��� �����Ͽ� name�� ����
		System.out.println(name); // 
		
		//ordinal()�żҵ� :��ü���Ű�ü�߸��° ���Ű�ü���� �˷���,0�����ͽ���
		int ordinal = today.ordinal();
		System.out.println(ordinal); //6��°.
		
		//compareTo()�޼ҵ� : �Ű������� �־��� ���� ��ü�� �������� ���ķ� ���° ��ġ�ϴ��� ��
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()�޼ҵ�:�Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ����
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURADAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱���");
			}else {
				System.out.println("�����̱���");
			}
		}
		
		//values()�޼ҵ� : ����Ÿ���� ��� ���� ��ü���� �迭�� ����� ����
		Week[] days = Week.values();
		for(Week day : days) { //�迭�������� Ÿ���� ��������...String���� �ϸ� �ȵǳ�?
			System.out.println(day);
		}
	}

}
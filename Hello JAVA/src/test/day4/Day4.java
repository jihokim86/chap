package test.day4;

public class Day4 {

	public static void main(String[] args) {
		System.out.println("hello"); //hello
		
		//Ÿ�Ժ�ȯ
		byte a=10;
		int b=a;	
		System.out.println(a); //10
		System.out.println(b); //10
		
		//�ڵ�Ÿ�Ժ�ȯ(��������Ÿ���� ū����Ÿ������ �ڵ���ȯ�� ������)
		// byte < short < int < long < float < double
		byte c=100;
		int d=c;
		byte h=c;
		float f=3.14f;
		double g=f;
		long q=c;
		//char z=c; //������ ������ char�� ������ ������ ���ϱ⿡ ������ ����
		System.out.println(c); //100
		System.out.println(d); //100
		System.out.println(f); //3.14
		System.out.println(g); //3.140000104904175 ??????
		System.out.println(h); //100
		System.out.println(q); //100
		
		char p='A'����
		int y=p;
		//byte r=p; ������ ���� char ������ ŭ
		long x=p;
		float v=p;
		System.out.println(p); //A
		System.out.println(y); //65 �����ڵ�
		System.out.println(x); //65
		System.out.println(v); //65.0
		
		
		//����Ÿ�Ժ�ȯ(ū���� Ÿ���� �������� Ÿ������ ���� ��ȯ ��Ŵ. ����???)
		int kim=65;
		byte ji=(byte)kim;
		char how=(char)kim;
		float hue=(float)kim;
		double iow=3.14;
		int oiw=(int) iow;
		System.out.println(ji); //65 
		System.out.println(how); // kim=10 ������ ��µ�. �����ڵ� 10�ǹ̴�?
		System.out.println(hue); //65.0
		System.out.println(oiw); //3 ,�Ҽ��κ��� ����
		
		//�������� �ڵ�Ÿ�Ժ�ȯ
		//��������ڰ� ���Ǵ� �������� int���� ���� ����(byte short)�� int�� 
		//�ڵ���ȯ�Ǿ� �����.��?? ��ȯ�ؼ� ����ϴ°ǵ�???
		byte a1=10;
		byte a2=100;
		int a3=a1+a2;
		//byte a4=a1+a3; ������.int�� ��ȯ�ؼ� ����Ͽ��⿡ ������ ��� �����
		long a5=a1+a2; //�������̶� �ڵ���ȯ�Ǿ ��� �����
		int a6=(int)a1 + (int)a2 + a3; //������ȯ
		byte a7=10+10; 
		long a8=a1+a3+a5; //byte + int + long
		double a9=a6 + 3.14;
		//float a10=a6 + 3.14; // ������ ���� 3.14�ڿ� f�� �Ⱦ��� double�� �ν�.
		double a11= a1/a7; // 10/20=0.5 ����µǾ�������.
		double a12=(double)a1/(double)a7;
		int a13=a1/a7;
		
		System.out.println(a3); //110 
		System.out.println(a5); //110 �� byte�� int�� �ڵ���ȯ�ϳİ�..����?
		System.out.println(a6); //220 ������ȯ�Ͽ� �����ϸ� ������
		System.out.println(a7); //20 ������ �ǿ����ڷ� ���ɶ��� �ڵ���ȯ��
		System.out.println(a8); //230 �ǿ������� Ÿ���� �پ��Ұ�� ū����Ÿ������ ��ȯ�ϰ� �����
		System.out.println(a9);	//223.14 �Ǽ�Ÿ���϶��� ����������
		System.out.println(a11); //0.0 �ڹٿ����� ���������� ����� ������ ��. �׷��� 0.0�̳���
		System.out.println(a12); //0.5 �׷��⿡ �Ǽ��������� �����������.
		System.out.println(a13); //0 �ڹٿ����� ������������ ������ �Ѵٴ°� �˼�����.
		
		
		//���꿡���� ���ڿ� �ڵ�Ÿ�Ժ�ȯ
		int b1=10+8+2;
		System.out.println(b1); //20
		//String b2=10+8+2; ������ ����
		String b3=10+8+"2";
		System.out.println(b3); // 18+"2" -> "182" �� ���⼭�� ����� �ϴ°���???
		
		String b4="10"+8+2;
		System.out.println(b4); //"108"+2 -> "1082"
		
		String b5= 10+"8"+2;
		System.out.println(b5); //"108"+2 -> "1082"
		
		String b6="10"+(8+2);
		System.out.println(b6); //"10"+10 -> "1010"
		
		
		//���ڿ��� �⺻Ÿ������ ����Ÿ�Ժ�ȯ( ���ڸ����� ���ڿ��� ������)
		String c1="10";
		String c2="A";
		System.out.println(c1); //10
		System.out.println(c2); //A
		
		int c3=Integer.parseInt(c1);
		System.out.println(c3); //10 ��°��� ���� ���ڿ����� �������� ��� ��������?
		System.out.println(Integer.parseInt(c1)); //10
		System.out.println(Integer.parseInt("10"));//10
		
		//char c4='1';
		String c5="5000";
		//int c6=Integer.parseInt(c4); string���� ���밡����
		int c7=Integer.parseInt(c5);
		System.out.println(c7); //5000
		//System.out.println(Integer.parseInt("3.14")); 
		System.out.println(Float.parseFloat("3.14")); //3.14
		System.out.println(Double.parseDouble("3.14")); //3.14
		
		//Int c8=10; ����Ÿ���� �ҹ�
		//System.out.println(c8);
		
		
		
		
	}

}

package test.day3;

public class Day3 {
	public static void main(String[] args) {
		
		//�� ����
		int a=0,x=1;
		int b=3,y=a+b;
		int z=x+10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(z);
		System.out.println("a+b="+y);
		//System.out.println("a+b="a+b); �����߻� Why?
		System.out.println("a+b="+a+b); //��� �̻���
		System.out.println("a+b="+(a+b)); //��ȣ ���ִ� ���� ����ϴ±���....
		
		//�������
		int hour=3;
		int minute=5;
		int total=hour*60+minute;
		
		System.out.println(hour+"�ð�"+minute+"��");
		System.out.println("��"+total+"��");
		
		//����(����)����
		int c=10;
		int k=c;
		int l=k+5;
		System.out.println(c);
		System.out.println(k);
		System.out.println(l);
		
		/*����������
		int v1=15;
		int v2=0;
		if(v1<10) {
			//int v2;
			v2=v1+10;
			System.out.println(v2); //������ �ȸ����� ������ ���ϴ±�
		}
		 	//int v3=v1+v2; v2�� if �� �ȿ����� ����
           	int v3=v1;		
		System.out.println(v1);
		//System.out.println(v2); �����߻�. v2�� if�� �ȿ����� ����
		System.out.println(v3);
		*/
		

		int c1=10000000;
		//long c2=10000000000000; //�����߻�
		long c2=10000000000000L;
		char c3='��';
	    int c4='��';
	    String c5="�ȳ�!�ڹ�";
	    String c6="�ȳ�\n�ڹ�\n\"���";
	    float c7=3.142464845136584f; //f�� �����̴�.
	    double c8=3.142464845136584; 
	    
	    boolean stop = true; //���� fulse���̸� else��Ͻ���
	    if(stop) {
	    	System.out.println("�����մϴ�");
	    }else {
	    	System.out.println("�����մϴ�");
	    }
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println(c5);
	    System.out.println(c6);
	    System.out.println(c7); //float 7�ڸ�
	    System.out.println(c8); //double�� 15�ڸ�
	    
	
	}
}

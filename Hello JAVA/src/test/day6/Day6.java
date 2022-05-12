package test.day6;

public class Day6 {
	public static void main(String[] args) {
		
		//������
		// x + y -> ������ "+" �̰� �ǿ����� "x","y" �̴�.
		int x=3, y=2;
		int z=x+y;
		boolean test=x>y; //�񱳿���. ���� ������ true ���� ������ false ���
		
		System.out.println(z);    //5
		System.out.println(test); //true
		
		//�߿�
		// 1. ����,����,���� ������ ������ �켱����
		// 2. ���,��,��,���� ������ �켱����
		// 3. ����,��ȣ,���Կ����ڸ� ������ ��� ������ ���ʿ��� ���������� ����
	
		// ���� ������ (�ǿ����ڰ� 1��)
		// ���� �������� ������ 1.��ȣ(+,-) 2.����(++,--) 3.��(!,&,|,%%,||)
		
		
		//1.��ȣ ������
		int a=+100;
		int b=-10;
		int c=-b;
		byte d=-20; //�̰� ������ ����??
		//byte e=+d; ��ȣ �����ڴ� intŸ���̹Ƿ�??	������ ����...���ذ� �ȵǳ�. 
		int e=-d;
						
		System.out.println(a+b); // 90���
		System.out.println(c);   // 10���
		System.out.println(d);	 // -20���
		System.out.println(e);	 // 20���
		
		//2.���� ������
		int a1=1;			
		a1++;               //a1 �����ؼ� 2
		int a2=a1++;        //a1 �����ؼ� 3, a2�� 1 (�����ϱ��� "=" ���� ���� ����)
		int a3=++a1;		//a1 �����ؼ� 4, a3�� 4 (a1=3�̿��� �����ϰ��� "=" �������)		
		int b2=a1++;		//a1 �����ؼ� 5, b2�� 4 (���� a1=4�̹Ƿ� ������ ���� ����)
		int b3=++a1;		//a1 �����ؼ� 6, b3�� 6 (���� a1=5���� ���� �� ���� ����)
		
		System.out.println(a1);		//6
		System.out.println(a2);		//2
		System.out.println(b2);		//4
		System.out.println(b3);		//6
		System.out.println(a1++);   //6 (��¸����ϰ� a1������Ŵ)
		System.out.println(a3);     //4
		System.out.println(++a1);   //8 (a1������Ű�� �����)
		
		//3.�� ���� ������
		boolean head=true;
		head=!head;
		System.out.println(head);	//false
		
		
		//���� ������ (�ǿ����ڰ� 2��)
		//1.��������� 2. ���ڿ����ҿ����� 3. �񱳿�����, 4.�������� 5.���Կ�����
		 
		//1.���������
		int c1=13;
		int d1=23;
		int e1=c1/d1;
		double f1=c1/d1;
		double g1=(double)c1/(double)d1;
		int h1=c1%d1;
				
		System.out.println(c1/d1); //0 intŸ������ ��ȯ�ؼ� ����ϱ� ������?
		System.out.println(e1);    //0 intŸ������ ��ȯ�ؼ� ����ϱ� ������?
		System.out.println(f1);    //0.0 intŸ������ ��ȯ�ؼ� ����ϱ� ������?
		System.out.println(g1);	   // 0.5652173913043478
		System.out.println(h1);	  // 13 %(����������)
		
		char v1='A';
		char v2='A'+1;
		char v3='a'+2;
		char v4='z'+1;
		//char v3=v1+1; //char Ÿ���� �����ڵ�� ����Ǳ⶧���� intŸ������ �����ؾ��Ѵ�.
		int v5=v1+1;
		double v6=v1+1; //
		
		System.out.println(v1);		//A
		System.out.println(v2);		//B
		System.out.println(v3);		//c
		System.out.println(v4);		//{ ���ĺ� ������ ��ȣ�� �����µ�.
		System.out.println(v5);		//65+1=66
		System.out.println(v6);		//66.0
		
		//2.���ڿ����տ�����
		
		String str="kim"+3.0;
		String str1=str+"name";
		
		System.out.println(str);	//kim3.0
		System.out.println(str1);	//kim3.0name
		
		String str2=3.0+2+str;
		System.out.println(str2);	//5.0kim3.0
		
		String str3=3+str+5;
		System.out.println(str3);	//3kim3.05
		
		//3.�񱳿�����
		//�ǿ������� ��ҶǴ� ������ ���ؼ� true/false�� ������
		
		int woo=11;
		int sang=10;
		
		System.out.println(woo>sang);	//true
		System.out.println(woo<sang);	//false
		System.out.println(woo==sang);	//false
		System.out.println(woo!=sang);	//true
		
		char kang='A';
		char ji='a';
		int o1=kang,o2=ji;				//�����ڵ带 ����
		System.out.println(kang>=ji);	//false �����ڵ� ���� ������ ��
		System.out.println(kang<=ji);	//true
		System.out.printf("%1$d,%2$d\n",o1,o2); //65 , 97
		System.out.println(kang);		//A���
		
		int p1=65;
		double p2=65.0;
		System.out.println(p1==p2);	//true ���ϱ��� ������ ūŸ��������ġ��Ŵ
		System.out.println(kang==p1); //true intŸ������ ����Ǿ�����?
		
		String home="��������ʹ�";
		String home1="��������ʹ�";
		System.out.println(home==home1); //true �Ǵµ�???
		System.out.println(home!=home1); //false �Ǵµ�??
		System.out.println(home.equals(home1));	//true
		System.out.println(!home.equals(home1));//false
		
		//4.��������
		//����(&&),����(||),��Ÿ���븮��(^),������(!)
		// AND    , OR     , XOR       , NOT
		//���������� �ǿ����ڴ� booleanŸ�Ը� ��밡��
		
		int k1=10;
				
		if(k1>20) {
			int k3=k1+10;
			System.out.println(k3);		//��� pass
		}
		if(k1<20) {
			int k4=k1+10;
			System.out.println(k4);		//20 ���
		}
			
		if((k1>8)&&(k1<12)) { //�� ��� true �϶� ����� true
			System.out.println("8��12������ ���ڱ���"); //���ok
				}
		if((k1==8)||(k1>8)) { //���� �ϳ��� true�̸� ����� true 
			System.out.println("8�̻��� ���ڱ���"); //���ok
		}
		if((k1==8)^(k1>8)) { //true-false �϶� ����� true
			System.out.println("8�̻��� ���ڱ���"); //���ok
		}
		
		//5.���Կ�����
		//������ �ǿ����� ���� ���� �ǿ������� ������ ����.
		
		int result=5;
		
		result=10;
		System.out.println(result);		//10
		
		result+=10;						//����=����(+,-,*,/,%)10
		System.out.println(result);		//20
		result-=10;
		System.out.println(result);		//10
		result*=10;
		System.out.println(result);		//100
		result/=10;
		System.out.println(result);		//10
		result%=10;
		System.out.println(result);		//0
		
		boolean result1=true;
		result1&=false;
		System.out.println(result1);	//false
		result1|=true;
		System.out.println(result1);	//true
		result1^=false;
		System.out.println(result1);	//true
		
		
		//���׿�����(�ǿ����ڰ� 3��)
		int score=85;
		char grade=(score>80)?'A':'B';
		System.out.println(grade);		//A���
		
		if(score>80) {
			System.out.println('A');	//A���
		}else {
			System.out.println('B');
		}
		
		char grade1=(score>90)?'A':(score>80)?'B':'C';
		System.out.println(grade1);    //B���
		
		if(score>90){
			System.out.println('A');	//B���
		if(score>80){
			System.out.println('B');
		}
		else {
			System.out.println('c');
		}
			
	}
	}	
	
		
	}



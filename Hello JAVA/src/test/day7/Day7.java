package test.day7;

public class Day7 {
	public static void main(String[] args) {
		int score=92;
		if(score>=90) {
			System.out.println("90�� �̻�");
			System.out.println("A���");
		}
		if(score<90) {
			System.out.println("90�� ����");
			System.out.println("B���");  //false�̹Ƿ� ���Ͼ��� ���๮�� �������
		
		}
		
		if(score<90)  //�߰�ȣ�� ��� if���� �ٷ� �Ʒ��ٸ� �ش��.
			System.out.println("90�� ����");
			System.out.println("B���");  // �̰� if���ϰ� ������� �����̿��� �����
			
			
		
		int score1=85;
		if(score1>90) {
			System.out.println("90�� �̻�");
		}else {
			System.out.println("90�� ����");
		}
		
		double num=Math.random();   // 0.0<= num <1.0 ���������ϰ� ���
		System.out.println(num);    //�����Ҷ����� �����ϰ� ��µ�
		int num1=(int)num;			//���� int������ ��ȯ
		System.out.println(num1);	// 0��µ�!! ������ 0~0.99999������ ���̹Ƿ�	
		
	
		int score2=(int)(Math.random()*100)+1; //1����n���� ��
		System.out.println(score2);
		if(score2>90) {
			System.out.println("A");
		}else if(score2>80) {
			System.out.println("B");
		}else if(score2>70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		int num2=(int)(Math.random()*4)+5; //5���� 4���� �� : 5<=num2<9(4+5)
		char grade='A';
		String name="����";
		switch(num2){
			case 5:
			System.out.println("1��");
			break;
			case 6:
			System.out.println("2��");
			break;
			case 7:
			System.out.println("2��");
			break;
			case 8:
			System.out.println("2��");
			break;		
			}
		
		switch(grade) {
		case 'A':
		System.out.println(grade);
		break;
		}
		
		switch(name) {
		case "��":
			System.out.println(name);
			break;
			default:
				System.out.println("����");
		}
		
		
		//int i=0;
		for(int i=0;i<=10;i++) { //for(;i<=10;i++) �����ʱ�ȭ�� ���� ����� ���
			System.out.println(i);
		}
		
		int k=0;
		int sum=0;
		for(k=1;k<=100;k++) {
			sum=sum+k; //sum += k; ������ �ڵ�
			System.out.println(k); //1~100���� ��µ�
		}
		System.out.printf("1���� %d������ ����%d,",k-1,sum); //$1�ѹ��� �Ⱥ����ָ� ������� �鰨
		//k���� 101�� ����� ��?? ������ Ż���ϱ����ؼ��� k=101�� �Ǿ����� Ż���ϴ�. ���� 101����ȵ�
		
		//����������ϱ�
		int n=2;
		int m=1;
		//int pdt=n*m;
		
		for(n=2;n<=9;n++) {
			for(m=1;m<=9;m++) {
				int pdt=n*m;
				System.out.println(n+"X"+m+"="+(n*m)); //��ȣ�����ָ� "="�� ���� ������
				System.out.println(n+"X"+m+"="+pdt); //pdt�� for�� �ȿ� �־����
			}
				
			}
		
		//1����10���� ��� while
		int u=0;
		while(u<=10) {
			u++;
			System.out.println(u);//11���� ��µ�.u=11�� �Ǿ�� ������ Ż���ϴ�.
			if(u==10) {  //10�϶� Ż�� ��Ŵ. u�� 10������ �����
				break;
			}
		}
		
		//�ƴϸ� �Ʒ��� ���� �ۼ�
		int u1=1;
		while(u1<=10) {
			System.out.println(u1);
			u1++; //u11�� ��������� ����� 10������ ��. �̰��� �´� ���ϱ�?
		}
		
		int p=0;
		int sum9=0;
		while(p<=100) {
			p++;
			sum9+=p;			
			if(p==100) {
				break;
			}
		}
		System.out.printf("1���� %d������ ���� %d�̴�.\n",p,sum9);
				
		//�ٱ��� �ݺ��� ���� ��Ű��
		
		for(char upper='A';upper<='Z';upper++) {
		for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break;
				}
			}
		
		}
		
		// continue��
		int e=0;
		for(e=1;e<=10;e++) {
			if(e%2 !=0) {
				continue;
			}
			System.out.println(e);
			
			if(e==10) {
				break;
			}
			
		}
		System.out.println("������ e����"+e);
		
	}

}
package test.day9;
import java.util.Arrays;

public class Day9 {

	public static void main(String[] args) {
		
		// ��������. ��ü
		String A="ABC";					// ������ ABC��� ���� ����Ǵ� ������ �ƴ϶�
		String a="ABC";					// String�̶�� ��ü�� �����ǰ� A��� ������
										// �������� �����! �� �������� "ABC"���� ����
		// �������� ���� ��ü�� ����(���ϰ� ������)
		// A���� ���� String ��ü�� B���� ���� String ��ü�� �������� ������ ���ϰ� ������
		// Java������ ���ͷ��� ������ �������� �����Ѱ���!
									
		
		if(A==a) {						//��ü�� �������� ���ϴµ�?
			System.out.println("true"); //���: true
		}else {							
			System.out.println("false");
		}
		
		if(a.equals(A)) {				//������ ������� ���ڿ��� ���ϰ� �������!
			System.out.println("A�� a�� ���ڿ��� ����");
		}
		
		String B=new String("abc");	//new������.
		String b=new String("abc");	//���ο� ��ü�� �����ϴµ� ����,��ü����������
		//���ο� ��ü�� �����Ͽ����Ƿ�, �������� �ٸ���!!
		//�������� Ÿ�� String�� �������� �� ������!!
		
		if(B==b) {						//�������� �ٸ�
			System.out.println("treu");
		}else {
			System.out.println("false");//���:false
		}
		
		if(B.equals(b)) {				//������ ������� ���ڿ��� ��!
			System.out.println("B��b�� ���ڿ��� ����");
		}
		
		String C="ABC";
		System.out.println(C);	//ABC
		C=null;
		System.out.println(C);	//null :���̻� ��ü�� �������� �ʴ� �ٴ� ������ ����
		
		
		// �迭
		int num[] = {5,2,9}; //�迭 ���� (int[] num={1,2,3,}) ���� 
		System.out.println(num[0]);			//1���
		System.out.println(num[0]+num[1]);	//3���
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);			//6���
		
		num[0]=4;							//int num[0]=4;�� ������
		//num=new int[] {4,6,8};			//�迭���� �ٽ� ����
		System.out.println(num[0]);			//4��� 0��°�� ��
		System.out.println(num[0]+","+num[1]+","+num[2]);//4,2,9���
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));//[2,4,9]���		
		System.out.println(num[0]);			//2��� 0��°�� ��! ��ġ�� �ٲ��~
		System.out.println(num);			//�迭�� �����ϴ� �޸��ּ� [I@6a5fc7f7
		
		for(int j=0;j<num.length;j++) {		//Arrays.toString�� ������� �ʰ�
			System.out.println(num[j]);		//�迭���� ����ϱ�	2,4,9 ���
		}
		
		//int test[];
		//test= {1,3,5}; //������ �迭������ �������� �ٸ� ���๮���� �߰�ȣ�� ����� �迭����XX
		
		int test[];
		test = new int[] {1,3,5};
		System.out.println(test[0]+","+test[1]+","+test[2]);
		
		int test1[]= {1,2,3};
		test1 = new int[] {2};				//������ �ִ� ��ü�� ������ ���λ���??
		//System.out.println(test1[0]+","+test1[1]+","+test1[2]);//������
		System.out.println(test1[0]);		//2 ��� ,�� ���̵� ���� ����
		
		/*
		int[] scores; //������!! ����? å�̶� ������!! �̹� ������ ���ذ� �� �ȵǳ�		
		scores=new int[]{80,90,100};		
		int sum2=add(new int[] {80,90,100});
			System.out.println(sum2);
			System.out.println();
			
	   }	
			public static int add(int[] scores){
				int sum3=0;
				for(int z=0;z<3;z++) {
					sum3=sum3+scores[z];
				}
				return sum3;		
             }
             */ //�� �ȵɱ�......
		
		// new �����ڷ� �迭 ����
		// ���� ����� ������ ���� ������ ���� ������ ������ �迭�� �̸� ����� ��������
		int[] lotto=new int[6]; // ���̰� 6�� �迭�� ����
								// new�����ڷ� �迭�� �����Ҷ� �ڵ������� �⺻������ �ʱ�ȭ��
		//intŸ���̹Ƿ� 0������ ������, StringŸ���̸� null������ ������
		//charŸ���� �⺻���� \u0000'
		lotto[0]=12;
		lotto[5]=11;	//�氹���� ���ȣ�� �򰥸��� ����! ���ȣ�� 5�� �ִ���
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); // [0,0,0,0,11,12]���!
		
		int[] lotto2=new int[6];
		for(int y=0;y<lotto2.length;y++) {
			System.out.println("lotto2["+y+"]"+lotto2[y]); // �⺻�� 0���� ���õ�
		}
		lotto2[0]=5;
		lotto2[1]=11;
		lotto2[2]=25;
		for(int h=0;h<lotto2.length;h++) {
		System.out.println("lotto2["+h+"]"+lotto2[h]); // 5,11,25,0,0,0
		}
		
		String[] lotto3=new String[6];
		lotto3[0]="5";
		lotto3[1]="11";
		lotto3[2]="25";
		for(int h=0;h<lotto3.length;h++) {
		System.out.println("lotto3["+h+"]"+lotto3[h]); //5,11,25,null,null,null
		}
		
		int l=lotto.length;
		System.out.println(l);			//�迭���� 6
		
		
		//��ɶ����Է�
		//��..main(String[] args)�� �� �ִ��� �˷��ַ�������.!!����
		//main�żҵ��� �Ű����̶�� �θ���.
		//�����ϸ�. ���̰� 0�� �迭�� ���� �����ϰ� main()�޼ҵ带 ȣ���Ҷ� �Ű������� ����???
		//�������̾�.....
		//String args[]={};�� ���������ϴ°� ���ϴ�!
		
		if(args.length !=2) {
			System.out.println("���� ���� ����");
			System.exit(0);  				//�ý��� ����
		}
		
		String strNum1=args[0];
		String strNum2=args[1];

		int num10 = Integer.parseInt(strNum1); //������ ��ȯ������ ���ڿ��� ���Ǿ����!
		int num20 = Integer.parseInt(strNum2);
		
		System.out.println(num10+","+num20);
		
		//char kk='A';
		//String hh="A";
		String ii="10";
				
		//int kkk=Integer.parseInt(kk); ���� String Ÿ�Ը��Ǵ°���!
		//int hhh=Integer.parseInt(hh); ������!! ��������!
		int iii=Integer.parseInt(ii);
		
		//System.out.println(hhh+","+iii);������
		System.out.println(iii);	//10���
		
		//String[] jiho;
		//Arrays.sort(jiho);
		//System.out.println(Arrays.toString(jiho));
		
       }
}
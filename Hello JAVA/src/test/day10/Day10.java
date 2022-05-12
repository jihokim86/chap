package test.day10;

public class Day10 {

	public static void main(String[] args) {
		
		//������ �迭
		int[][] scores=new int[2][3]; //�迭���� , 2��X3�� 2�����迭
		
		int l=scores.length;		//�������� scores�� ��üa�� �����Ѵ�.(��üa�� ��)
		int l2=scores[0].length;	//��üa�� 0��° ���� ��üb�� ����(��üb�� 1���� ��)
		int l3=scores[1].length;	//��üa�� 1��° ���� ��üc�� ����(��üc�� 2���� ��)
		System.out.println(l+","+l2+","+l3);	//	2,3,3
		
		int[][] matrix=new int[2][0]; // å������ "[]" �̷��� ǥ���ϴµ� ������ �����߻���.
		
		int l4=matrix.length;		//���� ����2
		int l5=matrix[0].length;	//1���� ����=0
		int l6=matrix[1].length;	//2���� ����=0
		
		System.out.println(l4+","+l5+","+l6);	//2,0,0
		
		matrix[0]=new int[2];
		matrix[1]=new int[3];
		
				
		l4=matrix.length;		//���� ����=2
		l5=matrix[0].length;	//1���� ����=2
		l6=matrix[1].length;	//2���� ����=3
		
		System.out.println(l4+","+l5+","+l6);	//2,2,3		
		//java�� ���а� �ٸ��� ���� ���̰� �޶� �ǳ����ϴ�!
		//�׷��� ������ ���� ���̰� �ٸ� �� �����Ƿ� ���Ǹ� �϶�°� �����ϴ�.
		
		int[][] scores1= {{94,91},{80,88}};	// }{1���� ���� ��},{2���� ���ǰ� }}
		System.out.println(scores1);		//[[I@5594a1b5 �ּ� ���
		System.out.println(scores1[0]);		//[I@5594a1b5 �ּҰ� ��µǳ�
		System.out.println(scores1[0][0]);	//94��� 1����1���� ��
		System.out.println(scores1[1][0]);	//80��� 2����1���� ��
		
		int[][] mathScores=new int[2][3];					
		for(int i=0;i<mathScores.length;i++) {				//�� ���� ���� ���̰� �ٸ� ��찡 �ֱ��
			for(int k=0;k<mathScores[i].length;k++) {		//.length�� ����ϴ°� �������ϴ�
				System.out.println("math="+mathScores[i][k]);		// ���� �����Ƿ� 0���
				//(0,0)�� ���ټ� ������. (1,1)���� �����ϰ� �������?
			}
		}
		
		int[][] englishScores=new int[2][0];		//[]�̰� ���������� �������µ�.
		englishScores[0]=new int[2];
		englishScores[1]=new int[2];
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
				System.out.println("english="+englishScores[i][k]);	
			}
		}
		
		int[][] javaScores= {{94,91},{80,88}};
		//javaScores[0] = new int[] {60,60};
		javaScores[0] = new int[3];
		for(int i=0;i<javaScores.length;i++) {
			for(int k=0;k<javaScores[i].length;k++) {
		System.out.println("Scores="+javaScores[i][k]);
			}
		}
		
		//��ü�� �����ϴ� �迭
		//String Ÿ��!!
		
		String[] str=new String[3]; //int[] lotto=new int[6]; �����Ҷ��� 1��ü�� ������ 6���� �����ض�
									//String Ÿ�Կ����� ��ü 3���� �����϶�� ���ε�
		int[] test;					
		test=new int[] {1,2,3};
		test[0]=4;
		System.out.println(test[0]);	//���� �̷��� ����߾���!
		
		str[0]="java";				//�� ��ü�� �������� ������ ����!. 
		str[1]="java";				//���� �ߴ��Ͱ� �����ѵ�?
		str[2]=new String("java");	//���ο� ��ü�� ������
		
		System.out.println(str[0]==str[1]); // true
		System.out.println(str[0]==str[2]);	// false
		System.out.println(str.equals(str));// true
		
		//�迭����
		//���� �迭�� ���̸� �ø��� �������� �����ؿ��� ���
		
		int[] oldArray= {1,2,3};			//�迭���� �������� 3��
		int[] newArray=new int[5];			//���ο� ��ü�� ����. ������ 5���� �����ض�
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i]=oldArray[i];
			System.out.println(newArray[i]); //1,2,3 ���
			
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]); //1,2,3,0,0 ���
			
		}
		
		//System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
		  /*Object src : ���� �迭
			int srcPos : ���� �迭���� ������ �׸��� ���� �ε���
			Object dest : ���ο� �迭
			int destPis : ���ο� �迭���� �ٿ����� ���� �ε���
			int length : ������ ����  */
		
		System.arraycopy(oldArray,0,newArray,0,oldArray.length);
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]); 	//1,2,3,0,0 
		}
		
		if(newArray==oldArray) {
			System.out.println("������ ����");		//
		}else {
			System.out.println("������ �ٸ�");		//�������� ���簡 �ȵǴ°� ���ϴ�
		}
		
		
		//���� for��
			/*	�迭�̳� �÷���?�� ���� ó���ϱ� ���� ���
			 * 	����ī��Ʈ ����ȭ �������� ������� ����
			 *  ��ȣ�ȿ��� �迭���� ���� �׸��� ������ ���� ����� �ݷ�(:),�迭�� ������ �ۼ� 
	
		         for(Ÿ�� ���� : �迭){ 
				      ���๮
				   }  
		
			 * 1. for���� ó�� ���۵� �� �迭���� ������ ù��° ���� �����ϴ��� ���ϰ� ������ ����� Ż��
			 * 2. ������ ���� �����ϸ� �ش� ���� ������ ������
			 * 3. ���๮�� ����
			 * 4. �ٽ� �迭���� ������ ���� �����ϴ��� ��
			 * 5. �ݺ�
			 */
		
		int[] moon= {95,94,80,84,61};
		int sum=0;
		for(int total:moon) {
			sum=sum+total;
		}
		System.out.println(sum); 	//414 ���
		
		double aver=(double)sum/moon.length;
		System.out.println(aver);	//82.8 ���
		
	}

}

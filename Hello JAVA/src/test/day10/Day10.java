package test.day10;

public class Day10 {

	public static void main(String[] args) {
		
		//다차원 배열
		int[][] scores=new int[2][3]; //배열생성 , 2행X3열 2차원배열
		
		int l=scores.length;		//참조변수 scores는 객체a를 참조한다.(객체a는 행)
		int l2=scores[0].length;	//객체a의 0번째 방은 객체b를 참조(객체b는 1행의 열)
		int l3=scores[1].length;	//객체a의 1번째 방은 객체c를 참조(객체c는 2행의 열)
		System.out.println(l+","+l2+","+l3);	//	2,3,3
		
		int[][] matrix=new int[2][0]; // 책에서는 "[]" 이렇게 표현하는데 컴파일 오류발생함.
		
		int l4=matrix.length;		//행의 길이2
		int l5=matrix[0].length;	//1행의 길이=0
		int l6=matrix[1].length;	//2행의 길이=0
		
		System.out.println(l4+","+l5+","+l6);	//2,0,0
		
		matrix[0]=new int[2];
		matrix[1]=new int[3];
		
				
		l4=matrix.length;		//행의 길이=2
		l5=matrix[0].length;	//1행의 길이=2
		l6=matrix[1].length;	//2행의 길이=3
		
		System.out.println(l4+","+l5+","+l6);	//2,2,3		
		//java는 수학과 다르네 열의 길이가 달라도 되나봅니다!
		//그래서 각행의 열의 길이가 다를 수 있으므로 주의를 하라는것 같습니다.
		
		int[][] scores1= {{94,91},{80,88}};	// }{1행의 열의 값},{2행의 열의값 }}
		System.out.println(scores1);		//[[I@5594a1b5 주소 출력
		System.out.println(scores1[0]);		//[I@5594a1b5 주소가 출력되네
		System.out.println(scores1[0][0]);	//94출력 1행의1열의 값
		System.out.println(scores1[1][0]);	//80출력 2행의1열의 값
		
		int[][] mathScores=new int[2][3];					
		for(int i=0;i<mathScores.length;i++) {				//각 행의 열의 길이가 다를 경우가 있기게
			for(int k=0;k<mathScores[i].length;k++) {		//.length를 사용하는게 맞을듯하다
				System.out.println("math="+mathScores[i][k]);		// 값이 없으므로 0출력
				//(0,0)을 없앨수 없을까. (1,1)부터 시작하게 만들려면?
			}
		}
		
		int[][] englishScores=new int[2][0];		//[]이건 오류나느데 오류나는데.
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
		
		//객체를 참조하는 배열
		//String 타입!!
		
		String[] str=new String[3]; //int[] lotto=new int[6]; 선언할때는 1객체의 번지수 6개를 참조해라
									//String 타입에서는 객체 3개를 참조하라는 뜻인듯
		int[] test;					
		test=new int[] {1,2,3};
		test[0]=4;
		System.out.println(test[0]);	//보통 이렇게 사용했었죠!
		
		str[0]="java";				//각 객체는 번지수를 가지고 있음!. 
		str[1]="java";				//이전 했던것과 동일한데?
		str[2]=new String("java");	//새로운 객체를 생성함
		
		System.out.println(str[0]==str[1]); // true
		System.out.println(str[0]==str[2]);	// false
		System.out.println(str.equals(str));// true
		
		//배열복사
		//기존 배열의 길이를 늘리고 기존값을 복사해오는 방법
		
		int[] oldArray= {1,2,3};			//배열선언 번지수가 3개
		int[] newArray=new int[5];			//새로운 객체를 생성. 번지수 5개를 참조해라
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i]=oldArray[i];
			System.out.println(newArray[i]); //1,2,3 출력
			
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]); //1,2,3,0,0 출력
			
		}
		
		//System.arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
		  /*Object src : 원본 배열
			int srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
			Object dest : 새로운 배열
			int destPis : 새로운 배열에서 붙여넣을 시작 인덱스
			int length : 복사할 개수  */
		
		System.arraycopy(oldArray,0,newArray,0,oldArray.length);
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]); 	//1,2,3,0,0 
		}
		
		if(newArray==oldArray) {
			System.out.println("번지수 동일");		//
		}else {
			System.out.println("번지수 다름");		//번지수는 복사가 안되는가 봅니다
		}
		
		
		//향상된 for문
			/*	배열이나 컬렉션?을 쉽게 처리하기 위해 사용
			 * 	루프카운트 변수화 증감식을 사용하지 않음
			 *  괄호안에는 배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:),배열을 나란히 작성 
	
		         for(타입 변수 : 배열){ 
				      실행문
				   }  
		
			 * 1. for문이 처음 실핼될 때 배열에서 가져올 첫번째 값이 존재하는지 평가하고 없으면 블록을 탈출
			 * 2. 가져울 값이 존재하면 해당 값을 변수에 저장함
			 * 3. 실행문을 실행
			 * 4. 다시 배열에사 가져올 값이 존재하는지 평가
			 * 5. 반복
			 */
		
		int[] moon= {95,94,80,84,61};
		int sum=0;
		for(int total:moon) {
			sum=sum+total;
		}
		System.out.println(sum); 	//414 출력
		
		double aver=(double)sum/moon.length;
		System.out.println(aver);	//82.8 출력
		
	}

}

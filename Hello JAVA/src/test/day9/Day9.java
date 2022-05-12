package test.day9;
import java.util.Arrays;

public class Day9 {

	public static void main(String[] args) {
		
		// 참조변수. 객체
		String A="ABC";					// 변수에 ABC라는 값이 저장되는 개념이 아니라
		String a="ABC";					// String이라는 객체가 생성되고 A라는 변수에
										// 번지수가 저장됨! 그 번지수에 "ABC"값이 존재
		// 번지수를 통해 객체를 참조(비교하고 대조함)
		// A값을 갖는 String 객체와 B값을 갖는 String 객체를 번지수를 가지고 비교하고 대조함
		// Java에서는 리터럴이 같으면 번지수가 동일한가봄!
									
		
		if(A==a) {						//객체의 번지수를 비교하는듯?
			System.out.println("true"); //결과: true
		}else {							
			System.out.println("false");
		}
		
		if(a.equals(A)) {				//번지수 상관없이 문자열만 비교하고 싶을경우!
			System.out.println("A와 a는 문자열이 같음");
		}
		
		String B=new String("abc");	//new연산자.
		String b=new String("abc");	//새로운 객체를 생성하는데 사용됨,객체생성연산자
		//새로운 객체를 생성하였으므로, 번지수가 다르다!!
		//참조변수 타입 String은 번지수로 비교 대조함!!
		
		if(B==b) {						//번지수가 다름
			System.out.println("treu");
		}else {
			System.out.println("false");//결과:false
		}
		
		if(B.equals(b)) {				//번지수 상관없이 문자열만 비교!
			System.out.println("B와b는 문자열이 같음");
		}
		
		String C="ABC";
		System.out.println(C);	//ABC
		C=null;
		System.out.println(C);	//null :더이상 객체를 참조하지 않는 다는 뜻으로 사용됨
		
		
		// 배열
		int num[] = {5,2,9}; //배열 선언 (int[] num={1,2,3,}) 동일 
		System.out.println(num[0]);			//1출력
		System.out.println(num[0]+num[1]);	//3출력
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);			//6출력
		
		num[0]=4;							//int num[0]=4;은 오류남
		//num=new int[] {4,6,8};			//배열값을 다시 지정
		System.out.println(num[0]);			//4출력 0번째방 값
		System.out.println(num[0]+","+num[1]+","+num[2]);//4,2,9출력
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));//[2,4,9]출력		
		System.out.println(num[0]);			//2출력 0번째방 값! 위치가 바뀌네~
		System.out.println(num);			//배열이 참조하는 메모리주소 [I@6a5fc7f7
		
		for(int j=0;j<num.length;j++) {		//Arrays.toString을 사용하지 않고
			System.out.println(num[j]);		//배열값을 출력하기	2,4,9 출력
		}
		
		//int test[];
		//test= {1,3,5}; //에러남 배열변수를 선언한후 다른 실행문에서 중괄호를 사용한 배열생성XX
		
		int test[];
		test = new int[] {1,3,5};
		System.out.println(test[0]+","+test[1]+","+test[2]);
		
		int test1[]= {1,2,3};
		test1 = new int[] {2};				//기존에 있던 객체를 버리고 새로생성??
		//System.out.println(test1[0]+","+test1[1]+","+test1[2]);//오류남
		System.out.println(test1[0]);		//2 출력 ,방 길이도 변경 가능
		
		/*
		int[] scores; //오류남!! 왜지? 책이랑 같은데!! 이번 예제는 이해가 잘 안되네		
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
             */ //왜 안될까......
		
		// new 연산자로 배열 생성
		// 값의 목록을 가지고 있지 않지만 향후 값들을 저장할 배열을 미리 만들어 놓기위해
		int[] lotto=new int[6]; // 길이가 6인 배열을 생성
								// new연산자로 배열을 생성할때 자동적으로 기본값으로 초기화됨
		//int타입이므로 0값으로 지정됨, String타입이면 null값으로 지정됨
		//char타입은 기본값이 \u0000'
		lotto[0]=12;
		lotto[5]=11;	//방갯수와 방번호를 헷갈리지 말자! 방번호는 5가 최대임
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); // [0,0,0,0,11,12]출력!
		
		int[] lotto2=new int[6];
		for(int y=0;y<lotto2.length;y++) {
			System.out.println("lotto2["+y+"]"+lotto2[y]); // 기본값 0으로 세팅됨
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
		System.out.println(l);			//배열길이 6
		
		
		//명령라인입력
		//와..main(String[] args)가 왜 있는지 알려주려나보다.!!ㅋㅋ
		//main매소드의 매개값이라고 부른다.
		//실행하면. 길이가 0인 배열을 먼저 생성하고 main()메소드를 호출할때 매개값으로 전달???
		//무슨말이야.....
		//String args[]={};이 값을전달하는가 봅니다!
		
		if(args.length !=2) {
			System.out.println("값의 수가 부족");
			System.exit(0);  				//시스템 종료
		}
		
		String strNum1=args[0];
		String strNum2=args[1];

		int num10 = Integer.parseInt(strNum1); //정수로 변환가능한 문자열이 사용되어야함!
		int num20 = Integer.parseInt(strNum2);
		
		System.out.println(num10+","+num20);
		
		//char kk='A';
		//String hh="A";
		String ii="10";
				
		//int kkk=Integer.parseInt(kk); 오직 String 타입만되는거임!
		//int hhh=Integer.parseInt(hh); 오류남!! 지워야함!
		int iii=Integer.parseInt(ii);
		
		//System.out.println(hhh+","+iii);오류남
		System.out.println(iii);	//10출력
		
		//String[] jiho;
		//Arrays.sort(jiho);
		//System.out.println(Arrays.toString(jiho));
		
       }
}
package test.day6;

public class Day6 {
	public static void main(String[] args) {
		
		//연산자
		// x + y -> 연산자 "+" 이고 피연산자 "x","y" 이다.
		int x=3, y=2;
		int z=x+y;
		boolean test=x>y; //비교연산. 값이 맞으면 true 맞지 않으면 false 출력
		
		System.out.println(z);    //5
		System.out.println(test); //true
		
		//중요
		// 1. 단항,이항,삼항 연산자 순으로 우선순위
		// 2. 산술,비교,논리,대입 순으로 우선선위
		// 3. 단항,부호,대입연산자를 제외한 모든 연산사는 왼쪽에서 오른쪽으로 연산
	
		// 단항 연산자 (피연산자가 1개)
		// 단항 연산자의 종류로 1.부호(+,-) 2.증감(++,--) 3.논리(!,&,|,%%,||)
		
		
		//1.부호 연산자
		int a=+100;
		int b=-10;
		int c=-b;
		byte d=-20; //이건 문제가 없네??
		//byte e=+d; 부호 연산자는 int타입이므로??	컴파일 오류...이해가 안되네. 
		int e=-d;
						
		System.out.println(a+b); // 90출력
		System.out.println(c);   // 10출력
		System.out.println(d);	 // -20출력
		System.out.println(e);	 // 20출력
		
		//2.증감 연산자
		int a1=1;			
		a1++;               //a1 증감해서 2
		int a2=a1++;        //a1 증감해서 3, a2는 1 (증감하기전 "=" 연산 먼저 수행)
		int a3=++a1;		//a1 증감해서 4, a3은 4 (a1=3이였고 증감하고나서 "=" 연산수행)		
		int b2=a1++;		//a1 증감해서 5, b2는 4 (이전 a1=4이므로 증감전 연산 먼저)
		int b3=++a1;		//a1 증감해서 6, b3는 6 (이전 a1=5에서 증감 후 연산 수행)
		
		System.out.println(a1);		//6
		System.out.println(a2);		//2
		System.out.println(b2);		//4
		System.out.println(b3);		//6
		System.out.println(a1++);   //6 (출력먼저하고 a1증감시킴)
		System.out.println(a3);     //4
		System.out.println(++a1);   //8 (a1증감시키고 출력함)
		
		//3.논리 부정 연산자
		boolean head=true;
		head=!head;
		System.out.println(head);	//false
		
		
		//이항 연산자 (피연산자가 2개)
		//1.산술연산자 2. 문자열겹할연산자 3. 비교연산자, 4.논리연산자 5.대입연산자
		 
		//1.산술연산자
		int c1=13;
		int d1=23;
		int e1=c1/d1;
		double f1=c1/d1;
		double g1=(double)c1/(double)d1;
		int h1=c1%d1;
				
		System.out.println(c1/d1); //0 int타입으로 변환해서 계산하기 때문에?
		System.out.println(e1);    //0 int타입으로 변환해서 계산하기 때문에?
		System.out.println(f1);    //0.0 int타입으로 변환해서 계산하기 때문에?
		System.out.println(g1);	   // 0.5652173913043478
		System.out.println(h1);	  // 13 %(나머지개념)
		
		char v1='A';
		char v2='A'+1;
		char v3='a'+2;
		char v4='z'+1;
		//char v3=v1+1; //char 타입은 유니코드로 저장되기때문에 int타입으로 선언해야한다.
		int v5=v1+1;
		double v6=v1+1; //
		
		System.out.println(v1);		//A
		System.out.println(v2);		//B
		System.out.println(v3);		//c
		System.out.println(v4);		//{ 알파벳 다음은 기호들 나오는듯.
		System.out.println(v5);		//65+1=66
		System.out.println(v6);		//66.0
		
		//2.문자열결합연산자
		
		String str="kim"+3.0;
		String str1=str+"name";
		
		System.out.println(str);	//kim3.0
		System.out.println(str1);	//kim3.0name
		
		String str2=3.0+2+str;
		System.out.println(str2);	//5.0kim3.0
		
		String str3=3+str+5;
		System.out.println(str3);	//3kim3.05
		
		//3.비교연산자
		//피연사자의 대소또는 동등을 비교해서 true/false를 산출함
		
		int woo=11;
		int sang=10;
		
		System.out.println(woo>sang);	//true
		System.out.println(woo<sang);	//false
		System.out.println(woo==sang);	//false
		System.out.println(woo!=sang);	//true
		
		char kang='A';
		char ji='a';
		int o1=kang,o2=ji;				//유니코드를 저장
		System.out.println(kang>=ji);	//false 유니코드 값을 가지고 비교
		System.out.println(kang<=ji);	//true
		System.out.printf("%1$d,%2$d\n",o1,o2); //65 , 97
		System.out.println(kang);		//A출력
		
		int p1=65;
		double p2=65.0;
		System.out.println(p1==p2);	//true 비교하기전 범위가 큰타입으로일치시킴
		System.out.println(kang==p1); //true int타입으로 변경되었겠지?
		
		String home="집에가고싶다";
		String home1="집에가고싶다";
		System.out.println(home==home1); //true 되는데???
		System.out.println(home!=home1); //false 되는데??
		System.out.println(home.equals(home1));	//true
		System.out.println(!home.equals(home1));//false
		
		//4.논리연산자
		//논리곱(&&),논리합(||),배타적노리합(^),논리부정(!)
		// AND    , OR     , XOR       , NOT
		//논리연사자의 피연산자는 boolean타입만 사용가능
		
		int k1=10;
				
		if(k1>20) {
			int k3=k1+10;
			System.out.println(k3);		//블록 pass
		}
		if(k1<20) {
			int k4=k1+10;
			System.out.println(k4);		//20 출력
		}
			
		if((k1>8)&&(k1<12)) { //둘 모두 true 일때 결과는 true
			System.out.println("8과12사이의 숫자군요"); //출력ok
				}
		if((k1==8)||(k1>8)) { //둘중 하나만 true이면 결과는 true 
			System.out.println("8이상의 숫자군요"); //출력ok
		}
		if((k1==8)^(k1>8)) { //true-false 일때 결과는 true
			System.out.println("8이상의 숫자군요"); //출력ok
		}
		
		//5.대입연산자
		//오른쪽 피연산자 값을 왼쪽 피연산자인 변수에 저항.
		
		int result=5;
		
		result=10;
		System.out.println(result);		//10
		
		result+=10;						//변수=변수(+,-,*,/,%)10
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
		
		
		//삼항연산자(피연산자가 3개)
		int score=85;
		char grade=(score>80)?'A':'B';
		System.out.println(grade);		//A출력
		
		if(score>80) {
			System.out.println('A');	//A출력
		}else {
			System.out.println('B');
		}
		
		char grade1=(score>90)?'A':(score>80)?'B':'C';
		System.out.println(grade1);    //B출력
		
		if(score>90){
			System.out.println('A');	//B출력
		if(score>80){
			System.out.println('B');
		}
		else {
			System.out.println('c');
		}
			
	}
	}	
	
		
	}



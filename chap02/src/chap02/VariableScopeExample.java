package chap02;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1=5;
		int v2=0;
//		short v4=0;
		float z1=3.15f;
		double	z2=z1;
						
		
		if(v1>10){
			v2=v1-5;
		}
		else if(v1>3) 
		{
			v2=v1;
		}
		int v3=v1+v2;
		System.out.println("v3="+v3);
		System.out.println(z1);
		System.out.println(z2);
		
		//주석처리 단축기
		// ctrl + / 한줄주석 생성 및 해제
		// 블록지정후 ctrl + / 다중 주석 설정
		// 블록지정후 ctrl + shift + / 다중 주석 설정
		// 블록지정후 ctrl + shift + \  다중 주석 해제
		
	}//end of main

}//end of class

package test.day8;

import java.util.Arrays;


public class Day8 {
	public static void main(String[] args) {
			
		// 로또 번호 출력하기
		int a1=(int)(Math.random()*45)+1;		
		int a2=(int)(Math.random()*45)+1;
		int a3=(int)(Math.random()*45)+1;
		int a4=(int)(Math.random()*45)+1;
		int a5=(int)(Math.random()*45)+1;
		int a6=(int)(Math.random()*45)+1;
		
		
		while(a2==a1) {
			a2=(int)(Math.random()*45)+1;
			if(a2 != a1) {
				break;
			}			
		}
		
		while(a3==a2||a3==a1) {
			a3=(int)(Math.random()*45)+1;
			if(a3 !=a2 && a3 != a1) {
				break;
			}
		}
		while(a4==a3||a4==a2||a4==a1) {
			a4=(int)(Math.random()*45)+1;
			if(a4!=a3 && a4 !=a2 && a4 != a1) {
				break;
			}
		}
		while(a5==a4||a5==a3||a5==a2||a3==a1) {
			a5=(int)(Math.random()*45)+1;
			if(a3 !=a2 && a3 != a1) {
				break;
			}
		}
		while(a6==a5||a6==a4||a6==a3||a3==a2||a3==a1) {
			a3=(int)(Math.random()*45)+1;
			if(a3 !=a2 && a3 != a1) {
				break;
			}
		}	
		
		System.out.printf("이번주 로또 번호 %d,%d,%d,%d,%d,%d\n",a1,a2,a3,a4,a5,a6);
		int[] arr= {a1,a2,a3,a4,a5,a6};
		Arrays.sort(arr);
		System.out.println("이번주 로또 번호는 :"+Arrays.toString(arr));
		
		//배열을 사용하여 로또 번호 구하기
		/*
		int lotto[]=new int[6];
		for(int i=0; i<6;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
			if(lotto[i]==lotto[j]) {  // if(lotto[i]==lotto[i+1]? i=6일때 7이되므로 오버함
				i--;
			}
		}
		}*/
		
		
		int lotto[]=new int[7];
		for(int i=0; i<6;i++) {
			lotto[i]=(int)(Math.random()*6+1);
			if(lotto[i]==lotto[i+1]) {  
				i--;
			
		}
		}
		System.out.println(Arrays.toString(lotto));
		}
		
		}
	



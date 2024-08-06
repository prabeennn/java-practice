package com.numberprog.practice;

public class EvenSumOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=234789;
		int evenSum=0;
		int oddSum=0;
		
		while(a>0) {
			int r=a%10;
			if(r%2==0) {
				evenSum+=r;
			}
			else {
				 oddSum+=r;
			 }
				
				
					
				a=a/10;
			}
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		

	}

}

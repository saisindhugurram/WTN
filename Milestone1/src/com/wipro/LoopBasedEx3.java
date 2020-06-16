package com.wipro.NumberProblems;

public class LoopBasedEx3 {
	
	int Divisors(int n) {
		int i,c=1;
		if(n==0) {
			System.out.println("every integer");
		}else {
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0) {
				c++;
			}
		}
	}return c;
		}
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		LoopBasedEx3 l=new LoopBasedEx3();
		int c=l.Divisors(n);
		if(c==2) {
		System.out.println("prime");}
		else {
			System.out.println("not prime");
			
		}
		
	}

}

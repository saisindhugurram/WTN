package com.wipro.NumberProblems;

public class LoopBasedEx2 {
	
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
		LoopBasedEx2 l=new LoopBasedEx2();
		System.out.println(l.Divisors(n));
		
	}

}

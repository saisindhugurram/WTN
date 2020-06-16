package com.wipro.NumberProblems;

public class LoopBasedEx1 {
	
	void Divisors(int n) {
		int i;
		if(n==0) {
			System.out.println("every integer");
		}else {
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0) {
				System.out.print(i+",");
			}
		}System.out.print(n);
	}}
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		LoopBasedEx1 l=new LoopBasedEx1();
		l.Divisors(n);
		
	}

}

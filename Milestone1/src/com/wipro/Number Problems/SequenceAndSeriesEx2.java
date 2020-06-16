package com.wipro.NumberProblems;

public class SequenceAndSeriesEx2 {
	void fibonacci(int x){
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(a+b<=x) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String args[]) {
	SequenceAndSeriesEx2  s=new SequenceAndSeriesEx2();
	s.fibonacci(Integer.parseInt(args[0]));
}
}

package com.wipro.NumberProblems;

public class SequenceAndSeriesEx3 {
	void fibonacci(int x){
		int a=0;
		int b=1;
		int c=0;
		int count=2;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(count<x) {
			c=a+b;
			count++;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String args[]) {
	SequenceAndSeriesEx3  s=new SequenceAndSeriesEx3();
	s.fibonacci(Integer.parseInt(args[0]));
}
}

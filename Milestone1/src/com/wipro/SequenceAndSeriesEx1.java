package com.wipro.NumberProblems;
import java.lang.Math;
public class SequenceAndSeriesEx1 {
	int fibonacci(int x) {
		int p=5*x*x+4,q=5*x*x-4,d1,d2;
		d1=(int)Math.sqrt(p);
		d2=(int)Math.sqrt(q);
		if(p==d1*d1||q==d2*d2)
		{
			return 1;
		}else {
			return 0;
		}
	}
	
public static void main(String args[]) {
	SequenceAndSeriesEx1 s=new SequenceAndSeriesEx1();
	int x=s.fibonacci(Integer.parseInt(args[0]));
	if(x==1) {
		System.out.println("fibonacci");
	}
	else {
		System.out.println("not fibonacci");	}
}
	
	
}

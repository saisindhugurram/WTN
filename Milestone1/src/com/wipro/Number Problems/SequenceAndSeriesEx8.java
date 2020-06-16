package com.wipro.NumberProblems;

public class SequenceAndSeriesEx8 {
	void am(int initial, int ratio,int n) {
		int i;
		int a=initial;
		int d=ratio;
		System.out.println(a);
		for(i=1;i<n;i++)
		{
			a*=d;
			System.out.println(a);
		}
	}
	public static void main(String args[]) {
		
		SequenceAndSeriesEx8 s=new SequenceAndSeriesEx8();
		s.am(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}

}

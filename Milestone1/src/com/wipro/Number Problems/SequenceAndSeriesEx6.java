package com.wipro.NumberProblems;

public class SequenceAndSeriesEx6 {
	void am(int initial, int difference,int n) {
		int i;
		int a=initial;
		int d=difference;
		System.out.println(a);
		for(i=1;i<n;i++)
		{
			a+=d;
			System.out.println(a);
		}
	}
	public static void main(String args[]) {
		
		SequenceAndSeriesEx6 s=new SequenceAndSeriesEx6();
		s.am(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}

}

package com.wipro.NumberProblems;

public class SequenceAndSeriesEx7 {
	void am(int initial, int difference,int n) {
		int i;
		int a=initial;
		int d=difference;
		int sum=0;
		
		for(i=1;i<n;i++)
		{
			a+=d;
			sum=sum+a;
			
		}System.out.println(sum+initial);
	}
	public static void main(String args[]) {
		
		SequenceAndSeriesEx7 s=new SequenceAndSeriesEx7();
		s.am(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
	}

}

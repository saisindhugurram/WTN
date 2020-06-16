package com.wipro.NumberProblems;

public class NormalEx3 {
	int m1(int a) {
		int i,sum=0;
      for(i=1;i<=a;i++) {
    	  sum=sum+(i*i*i);
      }return sum;
	}
	int m2(int n) {
		int p;
		p=(n*n*(n+1)*(n+1))/4;
		return p;
	}
	public static void main(String args[]) {
		NormalEx3 n=new NormalEx3();
		int f=n.m1(Integer.parseInt(args[0]));
		int f1=n.m2(Integer.parseInt(args[0]));
		System.out.println(f);
		System.out.println(f1);
		
		
	}

}

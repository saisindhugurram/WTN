package com.wipro.flowControlStatements;

public class Ex12 {
public static void main(String args[]) {
	int x=Integer.parseInt(args[0]);
	int flag=0;
	if(x==1) {
		System.out.println("neither prime nor composite");
		
	}
	else {
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0) {
				flag=1;
				break;
			}
		}
		
	}if(flag==1)
	{
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
	
}
}

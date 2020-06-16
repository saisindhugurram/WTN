package com.wipro.NumberProblems;

public class NestedLoopsEx1 {
	void prime() {
		int flag=0;
		for(int j=2;j<=100;j++) {
			flag=0;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			
		if(flag==0)
		{
			System.out.println(j);
		}

		}
	}
	public static void main(String args[]) {
		NestedLoopsEx1 n=new NestedLoopsEx1();
		n.prime();
		
	}

}

package com.wipro.flowControlStatements;

public class Ex6 {
	public static void main(String args[]) {
		String s1=args[0];
		int x=Integer.parseInt(args[1]);
		if(s1.equals("Male")&&(x>=1 &&x<=58)) {
			System.out.println("8.4%");
		}
		else if(s1.equals("Male")&&(x>=59 &&x<=100)) {
			System.out.println("10.5%");
		}
		else if(s1.equals("Female")&&(x>=1 &&x<=58)) {
			System.out.println("8.2%");
		}
		else if(s1.equals("Female")&&(x>=1 &&x<=58)) {
			System.out.println("9.2%");
		}
	}

}

package com.wipro.flowControlStatements;

public class Ex3 {

	public static void main(String args[]) {
		if(args.length==0) {
			System.out.println("No Value");
		}
		else {
			for(int i=0;i<(args.length)-1;i++) {
				System.out.print(args[i]+",");
			}System.out.print(args[(args.length-1)]);
		}
	}
	
}

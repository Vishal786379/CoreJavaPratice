package com.vishal.JumpStatement;

public class BreakExample {
	
	public static void main(String args[]) {
		
		//break the loop at specified condition
		for(int i = 1;i<=5;i++) {
			if(i==4) {
				break;
			}else {
			System.out.println(i);
			}
		}
	}

}

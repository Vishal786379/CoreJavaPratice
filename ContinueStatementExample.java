package com.vishal.JumpStatement;

public class ContinueStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue statement it will continue the statement from next itertion
		
		for(int i = 1;i<=5;i++) {
			
			if(i==3) {
				System.out.println("Loop is at 3");
				continue;
			}
			System.out.println("Welcome"+i);
			System.out.println("How are you?"+i);
			System.out.println("I am fine"+i);
		}
	}

}

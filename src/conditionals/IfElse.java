package conditionals;

import java.util.Scanner;

public class IfElse {
	
/*
 * Project Goals:
	Build app using conditional statements
	User inputs nums between 1-100
	Diplay user's results based on num range
*/
	public static void main(String[] args) {
		int num;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a number between 1-100.");
		//change the var of num to scnr to receive the user input of inter/num
		num = scnr.nextInt();
		//simple sysout to test if num was received
		System.out.println("Your number is "+num);
		
		//next do if else - line by line tiny bits. start with odd vs even
		
		if (num % 2==0) {
			System.out.println("your number "+ num + " is even");
		}
		else {
			System.out.println("your number " +num + " is odd");
		}
	}
}

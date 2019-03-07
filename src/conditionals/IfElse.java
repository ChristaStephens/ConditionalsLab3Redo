package conditionals;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// Project Goals: user enters num between 1-100
		//if num odd print odd
		//if num even between 2-25 print "even & less than 25"
		//if num entered is even between 26-60 print even
		//if num is even and < 60 print num and  and even
		//if num is odd and <60 print "odd and over 60"

		int num;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 100.");
		
		num = scnr.nextInt();
		if (num %2==0 && num<25) {
			
		}
	}

}

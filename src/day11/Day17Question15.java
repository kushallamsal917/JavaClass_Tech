package day11;

import java.util.Scanner;

public class Day17Question15 {

	public static void main(String[] args) {
		
		

	Scanner input = new Scanner (System.in);
	System.out.println("Enter number 0-128:");	
	int n = input.nextInt();
	if (n >= 0 && n <= 128)	{	
		char c = (char)n;
		System.out.println("ASCII character code is:"+c);
	}

		
	}

	}
	


package day11;

import java.util.Scanner;

public class Day19Question20 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter choice :+|-|*|/");
		char choice = input.next().charAt(0);
		
		System.out.println("Enter number1:");
		int a = input.nextInt();
		
		System.out.println("Enter number2:");
		int b = input.nextInt();
		
		switch (choice ) {
		
		case '+':
			int sum = a+b ;
			System.out.println("This is sum :"+sum);
			break;
		case '-':
			int sub = a-b;
			System.out.println("This is subtraction:"+sub);
			break;
		case '*':
			int mul= a*b;
			System.out.println("This is multiply:"+mul);
			break;
		case '/':
			int div = a/b;
			System.out.println("This is division:"+div);
			break;
			default:
				
		}
		System.out.println("Exit");
	}

}

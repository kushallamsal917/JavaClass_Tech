package day11;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number1:");
		int num1 = input.nextInt();
		System.out.println("Enter numbe2 : ");
		int num2 = input.nextInt();
		System.out.println("Enter number3:");
		int num3 = input.nextInt();
		int mul = num1 * num2* num3 ;
		System.out.println("Multi of " + num1 +"*" + num2 +"is=  "+mul );
		int div = num1/num2;
		System.out.println("Divison of "+num1+"/"+num2+"is = " +div);
	}
	

}

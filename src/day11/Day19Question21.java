package day11;

import java.util.Scanner;

public class Day19Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter choice 1. sunday|2.monday|3.tuesday|4.wednesday|5.thursday|6.friday|7.saturday|");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("This is sunday");
		break;
		
		case 2:
			System.out.println("This is monday");
			break;
		case 3:
			System.out.println("This is tuesday");
			break;
		case 4:
			System.out.println("This is wednesday");
			break;
		case 5:
			System.out.println("This is thursday");
			break;
		case 6:
			System.out.println("This is friday");
		case 7:
			System.out.println("This is saturday");
			
		}// end of switch
		System.out.println("Exit");
	}

}

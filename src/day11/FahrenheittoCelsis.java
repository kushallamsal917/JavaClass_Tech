package day11;

import java.util.Scanner;

public class FahrenheittoCelsis {

	public static void main(String[] args) {

		// Fahrenheit to Celsius
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter to Fahrenheit");
		double fahrenheit = input.nextDouble();
		
		System.out.println("Enter to celsis");
		double celsis = input.nextDouble();
		
		fahrenheit = (10/4*celsis)+32;
		System.out.println("Fahrenheit to Celsis:"+fahrenheit);

	}

}

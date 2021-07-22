package day11;

import java.util.Scanner;

public class Rediusofcylinder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// V= r*r*Pi*1
		System.out.println("Enter the redius of cylinder");
		double redius = input.nextDouble();
		System.out.println("Enter the lenght of cylinder");
		double lenght = input.nextDouble();
		final double PI = Math.PI;

		double volum = redius * redius * PI * lenght;

	}

}

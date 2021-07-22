package day11;

import java.util.Scanner;

public class PoundtoKg {

	public static void main(String[] args) {

		
		Scanner input =new Scanner (System.in);
		System.out.println("Enter number in pound");
		double pound = input .nextDouble();
		double kg = input.nextDouble();
		kg=pound*0454;
		System.out.println("pound + is "+kg+"kg");
	}

}

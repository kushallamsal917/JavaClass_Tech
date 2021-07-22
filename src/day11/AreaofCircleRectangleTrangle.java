//Area of Circle,Rectangle,Trangle In java
package day11;

import java.util.Scanner;

public class AreaofCircleRectangleTrangle {
	public static void main(String[] args) {
		
		
		double radius,perimeter;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Circle:");
		System.out.println("Enter the Area of Circle num1");
		System.out.println("Enter the Area of Rectangle num2");
		System.out.println("Enter the Ara of Trangle num3");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("Circle:");
		System.out.println("Rectangle:");
		System.out.println("Trangle:");
		 radius = input.nextDouble();
		double c_area= 3.14*radius*radius;
		System.out.println("Area of Circle is :"+c_area);
		
		
	}
	
	
	

}

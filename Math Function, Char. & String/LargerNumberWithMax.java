package week7_MathCharString;

import java.util.Scanner;

//Purpose: Compare two double numbers from user
//          and show the one is larger using Max Function
public class LargerNumberWithMax {

	public static void main(String[] args) {
		//1. Get two double numbers from users
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		//2. Compare two numbers with Max Function
		//3. Print out the larger number
		System.out.println(Math.max(num1, num2)+ " is the larger number among "+num1 + " and " + num2);
				
	
		
	}

}

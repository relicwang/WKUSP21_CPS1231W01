package week7_MathCharString;

import java.util.Scanner;

//Purpose: Compare 5 double numbers from user 
//         and show the largest one (with Max function only)

public class LargestNumberWithMax {

	public static void main(String[] args) {
		//1. Get 5 double numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five numbers: ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double num4 = input.nextDouble();
		double num5 = input.nextDouble();
		
		//2. Compare 5 numbers and find the largest one
		//    with Max function
		double largestNum = Math.max(Math.max(Math.max(Math.max(num1, num2), num3),num4),num5);
	
		//3. Show the largest number
		System.out.println("The largest number is: "+largestNum);
		
	}

}

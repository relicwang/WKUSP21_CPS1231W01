package week7_MathCharString;

import java.util.Scanner;

//Purpose: Check the user given user whether is within the boundary
//         [5,26]. If so, return that value; otherwise, return the closest boundary
public class ClosestBoundary {

	public static void main(String[] args) {
		//1. Get the number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		double num = input.nextDouble();
	
		
		//2. Check whether the number is within the boundary.
		//   If so, return that value; otherwise, return the closest boundary.
		System.out.println("The closest value is " +
				Math.min(Math.max(num, 5), 26));
		
		
	}

}

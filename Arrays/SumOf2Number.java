package week12_Array;

import java.util.Scanner;

//Purpose: Compute the sum of 6 integer numbers
//         which are given by user
public class SumOf2Number {

	public static void main(String[] args) {
		//1. Get 6 numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 6 numbers and seperated by a space:");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int num6 = input.nextInt();
		
		//2. Compute the sum
		int sum = num1 + num2 + num3 + num4 + num5 +num6;
		
		//3. Print out result
		System.out.printf("The sum of %d, %d, %d, %d, %d and %d is %d",
				num1,num2,num3,num4,num5,num6,sum);
	}

}

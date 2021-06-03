package week12_Array;

import java.util.Scanner;

//Purpose: Compute the sum of 10 integer numbers
//       which are given by user
public class SumOfNumbersArray{

	public static void main(String[] args) {
		//1. Get 10 numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers and seperated by a space:");
		
		int [] numbers = new int[10];
	
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextInt();
		}
		
		//2. Compute the sum
		int sum =0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		
		//3. Print out result
		System.out.printf("The sum is %d",sum);
	}

}


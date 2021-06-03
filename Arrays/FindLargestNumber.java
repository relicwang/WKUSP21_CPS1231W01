package week12_Array;

import java.util.Scanner;

//Purpose: Find the largest number and corresponding index 
//  		from 10 integer numbers given by user             
public class FindLargestNumber {

	public static void main(String[] args) {
		//1. Save 10 integer numbers from users
		int[] numbers = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers in order.");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextInt();
		}
		
		//2. Find the largest number and the correspdonding
		int max = numbers[0];//Max: ---> largest so-far
		int maxIndex =0;
		
		for(int i=1;i<numbers.length;i++) {
			/*
			 * if(max>numbers[i]) { //I am happy, largest so-far still holds }
			 */
			if(max<numbers[i]) {
				//largest so-far still NOT holds Anymore
				max = numbers[i];//Enforce the largest so-far
				
				maxIndex=i;
			}
		}
		
		//3. Print the largest number
		System.out.printf("The largest value is %d and corresponding index is %d",
				max, maxIndex);
	}

}

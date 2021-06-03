package week12_Array;

import java.util.Arrays;
import java.util.Scanner;

//Purpose: Compute the sum of 50 integer numbers from user
public class SumOf20Numbers {

	public static void main(String[] args) {
		//1. Get 20 integers from user and save it
		//     in the array
		int[] nums = new int[20];
		System.out.println("Please enter 20 numers and seperate by the space:");
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=input.nextInt();
		}
		
		
		//2. Compute the sum of elements in array
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		//Print array
//		System.out.println(nums);
//		System.out.println(Arrays.toString(nums));
		
		//3. Print the sum
		System.out.printf("The sum for %s is %d",Arrays.toString(nums), sum );
		
	}

}

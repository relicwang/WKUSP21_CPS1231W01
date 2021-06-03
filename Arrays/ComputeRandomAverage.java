package week12_Array;

import java.util.Arrays;

//Purpose: Compute the average value of 100 random double values, 
//         the range is [0,100)
public class ComputeRandomAverage {

	public static void main(String[] args) {
		//1. Generate 100 random double values in range [0,100) and save
		double [] numbers = new double [100];
		
		for(int i=0; i<numbers.length;i++){
			numbers[i] = Math.random()*100;
		}
		
		//2. Compute the average of random numbers
		//  a. compute sum of all numbers
		
		double sum=0;
		
		for(int i=0; i<numbers.length;i++) {
			sum+=numbers[i];
		}
		
		//  b. Compute the division sum/# element
		double average = sum/numbers.length;
		
		//3. Print out the average value
		System.out.printf("The average for %s \n is %f: ",
				Arrays.toString(numbers), average);
		
	}

}

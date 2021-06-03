package week12_Array;

import java.util.Arrays;

public class ArrayCopyPractice {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1;
		
		int[] arr3 = {1,2,3,4};

		
		
		arr2[0]=-100;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)+"\n");
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);

		
	}

}

package week12_Array;

import java.util.Arrays;

//Purpose: Implement a method that will shift elements in the given 
//          array one left and move the first element to the tail.
public class ShiftOneLeft {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4};
//		System.out.println(arr1);
//		System.out.println(Arrays.toString(arr1));
		m(arr1);
		System.out.println("Arr1 after m method: "
				+Arrays.toString(arr1));

//		
//		//Test Case for shiftOneLeft Method
//		System.out.println(
//				ArrayHelperMethod.equals(shiftOneLeft(new int[]{1,2,3,4}), new int[]{2,3,4,1}));
//
//		System.out.println(
//				ArrayHelperMethod.equals(shiftOneLeft(new int[]{}), new int[]{}));
//		System.out.println(
//				ArrayHelperMethod.equals(shiftOneLeft(new int[]{1}), new int[]{1}));
		
		
		
		
		
		//Test Case for shiftOneLeft void Method
		
		int [] arr2 ={1,2,3,4};
		int [] arr3 ={};
		int [] arr4 ={1};
		
		shiftOneLeft(arr2);
		System.out.println(
				ArrayHelperMethod.equals(arr2, new int[]{2,3,4,1}));
		
		shiftOneLeft(arr3);
		System.out.println(
				ArrayHelperMethod.equals(arr3, new int[]{}));
	
		shiftOneLeft(arr4);
		System.out.println(
				ArrayHelperMethod.equals(arr4, new int[]{1}));
		
		
	}
	
	//Signature: shiftOneLeft:  int[] -> void
		//Purpose: Shift elements in the given array one left 
		//          and move the first element to the tail
		//Example:  shiftOneLeft(new int[]{1,2,3,4}) 
		//                   -> new int[]{2,3,4,1};
		//          shiftOneLeft(new int[]{2,5,0,0})
		//                  -> new int[]{5,0,0,2}
		public static void shiftOneLeft(int[] arr) {
			//1. Return empty array is array is empty
			if(arr.length==0) {
				return;
			}
			
			
			//1. Save the value of 1st element
			int temp = arr[0];
			
			
			//2. Shift 1 left from 2nd lement
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
			
			//3. Place the original 1st element to the tail
			arr[arr.length-1]=temp;
			
		
			}
		
		
	
	
	
	
	
//	//Signature: shiftOneLeft:  int[] -> int[]
//	//Purpose: Shift elements in the given array one left 
//	//          and move the first element to the tail
//	//Example:  shiftOneLeft(new int[]{1,2,3,4}) 
//	//                   -> new int[]{2,3,4,1};
//	//          shiftOneLeft(new int[]{2,5,0,0})
//	//                  -> new int[]{5,0,0,2}
//	public static int[] shiftOneLeft(int[] arr) {
//		//1. Return empty array is array is empty
//		if(arr.length==0) {
//			return arr;
//		}
//		
//		
//		//1. Save the value of 1st element
//		int temp = arr[0];
//		
//		
//		//2. Shift 1 left from 2nd lement
//		for(int i=1;i<arr.length;i++) {
//			arr[i-1]=arr[i];
//		}
//		
//		//3. Place the original 1st element to the tail
//		arr[arr.length-1]=temp;
//		
//		return arr;
//		}
//	
//	
	
	
	public static void m(int[] arr2) {
		arr2[0]=5;
		System.out.println("Arr2 is "+Arrays.toString(arr2));
	}
	
	
	}







import java.util.*;

//Purpose: Compare two integer numbers from user
//           and output the one that is larger
public class GetLargerNumber {

	public static void main(String[] args) {
		//1. Get two numbers from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two number and "
				+ "seperated by a space: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
	

		//2. Compare two numbers
		//    Output the one that is larger
		if(num1>num2) {
			System.out.println(num1 + " is Larger compared to "+ num2);
		}
		else {
			System.out.println(num2 + " is Larger compared to "+ num1);
			}
		
	
		
	}

}

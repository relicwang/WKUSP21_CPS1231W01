package week8_MathCharString;

import java.util.Scanner;

//Purpose: Extract the first and last name from user given String
public class SplitName {

	public static void main(String[] args) {
		//1. Get the full name from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a name and "
				+ "use a space to seperate first and last name:");
		
		String fullName = input.nextLine();
		
		//2. Get the index (indexOfSpace) of the white space 
		//    between first and last name
		int indexOfSpace = fullName.indexOf(' ');
		
		//3. Take out first name (.substring[0,indexOfSpace]
		String firstName = fullName.substring(0,indexOfSpace);
		
		//4. Take out last name   (.substring[indexOfSpace+1]
		String lastName = fullName.substring(indexOfSpace+1);
		
		//5. Show first and last name
		System.out.println("The fist name is "+firstName);
		System.out.println("The last name is "+lastName);

		
	}

}

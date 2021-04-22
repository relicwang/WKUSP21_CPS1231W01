package week9_Loops;

import java.util.Scanner;

//Purpose: Generate a random integer within [0,100],
//           and invite user to give a value 
//           then show "too low", "too high", or "Equal" 
//           base on the result. 
//           The program will keep invite user to enter
//           the guess until the guess matches the random Integer.

public class GuessNumber {

	public static void main(String[] args) {
		//1. Generate a random integer [0,100]
		int randInt = (int)(Math.random()*101);
		System.out.println("[Test Purpose]"+randInt);
		
		//2. Ask user to input an integer
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your guess"
				+ "(A integer within [0,100]):");
		
		int userGuess = input.nextInt();
		
		//3. Present the user the result:
		//   either "too low", "too high", or "Equal"
		//   Keep asking user to input if the result is not "Equal" 
	
		while(userGuess!=randInt) {
			//Keep ask user give us the value
			if(userGuess<randInt) {
				System.out.println("Too Low");
			}
			else if(userGuess>randInt) {
				System.out.println("Too High");
			}
			
			//Capture user input
			System.out.println("Please enter your guess again:");
			userGuess = input.nextInt();
		
		}
		
		System.out.println("Equal.\nYour guess is correct! Awesome!");
		
		
		
	}

}

package week8_MathCharString;

//Purpose: Generate a lowercase letter randomly
//Idea:    a. Generate a random int. within [97,122]
//              then cast into char.

//         b. Generate a random int. within [0,25]
//              -> (char)(randInt + 'a')

public class RandomLowerLetter {

	public static void main(String[] args) {
		
		//Approach 1.
		//1. Generate a random int. within [97,122]
		int randomInt = (int)(Math.random()*(122-97+1))+97;		
		
		//2. Cast the random int. into Char.
		char lowerLetter = (char)randomInt;
		
		//3. Print out the char
		System.out.println(lowerLetter);
		
		
		//Approach 2.
		//1. Generate a random int. within [0,25]
		int randomInt2 = (int)(Math.random()*26);		
		
		//2. Cast the random int. into Char.
		char lowerLetter2 = (char)(randomInt2+'a');
		
		//3. Print out the char
		System.out.println(lowerLetter2);
		
	}

}

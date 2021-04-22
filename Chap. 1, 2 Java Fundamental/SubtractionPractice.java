import java.util.Scanner;

//Purpose: Generate a subtraction question 
//   where two single digit numbers are generated randomly.
//   Meantime, the 1st number >= 2nd number

public class SubtractionPractice {

	public static void main(String[] args) {
		//1. Generate two  single digit numbers randomly
		//     single digit integer ==  int. in [0,9]
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		//2. Check the 1st number and 2nd number,
	    //   if 1st < 2nd, swap 1st and 2nd		
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
			
		//3. Show the question, and compute the key
		System.out.println(num1 +" - "+num2+" ? ");
		int key = num1 - num2;
		
		//4. Get user answer
		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();
		
		//5. Verify user answer with the key
		if(userAnswer==key) {
			System.out.println("You answer is correct!");
		}
		else {
			System.out.println("You answer is not correct!");
		}
		
		
		byte testByete1 = 128;//127  --> +1 -->128
		byte testByete = 127;
		testByete=testByete+(byte)8;// + 01010
		
		
		
	}

}

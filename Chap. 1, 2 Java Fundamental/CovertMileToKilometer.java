import java.util.Scanner;

//Libary import ...

//Purpose: Convert mile distance to kilometer, 
//          where the value is from user
//General Idea:  kilometers = miles * 1.6
//                  1 mile = 1.6 km
//                  2 ..   = 1.6*2 
//                  3 ..   = 1.6*3
//                  n ..   = 1.6*n
public class CovertMileToKilometer {

	public static void main(String[] args) {
		//1. Get miles values from user
		double miles;
		System.out.println("Please enter the distance in mile:");
		
		Scanner input = new Scanner(System.in);
		miles = input.nextDouble();
		
		//2. Convert the distance in mile to kilometer
		double kilometers = miles * 1.6;
		
		//3. Print out the distance in kilometers
		System.out.println(miles + " miles is equal to: "+kilometers+" kilometers.");
	}

}

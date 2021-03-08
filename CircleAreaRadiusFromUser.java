import java.util.Scanner;

//Purpose: Compute the area of a circle with radius given user
//         Goal-> area = PI*r*r
public class CircleAreaRadiusFromUser {

	public static void main(String[] args) {
		//1. Define the PI value
		double pi = 3.14159;
		
		//2. Get the radius value from user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius value: ");
		double radius = input.nextDouble();
		
//		System.out.println("The radius you entered is "+ radius);
	
		//3. Compute the area
		double area = pi*radius*radius;
		
		//4. Print the area
		System.out.println("The area for Circle with radius: "+radius + " is "+area);
		
	}

}

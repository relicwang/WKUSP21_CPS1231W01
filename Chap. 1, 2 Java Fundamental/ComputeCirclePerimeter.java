import java.util.*;

//Purpose: Compute the perimeter of a circle 
//            where the radius is given users
//General Idea:  perimeter = 2*PI*radius
public class ComputeCirclePerimeter {

	public static void main(String[] args) {
		//1.Define PI value
		final double PI =3.14159;
		
		//2.Get radius from user
		double radius;
		System.out.println("Please enter the radius value:");
		Scanner input = new Scanner(System.in);
		radius=input.nextDouble();
		
		//3.Compute the perimeter
		double perimeter = 2*PI*radius;
		
		//4.Print out the perimeter
		System.out.println("The perimeter for Circle with raidus "
				+radius + " is "+perimeter);

		
		
		
		
		
		
		
		
		
		

	}

}

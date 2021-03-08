//Purpose: Compute the area of a circle with radius 10 
//         Goal -> PI*radius*radius
public class CircleArea {

	public static void main(String[] args) {
		//1. Define the radius, PI value		
		int radius = 10;
		double pi  = 3.14159;
		
		//2. Compute the area
		double area = pi*radius*radius;
		
		//3. Show the area value
		System.out.println("The area of the circle"
				+ " with radius 10 is "+ area);
		
		
	}

}

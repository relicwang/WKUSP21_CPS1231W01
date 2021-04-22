import java.util.*;

//Purpose: Compute and show the shipping cost based on following rules:
//          weight<=0     --> Show the input is not valid
//          0<weight<=2   -->2.5
//          2<weight<=4   -->4.5
//          4<weight<=10  -->7.5
//          10<weight<=20 -->10.5
//          20<weight     --> Show can't ship
public class ShippingCost {

	public static void main(String[] args) {
		//1. Get the weight from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight:");
		double weight = input.nextDouble();
		
		//2. Compute the weight and show 
		//     corresponding result based on defined rules
		if(weight<=0) {
			System.out.println("The weight is not valid");
		}
		else if(weight<=2) {
			System.out.println("The Shipping Cost is 2.5");
		}
		else if(weight<=4) {
			System.out.println("The Shipping Cost is 4.5");
		}
		else if(weight<=10) {
			System.out.println("The Shipping Cost is 7.5");
		}
		else if(weight<=20) {
			System.out.println("The Shipping Cost is 10.5");
		}
		else {
			System.out.println("Package can't ship");
		}
		
	}

}

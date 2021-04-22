
//Generate a random number between [0,10)
public class GenerateRandomNumber {

	public static void main(String[] args) {
	   //Loop 100 times
		for(int i=0;i<100;i++) {
			//1. Apply the formula (U-L)*Math.rondom()+0 
			double randomNum = Math.random()*(10-0)+0; //-> [0,10)
			
			//2. Show the random number
			System.out.println("A random number between [0,10) is "+randomNum);
		}
	}

}

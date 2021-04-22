import java.util.Scanner;

//Purpose: Implement a scissor-rock-paper game,
//    where computer will generate a random action
//    (0 represents scissor, 1 represents rock, 2 represents paper)
//    Program will show the result after user gives the action.
//    2>1>0,   0>2
public class ScissorRockPaper {

	public static void main(String[] args) {
		//1. Computer will generate a random action
		//== random integer between  [0,2]
		int computerAction = (int)(Math.random()*3);
		
		//2. Get action from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your action:  (0 represents scissor, 1 represents rock, 2 represents paper)");
		int userAction = input.nextInt();
		
		//3. Determine the result
		switch(computerAction-userAction) {
			case 2: System.out.println("Computer is Paper, User is Scissor. User Win");
			case 1: System.out.println("Computer Win");
			case 0: System.out.println("Draw");
			case -1:System.out.println("User Win");
			case -2:System.out.println("Computer is Scissor, User is Paper. Computer Win");
		}
		
		
		//Show draw case when computer action is same as user action
		if(computerAction==userAction) {
		
		}
		
		switch(computerAction) {
			case 0:
					switch(userAction) {
						case(1):ss
						case(2):
							}
				
			case 1:
					switch(userAction) {
						case(0):
						case(2):
						}
			case 2:
					switch(userAction) {
						case(0):
						case(1):
	
						}
		}
		
		
	}

}

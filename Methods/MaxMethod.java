package week11_Methods;
//Purpose: A program implements max function
public class MaxMethod {

	public static void main(String[] args) {
		//Test Case for max method:
		//1. #1 > #2
		System.out.println(max(3,1)==3);
		System.out.println(max(-1,-5)==-1);
		System.out.println(max(1,-5)==1);
		System.out.println(max(6,0)==6);

		//2. #1 < #2
		System.out.println(max(1,2)==2);
		System.out.println(max(0,1)==1);
		System.out.println(max(-1,1)==1);
		
		//3. #1 == #2
		System.out.println(max(2,2)==2);
		System.out.println(max(-1,-1)==-1);
		System.out.println(max(0,0)==0);

	}

	//Signature:  max: int, int -> int
	//Purpose:    Compare two given integers and 
	//             and return the one is larger.
	//Example:
	//            max(1,2) ->2
	//            max(2,1) ->2
	//            max(2,3) ->3
	public static int max(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
		
	}
	
	
}

package week7_MathCharString;

public class CharPractice {

	public static void main(String[] args) {
		
		int a ='a';
		
		int i = 0;
		char j = 'A';   //Code value for '0' is 48
		
		int codeValForA=66;
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		System.out.println("Code value for Letter A "+(int)j);
		System.out.println("Character with code value 66 "+(char)codeValForA);

		System.out.println(j==i);
		System.out.println(j-i);//(int)j- i
		System.out.println(Character.getNumericValue(j)==i);


	}

}

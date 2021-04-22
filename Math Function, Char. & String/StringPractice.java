package week8_MathCharString;

public class StringPractice {

	public static void main(String[] args) {
		//1. Comparision among primitive Data Type
		int i = 1;
		int j = 1;
		
		System.out.println(i==j);
		
		//2. Comparision among Reference Data Type: String
		String s1 ="WKU ";
		String s2 ="COMPUTER SCIENCE";
		String s3 ="WKU COMPUTER SCIENCE";
		String s4 =s1+s2;
		String s5 = s3;
		String s6 ="WKU COMPUTER SCIENCE";
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		
//		System.out.println(s5==s3);
//		System.out.println(s6==s3);
	}

}

package Sample;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original;
		String reverse = "";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a string or number to check : ");
		original = str.next();
		int len = original.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);	
		}
		if(original.equals(reverse)) {
			System.out.println("The given String is Polindrome");
		}
		else {
			System.out.println("The given String is not Polindrome");
		}
	}

}

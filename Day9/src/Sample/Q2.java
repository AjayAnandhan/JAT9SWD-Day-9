package Sample;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String original;
		String reverse = "";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a string to reverse : ");
		original = str.next();
		int len = original.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);	
		}
		System.out.println(reverse);
	}

}

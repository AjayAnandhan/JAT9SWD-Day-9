package Sample;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 S - 100
		 A - 90-99
		 B - 80-89
		 C - 70-79
		 D - 60-69
		 E - 50-59
		 F - <50
		 */
		
		Scanner mark = new Scanner(System.in);
		System.out.print("Enter your mark : ");
		int a = mark.nextInt();
		if(a>100) {
			System.out.println("Invalid input");
		}
		else if(a==100) {
			System.out.println("S");
		}
		else if((a>=90)&&(a<=99)) {
			System.out.println("A");
		}
		else if((a>=80)&&(a<=89)) {
			System.out.println("B");
		}
		else if((a>=70)&&(a<=79)) {
			System.out.println("C");
		}
		else if((a>=60)&&(a<=69)) {
			System.out.println("D");
		}
		else if((a>=50)&&(a<=59)) {
			System.out.println("E");
		}
		else {
			System.out.println("F");
		}
		
	}

}

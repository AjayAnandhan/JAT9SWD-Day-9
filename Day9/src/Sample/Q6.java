package Sample;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the month : ");
		int month = in.nextInt();
		System.out.print("Enter the rent amount : ");
		float rent = in.nextFloat();
		System.out.print("Enter the number of days you've stayed : ");
		int days = in.nextInt();
		
		switch (month) {
		case 4:
			rent = rent + (rent*20/100);
			System.out.println(String.format("%.2f",rent*days));
			break;
		case 5:
			rent = rent + (rent*20/100);
			System.out.println(String.format("%.2f",rent*days));
			break;
		case 6:
			rent = rent + (rent*20/100);
			System.out.println(String.format("%.2f",rent*days));
			break;
		case 11:
			rent = rent + (rent*20/100);
			System.out.println(String.format("%.2f",rent*days));
			break;
		case 12:
			rent = rent + (rent*20/100);
			System.out.println(String.format("%.2f",rent*days));
			break;
			default:
				System.out.println(String.format("%.2f",rent*days));
		}
	}

}

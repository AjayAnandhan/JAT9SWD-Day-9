package Sample;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,a = 0;
        for (i = 1; i <= 4; i++) {
        	  
  
            // loop to print the number of stars in each row
            for (j = 1; j <= i; j++) {
            	a++;
                System.out.print(a+" ");
            }
  
            // for new line after printing each row
            System.out.println();
        }
				
	}

}

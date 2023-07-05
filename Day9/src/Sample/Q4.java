package Sample;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int n =5;
    	
    	int val = n+1;
    	int i,j,k;
    	int space = n;
    	
    	for(i=1; i<=n; i++) {
    		
    		if(i<=val/2) {
    			
    			for(j=1; j<=i; j++) {
    				System.out.print(" ");
    			}
    			}
    		else {
    			for(j=i; j<val; j++) {
    				System.out.print(" ");
    			}
    		}
    		
    		if(i != val/2) {
    			System.out.print("*");
    		}
    		if(i<val/2) {
    			space -= 2;
    			for(k=1; k<=space; k++) {
    				System.out.print(" ");
    			}
    		}
    		if(i>val/2) {
    			for(k = 1; k <= space; k++) {
    				System.out.print(" ");
    			}
    			space += 2;
    		}
    		System.out.println("*");
    	}
	}

}

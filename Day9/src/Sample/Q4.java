package Sample;

public class Q4 {

    private static void displayUpperPart(int size)
    {
        int m, n;
        for (m = size; m > 0; m--) {
//            for (n = 0; n < m; n++) {
//                System.out.print(" ");
//            }

            for (n = size; n < 0; n--) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
 
//    private static void displayLowerPart(int size)
//    {
//        int m, n;
//        for (m = 1; m <= size; m++) {
//
//            for (n = 1; n < m; n++) {
//                System.out.print(" ");
//            }
//
//            for (n = m; n <= size; n++) {
//                System.out.print("*" + " ");
//            }
//
//            System.out.println();
//        }
//    }

    public static void main(String[] args)
    {
        int size = 5;
        displayUpperPart(size);
        //displayLowerPart(size);
	}

}

import java.util.*;

public class loopsexe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int counter = 0;
         * int whichtime = sc.nextInt();
         * while (counter < whichtime) {
         * System.out.println("Hello World");
         * counter += 1;
         * }
         * System.out.println("Your Printing completed successfully " + whichtime);
         */

        // print number from 1 to 10
        /*
         * int num = 1;
         * System.out.print("Enter the number as far as printing numbers = ");
         * int end = sc.nextInt();
         * while (num < end) {
         * System.out.println(num++);
         * }
         */

        /*
         * int num2 = ;
         * System.out.print("Hello World :-    ");
         * int num2 = sc.nextInt();
         */
        /// **FOR LOOP */
        /*
         * for (int i = 1; i <= 10; i++) {
         * System.out.println("Hello world");
         * }
         */
        // print square pattern
        /*
         * for (int line = 1; line <= 4; line++) {
         * System.out.println("****");
         * }
         */
        /*
         * int line = 1;
         * while (line <= 4) {
         * System.out.println("****");
         * line++;
         * }
         */

        // print reverse of a number
        /*
         * System.out.print("Enter the Reverse Num = ");
         * int n = sc.nextInt();
         * while (n > 0) {
         * int lastdigit = n % 10;
         * System.out.print(lastdigit);
         * n = n / 10;
         * }
         * System.out.println();
         */

        // Reverse Print the number
        System.out.print("Enter the Reverse Num = ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.print(rev);
    }

}

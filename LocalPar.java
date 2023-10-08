import java.util.*;

public class LocalPar {
    public static void main(String[] args) {
        System.out.println("Hello Raj ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a > b) {
            System.out.println("First number is Greater than Second number = " + a);
            return;

        }
        System.out.println("Second number is Greater than First number = " + b);

    }
}

// Figuring out if input is prime using division.
import java.util.*;
public class prime {
    static boolean Prime (int number) {
        // Check for all possible factors.
        for (int i = 2; i < number  - 1; i ++) {
            if (number % i == 0) {
                return false;
            }
        }
        // Number is prime if there are no factors from 2 to number minus 1.
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (Prime(number) == true) {
            System.out.println("Prime!");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
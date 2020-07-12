//Figuring out if input is prime using multiplication.
import java.util.*;
public class prime_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        // Create an array storing all number values from zero to the number
        int[] array = new int[number + 1];
        // Mark all multiples of i starting from 2 until half the number.
        for (int i = 2; i < number; i++) {
            for (int j = 1; j < number / 2; j++) {
                array[i * j] = 1;
            }
        }
        // If number isn't marked, it's prime.
        if (array[number + 1] == 0) {
            System.out.println("Prime!");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
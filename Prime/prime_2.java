//Figuring out if input is prime using multiplication.
import java.util.*;
public class prime_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        int[] array = new int[number + 1];
        for (int i = 2; i < number; i++) {
            for (int j = 1; j < number / 2; j++) {
                array[i * j] = 1;
            }
        }
        if (array[number + 1] == 0) {
            System.out.println("Prime!");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
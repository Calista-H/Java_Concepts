import java.util.*;
// The triangle sequence is a sequence where f(n) = f(n-1) + n. 
// f(1) = 1.
// f(n) = 1 + 2 + 3 + ... + n
// The program will print out the nth triangular number where n is inputted by the user.
public class triangle_sequence {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
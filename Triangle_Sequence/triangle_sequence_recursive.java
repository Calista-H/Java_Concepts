import java.util.*;
// The triangle sequence is a sequence where f(n) = f(n-1) + n. 
// f(1) = 1.
// f(n) = 1 + 2 + 3 + ... + n
// The program will print out the nth triangular number where n is inputted by the user.
public class triangle_sequence_recursive {
  static int f(int n) {
    if (n == 1) {
      return 1;
    }
    return f(n - 1) + n;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(f(n));
  }
}
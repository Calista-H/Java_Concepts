import java.util.*;
public class Fibonacci {
  static int f(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return f(n - 2) + f(n - 1);
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(f(n));
  }
}
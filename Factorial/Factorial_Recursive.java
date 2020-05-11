import java.util.*;
public class Factorial_Recursive {
  static int factorial(int n) {
    // Base case.
    if (n == 1) {
      return 1;
    }
    
    // Recursive case.
    int result = n * factorial(n - 1);
    return result;
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(factorial(n));
  }
}
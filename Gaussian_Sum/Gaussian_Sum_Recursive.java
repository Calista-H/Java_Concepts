import java.util.*;
public class Gaussian_Sum_Recursive {
  static int recursive(int n) {
    if (n == 1) {
      System.out.print("1");
      return 1;
    }
    System.out.print(n + " + ");
    int sum = n + recursive(n - 1);
    return sum;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(" = " + recursive(n));
  }
}
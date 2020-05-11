import java.util.*;
public class Factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int product = 1;
    for (int i = n; i > 0; i--) {
      product =  product * i;
    }
    System.out.println(product);
  }
}
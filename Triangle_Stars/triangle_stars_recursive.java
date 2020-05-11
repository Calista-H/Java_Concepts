import java.util.*;
public class triangle_stars_recursive {
  static void draw(int n) {
    // base case
    if (n == 1) {
      System.out.println("*");
      return;
    }
    // recursive case
    draw(n - 1);
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    draw(size);
  }
}
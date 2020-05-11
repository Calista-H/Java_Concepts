import java.util.*;
public class triangle_stars {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < row + 1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
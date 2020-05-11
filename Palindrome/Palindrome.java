import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int length = word.length();
    boolean palindrome = false;
    for (int i = 0; i < length; i++) {
      if (word.charAt(i) == word.charAt(length - i - 1)) {
        palindrome = true;
      }
      else {
        palindrome = false;
      }
    }
    if (palindrome == true) {
      System.out.println("Palindrome!");
    }
    else {
      System.out.println("not palindrome");
    }
  }
}
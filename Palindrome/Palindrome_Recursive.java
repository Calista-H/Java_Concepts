import java.util.*;
public class Palindrome_Recursive {
  static boolean palindrome (String word) {
    // base cases
    if (word.length() == 1) {
      return true;
    }
    if (word.length() == 2) {
      if (word.charAt(0) == word.charAt(1)) {
        return true;
      }
      else {
        return false;
      }
    }
    
    // recursive case
    if (word.charAt(0) != word.charAt(word.length() - 1)) {
      return false;
    }
    return palindrome(word.substring(1, word.length() - 1));
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    if (palindrome(word) == true) {
      System.out.println("Palindrome!");
    }
    else {
      System.out.println("not palindrome");
    }
  }
}
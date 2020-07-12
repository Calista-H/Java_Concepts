import java.util.*;
public class consonant_count_recursive {
  static boolean Consonant(char c) {
    if (c != 'a' && c != 'A'
        && c != 'e' && c != 'E' 
        && c != 'i' && c != 'I'
        && c != 'o' && c != 'O'
        && c != 'u' && c != 'U') {
      return true;
    }
    return false;
  }
  static int consonant_count(String s) {
    // base case
    if (s.length() == 1) {
      if (Consonant(s.charAt(0)) == true) {
        return 1;
      } else {
        return 0;
      }
    } else {
      // recursive case
      if (Consonant(s.charAt(0)) == true) {
        return 1 + consonant_count(s.substring(1, s.length()));
      } else {
        return consonant_count(s.substring(1, s.length()));
      }
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    System.out.println(consonant_count(line) + " consonants!");
  }
}

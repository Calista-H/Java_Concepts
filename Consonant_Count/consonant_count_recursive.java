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
    int counter = 0;
    // base case
    if (s.length() == 1) {
      if (Consonant(s.charAt(0)) == true) {
        counter++;
      }
    }
      // recursive case
      if (Consonant(s.charAt(0)) == true) {
        counter++;
      }
      else {
        return consonant_count(s.substring(1, s.length() - 1));
      }
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int counter = 0;
    System.out.println(consonant_count(line) + " consonants!")
  }
}

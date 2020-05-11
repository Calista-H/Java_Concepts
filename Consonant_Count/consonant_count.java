import java.util.*;
public class consonant_count {
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
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();
    int counter = 0;
    for (int i = 0; i < line.length(); i++) {
      if (Consonant(line.charAt(i)) == true)
        counter++;
    }
    System.out.println(counter + " consonants!");
  }
}

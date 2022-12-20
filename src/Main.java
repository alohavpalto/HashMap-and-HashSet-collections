import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

  protected static String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

  public static void main(String[] args) {
    Map<Character, Integer> textOften = new HashMap<>();

    for (int i = 0; i < TEXT.length(); i++) {
      Character c = TEXT.charAt(i);
      if (Character.isLetter(c)) {
        if (textOften.containsKey(c)) {
          textOften.put(c, textOften.get(c) + 1);
        } else {
          textOften.put(c, 1);
        }
      }
    }
    System.out.println(
        "Самая часто встречающаяся буква - " + "\"" + Collections.max(textOften.entrySet(),
            Comparator.comparingInt(Map.Entry::getValue)).getKey() + "\"" + ", она встречается "
            + Collections.max(textOften.values()) + " раз(а).");
    System.out.println(
        "Наименее встречающаяся буква - " + "\"" + Collections.min(textOften.entrySet(),
            Comparator.comparingInt(Map.Entry::getValue)).getKey() + "\"" + ", она встречается "
            + Collections.min(textOften.values()) + " раз(а).");
  }
}
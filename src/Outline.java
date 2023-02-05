import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1, 7, 3, 4, 8, 2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    question1();
    question2();
  };


  public static void question1() {
      String[] stringArray = {"elephant", "dog", "cat", "elephant", "zebra", "horse", "tiger"};
      //System.out.println(Arrays.asList(stringArray));

      // Sort by length
      //Arrays.sort(stringArray, Comparator.comparingInt(String::length));
      //System.out.println(Arrays.toString(stringArray));

      // Sort by length (lambda)
      Arrays.sort(stringArray, (String s1, String s2) -> s1.length() - s2.length());
      System.out.println("1");
      System.out.println(Arrays.toString(stringArray));

      // Sort by reverse length
      Arrays.sort(stringArray, Comparator.comparingInt(String::length).reversed());
      System.out.println("2");
      System.out.println(Arrays.toString(stringArray));

      // Sort by reverse length (lambda)
      Arrays.sort(stringArray, (String s1, String s2) -> s2.length() - s1.length());
      System.out.println("2");
      System.out.println(Arrays.toString(stringArray));

      // Sort by first character
      Arrays.sort(stringArray, Comparator.comparingInt(Outline::firstLetter));
      System.out.println("3");
      System.out.println(Arrays.toString(stringArray));

      // Sort by first character (lambda)
      Arrays.sort(stringArray, (String s1, String s2) -> s1.charAt(0) - s2.charAt(0));
      System.out.println("3");
      System.out.println(Arrays.toString(stringArray));

      // Sort by containing 'e'
      Arrays.sort(stringArray, Comparator.comparingInt(Outline::containsLetter));
      System.out.println("4");
      System.out.println(Arrays.toString(stringArray));

      // Sort by containing 'e'
      Arrays.sort(stringArray, (String s1, String s2) ->
      {if (s1.contains("e") && !s2.contains("e")) return -1;
        if (s2.contains("e") && !s1.contains("e")) return 1;
        return 0;});
      System.out.println("4");
      System.out.println(Arrays.toString(stringArray));
    }

    public static void question2(){

  }

  private static int firstLetter(String s) {
    return s.charAt(0);
  };

  private static int containsLetter(String l) {
    if (l.contains("e")) {
      return 0;
    } else {
      return 1;
    }
  } 
}

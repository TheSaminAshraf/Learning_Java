// Review

// We have learned:
// Creating arrays explicitly, using { and }.
// Accessing an index of an array using [ and ].
// Creating empty arrays of a certain size, and filling the indices one by one.
// Getting the length of an array using length.
// Using the argument array args that is passed into the main() method of a class.
package FreeCourse_LearnJava.Arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      String[] students = {"Sade", "Alexus", "Sam", "Koma"};
      int[] mathScores = new int[4];
      mathScores[0] = 64;
      mathScores[1] = 57;
      mathScores[2] = 76;
      mathScores[3] = 98;
      System.out.println(students[0] + ": " + mathScores[0]);
      System.out.println(students[1] + ": " + mathScores[1]);
      System.out.println(students[2] + ": " + mathScores[2]);
      System.out.println(students[3] + ": " + mathScores[3]);
  }
}
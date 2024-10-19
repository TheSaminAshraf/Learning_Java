// break and continue

// If we ever want to exit a loop before it finishes all its iterations or want to skip one
// of the iterations, we can use the break and continue keywords.
// The break keyword is used to exit, or break, a loop.
// Once break is executed, the loop will stop iterating.
// The continue keyword can be placed inside of a loop if we want to skip an iteration.
// If continue is executed, the current loop iteration will immediately end, and the next iteration will begin.
// Loops can exist all throughout our code - including inside a method.
// If the return keyword was executed inside a loop contained in a method, then the loop iteration would be stopped and
// the method/constructor would be exited.
package FreeCourse_LearnJava.Loops;
public class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // Add your code below
      if (i == 0) {
        continue;
      }
      if (i % 5 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
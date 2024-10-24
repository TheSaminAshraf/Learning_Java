// Print Statements

package FreeCourse_LearnJava.Basics;
public class HelloYou {
  public static void main(String[] args) {
    // This is a print statement.
    // Print statements output information to the output terminal.
    // System is a built-in Java class that contains useful tools.
    // "out" is short for "output" and "println" is short for "print line".
    // Using "println" prints each statement on a new line.
    // The two statements below will print two separate lines.
    System.out.println("Hello Samin!");
    System.out.println("This is a new line.");
    // We can also output information using "print".
    // Using "print" prints statements one after the other without creating a new line.
    // The two statements below will appear on the same line.
    System.out.print("Hello");
    System.out.print("Samin!");
    // Following the above two statements, using either "print" or "println" will print on the same line.
    // This is because the "cursor" has not moved to a new line.
    // Using "println" moves the cursor to the next line after a statement or string is printed.
  }
}

/*
public class HideAndSeek {
  public static void main(String[] args) {
    System.out.println("Let's play hide and seek.");
    System.out.print("Three...");
    System.out.print("Two...");
    System.out.println("One...");
    System.out.println("Ready or not, here I come!");
  }
}
*/
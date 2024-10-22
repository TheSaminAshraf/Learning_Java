// Run-time Errors
// If our program has no compile-time errors, it’ll run.
// Errors which happen during program execution (run-time) after successful compilation are called run-time errors.
// Run-time errors occur when a program with no compile-time errors asks the computer to do
// something that the computer is unable to reliably do.
// Some common run-time errors:
// Division by zero also known as division error
// Trying to open a file that doesn’t exist
// There is no way for the compiler to know about these kinds of errors when the program is compiled.

// Exceptions
// Java uses exceptions to handle errors and other exceptional events.
// Exceptions are the conditions that occur at runtime and may cause the termination of the program.
// When an exception occurs, Java displays a message that includes the name of the exception, the line of 
// the program where the exception occurred, and a stack trace.
// The stack trace includes the following:
// The method that was running
// The method that invoked it
// The method that invoked that one
// and so on…
// Some common exceptions:
// ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
// NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
// ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array
// (i.e., array.length-1).
// FileNotFoundException: Java didn’t find the file it was looking for.

// Exception Handling
// Exception handling is an essential feature of Java programming that allows us to use
// run-time error exceptions to make our debugging process a little easier.
// One way to handle exceptions is using the try/catch:
// The try statement allows you to define a block of code to be tested for errors while it is being executed.
// The catch statement allows you to define a block of code to be executed if an error occurs in the try block.
// The try and catch keywords come in pairs, though you can also catch several types of exceptions in a single block.
// System.err.println() will print to the standard error and the text will be in red.
// Learn more about exceptions and handling them here: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html

// Logic Errors
// The types of errors, which provide incorrect output, but appear to be error-free, are called logic errors.
// Logic errors occur when there is a design flaw in your program.
// These are some of the most common errors that happen to beginners and also usually the most difficult to find and eliminate.
// Some common logic errors:
// Program logic is flawed
// Some “silly” mistake in an if statement or a for/while loop
// Note: Logic errors don’t have error messages.
// Sometimes, programmers use a process called test-driven development (TDD), a way to give logic errors error messages.
package FreeCourse_LearnJava.Debugging;
public class Main{
  public static void main(String[] args) {
    int width = 20;
    int length = 40;
    int ratio = length / width;
    System.out.println(ratio);

    int[] numbers = {1, 2, 3, 4, 5};
    int lastNumber = numbers[4];
    System.out.println("The value of the last element is: " + lastNumber);

    int width1 = 0;
    int length1 = 40;
    try {
      int ratio1 = length1 / width1;
    } catch (ArithmeticException e) {
      System.err.println("ArithmeticException: " + e.getMessage());
    }

    int steps = 10;
    for (int i = 1; i <= steps; i++) {
      System.out.println("Step #" + i);
    }
  }
}
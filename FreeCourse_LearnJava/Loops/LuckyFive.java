// Introduction to Loops
// Repeating code introduces two problems:
// Writing the same code over and over is time-consuming.
// Having less code means having less to debug.
// In Java, we can use loops to perform repetitive tasks.
// A loop is a programming tool that allows developers to repeat the same block of code until some condition is met.
// First, a starting condition is evaluated.
// If the starting condition is true, then the loop body is executed.
// When the last line of the loop body is executed, the condition is re-evaluated.
// This process continues until the condition is false
// (if the condition never becomes false, we can actually end up with an infinite loop!).
// If the starting condition is false, the loop never gets executed.
// We employ loops to easily scale programs - saving time and minimizing mistakes.
// Three types of loops to learn: while loops, for loops and for-each loops.

// While We're Here
// A while loop looks a bit like an if statement:
// while (condition) {//code here runs while condition is true}
// Like an if statement, the code inside a while loop will only run if the condition is true.
// However, a while loop will continue running the code over and over until the condition evaluates to false.
// while loops are extremely useful when you want to run some code until a specific change happens.
// Infinite loops occur when the condition will never evaluate to false.
// This can cause your entire program to crash.
package FreeCourse_LearnJava.Loops;
// Importing the Random library
import java.util.Random;

public class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while (dieRoll != 5)  {
      System.out.println(dieRoll);
      dieRoll = randomGenerator.nextInt(6) + 1;
    }
    
  }
  
}
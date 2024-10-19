// Incrementing While Loops
// When looping through code, it’s common to use a counter variable.
// A counter (also known as an iterator) is a variable used in the conditional logic of the loop
// and (usually) incremented in value during each iteration through the code.

// For Loops
// A for loop header is made up of the following three parts, each separated by a semicolon:
// The initialization of the loop control variable (iterator).
// A boolean expression.
// And, an increment or decrement statement.
// for (int iteratorName = 0; iteratorName < 10, iteratorName++)    {//code here runs as long as the iterator is less than 10}
// In a for loop, an initialization statement is run once in order to initialize the loop control variable.
// This variable. modified in every iteration, can be referenced in the loop body, and used to test the boolean condition.
// We’ll also hear the term “iteration” in reference to loops.
// When we iterate, it just means that we are repeating the same block of code.

// Using For Loops
// Even though we can write while loops that accomplish the same task,
// for loops are useful because they help us remember to increment our counter — something that is easy to forget
// when we increment with a while loop.
// Note: if we don’t create the correct for loop header, we can cause the iteration to loop one too many or one too few times;
// this occurrence is known as an “off by one” error.
// These errors can be tricky because, while they do not always produce an error in the terminal,
// they can cause some miscalculations in our code.
// These are called logical errors — the code runs fine, but it didn’t do what you expected it to do.
package FreeCourse_LearnJava.Loops;
public class Coffee {
  
  public static void main(String[] args) {
    
    // initialize cupsOfCoffee
    int cupsOfCoffee = 1;

    // add while loop with counter
    while (cupsOfCoffee <= 100) {
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
      cupsOfCoffee++;
    }

    for (cupsOfCoffee = 1; cupsOfCoffee <= 100; cupsOfCoffee++) {

      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);

    }
    
  }
        
}
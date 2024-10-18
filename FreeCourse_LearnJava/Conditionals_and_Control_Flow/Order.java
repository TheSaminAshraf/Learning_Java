// Introduction to Control Flow
// We represent decision-making in our program using conditional or control flow statements.
// Before this point, our code runs line-by-line from the top down.
// However, conditional statements allow us to be selective in which portions will run.
// Conditional statements check a boolean condition and run a block of code depending on the condition.
// Curly braces mark the scope of a conditional block similar to a method or class.
// This code is also called if-then statements: “If (condition) is true, then do something”.

// If-Then Statement
// The if-then statement is the most simple control flow we can write.
// It tests an expression for truth and executes some code based on it.
// The if keyword marks the beginning of the conditional statement, followed by parentheses ().
// The parentheses hold a boolean datatype.
// For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.
// The boolean condition is followed by opening and closing curly braces that mark a block of code.
// This block runs if, and only if, the boolean is true.
// If a conditional is brief we can omit the curly braces entirely.
// Note: Conditional statements do not end in a semicolon.

// If-Then-Else
// We create an alternate condition branch using the else keyword.
// This conditional statement ensures that exactly one code block will be run.
// The first block runs if the condition evaluates to true, the second block runs if the condition evaluates to false.
// This code is also called an if-then-else statement:
// If condition is true, then do something.
// Else, do a different thing.

// If-Then-Else-If
// The conditional structure we’ve learned can be chained together to check as many conditions as are required by our program.
// The first condition to evaluate to true will have that code block run.
// Note: Only one of the code blocks will run.

// Nested Conditional Statements
// We can create more complex conditional structures by creating nested conditional statements. 
// This is created by placing conditional statements inside other conditional statements.
// When we implement nested conditional statements, the outer statement is evaluated first.
// If the outer condition is true, then the inner, nested statement is evaluated.

// Switch Statement
// An alternative to chaining if-then-else conditions together is to use the switch statement.
// This conditional will check a given value against any number of conditions and run the code block where there is a match.
// Switch blocks are different than other code blocks because they are not marked by curly braces
// and we use the break keyword to exit the switch statement.
// Without break, code below the matching case label is run, including code under other case labels,
// which is rarely the desired behavior.

// Review
// Before this lesson, our code executed from top to bottom, line by line.
// Conditional statements add branching paths to our programs.
// We use conditionals to make decisions in the program so that different inputs will produce different results. 
// Conditionals have the general structure:

/*
if (condition) {
  // consequent path
} else {
  // alternative path
}
*/

// Specific conditional statements have the following behavior:
// if-then: code block runs if condition is true
// if-then-else: one block runs if conditions is true and another block runs if condition is false
// if-then-else chained: same as if-then but an arbitrary number of conditions
// switch: switch block runs if condition value matches case value
package FreeCourse_LearnJava.Conditionals_and_Control_Flow;
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost;
    //if (shipping.equals("Regular")) {
    //  return 0;
    //} else if (shipping.equals("Express")) {
    //  // Add your code here
    //  if (couponCode == "ship50") {
    //    return 0.85;
    //  } else  {
    //    return 1.75;
    //  }
    //} else {
    //  return .50;
    //}
	 	// declare switch statement here
    switch (shipping) {
      case "Regular":
      shippingCost = 0;
      break;
      case "Express":
      shippingCost = 1.75;
      break;
      default:
      shippingCost = 0.50;
    }
    return shippingCost;
 	}
  public static void main(String[] args) {
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    if (itemCost > 24.00) {
      System.out.println("High value item!");
    }

    boolean isFilled = false;
    
    // Write an if-then-else statement:
    if (isFilled) {
      System.out.println("Shipping");
    } else  {
      System.out.println("Order not ready");
    }
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
    
}
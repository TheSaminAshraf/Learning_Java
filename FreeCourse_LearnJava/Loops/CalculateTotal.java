// Iterating over Arrays and ArrayLists

// One common pattern we’ll encounter as a programmer is traversing, or looping, through a list of data and
// doing something with each item.
// In Java, that list would be an array or ArrayList and the loop could be a for loop.
// In order to traverse an array or ArrayList using a loop, we must find a way to access each element via its index.
// We may recall that for loops are created with a counter variable.
// We can use that counter to track the index of the current element as we iterate over the list of data.
// Because the first index in an array or ArrayList is 0, the counter would begin with a value of 0 and
// increment until the end of the list.
// So we can increment through the array or ArrayList using its indices.
// We can also use while loops to traverse through arrays and ArrayLists.
// If we use a while loop, we need to create our own counter variable to access individual elements.
// We’ll also set our condition to continue looping until our counter variable equals the list length.
package FreeCourse_LearnJava.Loops;
import java.util.ArrayList;

public class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses
    for (int i = 0; i < expenses.size(); i++) {
      total += expenses.get(i);
    }
    
    System.out.println(total);
    
  }
  
}
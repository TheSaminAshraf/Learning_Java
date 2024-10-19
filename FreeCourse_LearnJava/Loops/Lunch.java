// Removing Elements During Traversal
// If we want to remove elements from an ArrayList while traversing through one, we can easily run into an error if we aren’t careful.
// When an element is removed from an ArrayList, all the items that appear after the removed element will have
// their index value shift by negative one — it’s like all elements shifted to the left.
// We’ll have to be very careful with how we use our counter variable to avoid skipping elements.
// When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s
// counter whenever we remove an element.
// We don’t need to increase the counter because all of the other elements have now shifted to the left.
// For example, if we removed the element at index 3, then the element that was at index 4 will be moved to index 3.
// If we increase our counter to 4, we’ll skip that element.
// When using a for loop, we, unfortunately, must increase our loop control variable — the loop control variable
// will always change when we reach the end of the loop (and it will usually change by 1 because we often use something like i++).
// Since we can’t avoid increasing our loop control variable, we can take matters into our own hands and
// decrease the loop control variable whenever we remove an item.
// Note: Avoid manipulating the size of an ArrayList when using an enhanced for loop.
// Actions like adding or removing elements from an ArrayList when using a for each loop can cause a
// ConcurrentModificationException error.

// Review
// while loops: These are useful to repeat a code block an unknown number of times until some condition is met.
// for loops: These are ideal for when you are incrementing or decrementing with a counter variable.
// For-each loops: These make it simple to do something with each item in a list.
package FreeCourse_LearnJava.Loops;
import java.util.ArrayList;

public class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
    int i = 0;
    while (i < lunchBox.size()) {
      if  (lunchBox.get(i) == "ant")  {
        lunchBox.remove(i);
      } else  {
        i++;
      }
    }
    return lunchBox;
  }
 
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }

}
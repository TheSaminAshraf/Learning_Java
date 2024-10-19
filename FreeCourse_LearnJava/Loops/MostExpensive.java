// For-Each Loops

// For-each loops, which are also referred to as enhanced loops, allow us to directly loop through each item in a
// list of items (like an array or ArrayList) and perform some action with each item.
// for  (int x : listOfInts)    {}
// Our enhanced loop contains two items: an enhanced for loop variable (x) and a list to traverse through (listOfInts).
// If we try to assign a new value to the enhanced for loop variable, the value stored in the array or ArrayList will not change.
// This is because, for every iteration in the enhanced loop, the loop variable is assigned a copy of the list element.
// Note: We can name the enhanced for loop variable whatever we want; using the singular of a plural is just a convention.
// We may also encounter conventions like String word : sentence.
package FreeCourse_LearnJava.Loops;
import java.util.ArrayList;

public class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    for (double expense : expenses) {
      if (expense > mostExpensive)  {
        mostExpensive = expense;
      }
    }
    
    System.out.println(mostExpensive);
    
  }
  
}
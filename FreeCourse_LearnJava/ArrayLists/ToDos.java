// Introduction
// Arrays in Java have a fixed size.
// We cannot add or remove elements from arrays.
// To create mutable and dynamic lists, we can use Java’s ArrayList class.
// ArrayList allows us to:
// Store object references as elements.
// Store elements of the same type (just like arrays).
// Access elements by index (just like arrays).
// Add and remove elements.
// To use an ArrayList at all, we need to import them from Java’s util package as well: import java.util.ArrayList;

// Creating ArrayLists
// To create an ArrayList, we need to declare the type of objects it will hold, just as we do with arrays:
// ArrayList<dataType> arrayListName;
// ArrayList<String> studentNames;
// We use angle brackets < and > to declare the type of the ArrayList.
// These symbols are used for generics.
// Generics are a Java construct that allows us to define classes and objects as parameters of an ArrayList.
// For this reason, we can’t use primitive types in an ArrayList.
// ArrayList<int> ages;             // This code will not compile.
// ArrayList<Integer> ages;         // This code will compile.
// The <Integer> generic has to be used in an ArrayList instead.
// You can also use <Double> and <Character> for types you would normally declare as doubles or chars.
// We can initialize to an empty ArrayList using the new keyword:
// ArrayList<genericDataType> arrayListName = new ArrayList<sameGenericDataType>();
// ArrayList<String> studentNames = new ArrayList<String>();

// Adding an Item
// ArrayList comes with an add() method which inserts an element into the structure.
// There are two ways we can use add().
// If we want to add an element to the end of the ArrayList, we’ll call add() using only one argument
// that represents the value we are inserting.
// If we want to add an element at a specific index of our ArrayList, we’ll need two arguments
// in our method call: the first argument will define the index of the new element while the second argument
// defines the value of the new element.
// By inserting a value at a specified index, any elements that appear after this new element
// will have their index value shift over by 1.
// Note: an error will occur if we try to insert a value at an index that does not exist.
// When using ArrayList methods (like add()), the reference parameters and return type of a method
// must match the declared element type of the ArrayList.
// For example, we cannot add an Integer type value to an ArrayList of String elements.
// Tt is possible to create an ArrayList that holds values of different types.
// ArrayList assortment = new ArrayList<>();
// In this case, the items stored in this ArrayList will be considered Objects.
// As a result, they won’t have access to some of their methods without doing some fancy casting.
// Although this type of ArrayList is allowed, using an ArrayList that specifies its type is preferred.

// ArrayList Size
// We can find the size of arraylist using the size() method: System.out.println(arrayListName.size());

// Accessing an Index
// With arrays, we can use bracket notation to access a value at a particular index.
// For ArrayLists, bracket notation won’t work.
// Instead, we use the method get() to access an index.

// Changing a Value
// When we were using arrays, we could rewrite entries by using bracket notation to reassign values.
// ArrayList has a slightly different way of doing this, using the set() method.

// Removing an Item
// To remove an item from an array, we would have to make a completely new array without the value.
// ArrayLists allow us to remove an item by specifying the index to remove using the remove() method.
// We can also remove an item by specifying the value to remove.
// Note: The above command removes the FIRST instance of the value specified.

// Getting an Item's Index
// We can know the position of a certain element in an arraylist using the method indexOf().

// Review
// Learnt the following:
// Creating an ArrayList.
// Adding a new ArrayList item using add() method.
// Accessing the size of an ArrayList using the size() method.
// Finding an item by index using the get() method.
// Changing the value of an ArrayList item using the set() method.
// Removing an item with a specific value using the remove() method.
// Retrieving the index of an item with a specific value using indexOf().
package FreeCourse_LearnJava.ArrayLists;
import java.util.ArrayList;
public class ToDos {

  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Remove each to-do below:
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);
    sherlocksToDos.remove("play violin");
      
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());

    System.out.println(sherlocksToDos.indexOf("solve the case"));
  }

}
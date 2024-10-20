// concat()

// The concat() method concatenates one string to the end of another string.
// Concatenation is the operation of joining two strings together.
// Suppose we have a String called str1 and another String called str2.
// Using str1.concat(str2) would return str1 with str2 appended to the end of it.
// Strings are immutable objects which means that String methods, like concat() do not actually change a String object.
package FreeCourse_LearnJava.String_Methods;
public class CombineNames {
  
	public static void main(String[] args) {
    
    // Add your first names:
    String firstName = "Naomi";  
    String lastName = "Rahman";

    // What's the full name?
    System.out.println(firstName.concat(" " + lastName));
    
  }
  
}
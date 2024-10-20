// equals()

// With objects, such as Strings, we can’t use the primitive equality operator == to check for equality between two strings.
// To test equality with strings, we use a built-in method called equals().
// Side note, there’s also an equalsIgnoreCase() method that compares two strings without considering upper/lower cases.
// We can also compare String values lexicographically (think dictionary order) using the .compareTo() method.
// When we call the .compareTo() method, each character in the String is converted to Unicode;
// then the Unicode character from each String is compared.
// The method will return an int that represents the difference between the two Strings.
// When we use .compareTo(), we must pay attention to the return value:
// If the method returns 0, the two Strings are equal.
// If the value is less than 0, then the String object is lexicographically less than the String object argument.
// If the value is greater than 0, then the String object is lexicographically greater than the String object argument.
// Note: Make sure to pay attention to capitalization when using .compareTo().
// Upper case and lower case letters have different Unicode values.
// Using .compareToIgnoreCase() will perform the same task, but will not consider upper/lower case.
package FreeCourse_LearnJava.String_Methods;
public class Password {
  
  public static void main(String[] args) {
    
    String password = "password";
    
    // Write the code:
    System.out.println(password.equals("password123"));
    
  }
    
}
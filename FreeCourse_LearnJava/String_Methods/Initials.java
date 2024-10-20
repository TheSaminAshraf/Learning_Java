// charAt()

// The charAt() method returns the character located at a String‘s specified index.
// If we try to access or get a character at an out-of-range index, we will get an IndexOutOfBoundsException error.
// java.lang.StringIndexOutOfBoundsException
package FreeCourse_LearnJava.String_Methods;
public class Initials {
  
	public static void main(String[] args) {
    
    // Add a first name and a last name:
    String firstName = "Naomi";  
    String lastName = "Rahman";
    
    // What are the initials?
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));
  }
  
}
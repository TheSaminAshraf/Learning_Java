// String

// Primitive data types are data types with no built-in behavior.
// Booleans, Chars, Ints and Doubles are primitive data types.
// A string is not a primitive data type, it is an object and has built-in behaviors like all other objects.
// Strings hold sequences of characters.
// There are two ways to create a String object: using a String literal or calling the String class to create a new String object.
// A String literal is any sequence of characters enclosed in double-quotes ("").
// Like primitive-type variables, we declare a String variable by specifying the type first.
// We could also create a new String object by calling the String class when declaring a String.
// Escape sequences (escape sequences begin with the backslash character (\)): 
// \t - Inserts a tab
// \n - Inserts a newline (moves the cursor to the next line)
// \r - Carriage return (moves the cursor to the beginning of the line)
// \b - Inserts a backspace (moves the cursor one character to the left)
// \f - Inserts a form feed (moves to next page)
// \' - Inserts a single quote
// \" - Inserts a double quote
// \\ - Inserts a backslash
package FreeCourse_LearnJava.Variables;
public class Song {
	public static void main(String[] args) {   
                String openingLyrics = "Yesterday, all my troubles seemed so far away";
                // Same as:
                // String openingLyrics = new String("Yesterday, all my troubles seemed so far away");
                // The above statement or method calls the String class to create a new String object.
                System.out.println(openingLyrics);
	}
}
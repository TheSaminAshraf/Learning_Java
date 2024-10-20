// substring()

// There may be times when we only want a part of a string. In such cases, we may want to extract a substring from a string.
// The substring() method does exactly that.
// System.out.println(stringName.substring(4));      // Prints the substring starting from index 4 till the end of the string.
// In the above example, the index 4 is inclusive, meaning, the substring produced includes the character at index 4.
// Suppose we want a substring from the middle of the string.
// We can instead include two arguments in this method.
// System.out.println(stringName.substring(27, 33));
// When substring() is called with two arguments, the first argument is inclusive and the second is exclusive.
// This means the resulting substring will begin at index 27 and extend up to, but not including, index 33.
// We can use this method to return a single-element substring at a specific index.
// We do this by calling substring() with the desired index value as the first argument and
// then the index value plus one as the second argument.
package FreeCourse_LearnJava.String_Methods;
public class Poetry {
  
	public static void main(String[] args) {
      
    String line = "The Heav'ns and all the Constellations rung";     
    // Change the arguments:
    System.out.println(line.substring(4, 11));
    
  }
  
}
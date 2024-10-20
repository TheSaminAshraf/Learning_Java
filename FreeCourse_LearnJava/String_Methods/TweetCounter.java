// Introduction to String Methods
// In Java, a String is an object that represents a sequence of characters.
// We don’t have to import anything to use the String class because it’s part of the java.lang package which is available by default.
// We will go over several String methods:
//length()
//concat()
//equals()
//indexOf()
//charAt()
//substring()
//toUpperCase() / toLowerCase()

// length()
// In Java, the length() string method returns the length ⁠— total number of characters ⁠— of a String.
// stringName.length();     // Returns the length of the string
// In theory, the length of a String is the same as the Unicode units of the String.
// For example, escape sequences such as \n count as only one character.
package FreeCourse_LearnJava.String_Methods;
public class TweetCounter {
  
	public static void main(String[] args) {
    
    String tweet = "Liz Lemon, ninjas are kind of cool... I just don't know any personally. Get on that.";  

    // What's the character count?
    System.out.println(tweet.length());
    
  }
  
}
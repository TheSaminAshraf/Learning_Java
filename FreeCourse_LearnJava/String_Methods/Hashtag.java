// toUpperCase() / toLowerCase()
// toUpperCase(): returns the string value converted to uppercase.
// toLowerCase(): returns the string value converted to lowercase.
// A good use of this functionality is to ensure consistency of the data you store in a database.
// Making sure all of the data you get from a user is lowercase before you store it in your database
// will make your database easier to search through later.

// Review
// Some of the string methods that come with the String class:
// length()
// concat()
// indexOf()
// charAt()
// equals() / equalsIgnoreCase()
// substring()
// toUpperCase() / toLowerCase()
package FreeCourse_LearnJava.String_Methods;
public class Hashtag {
  
  public static void main(String[] args) {
    
    String hashtag = "#100DaysOfCode";
    
    // Make the hashtag lowercase:
    System.out.println(hashtag.toLowerCase());
    
  }
    
}
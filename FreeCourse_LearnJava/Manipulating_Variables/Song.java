// equals()

// To test equality with objects, we use a built-in method called .equals().
// When comparing objects, make sure to always use .equals().
package FreeCourse_LearnJava.Manipulating_Variables;
public class Song {
  public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    System.out.println(line1.equals(line2));
    System.out.println(line2.equals(line3));
  }       
}
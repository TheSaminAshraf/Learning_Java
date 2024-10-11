// String Concatenation

// The addition operator (+) can be used to concatenate Strings or add two Strings together.
// We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first.
// 
package FreeCourse_LearnJava.Manipulating_Variables;
public class Zoo {
  public static void main(String[] args){
    int animals = 12;
    String species = "zebra";
    String zooDescription = "Our zoo has " + animals + " " + species + "s!";
    System.out.println(zooDescription);
  }       
}
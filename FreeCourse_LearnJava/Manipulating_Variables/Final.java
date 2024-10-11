// final Keyword

// To declare a variable with a value that cannot be manipulated, we need to use the final keyword.
// To use the final keyword, prepend final to a variable declaration, such as:
// final int yearBorn = 2002;
// When we declare a variable using final, the value cannot be changed; any attempts at doing so will cause an error to occur.
package FreeCourse_LearnJava.Manipulating_Variables;
public class Final {
	public static void main(String[] args) { 
        final double pi = 3.14;
        System.out.println(pi);
        // pi++;
        // The above expression gives the following error error when uncommented.
        // cannot assign a value to final variable pi
	}
}
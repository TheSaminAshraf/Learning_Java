// Greater Than and Less Than

// Java has relational operators for numeric datatype that make boolean comparisons.
// These include less than (<) and greater than (>).
package FreeCourse_LearnJava.Manipulating_Variables;
public class GreaterLessThan {
	public static void main(String[] args) {   
	    double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}
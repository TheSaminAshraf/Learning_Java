// Compound Assignment Operators

// Compound assignment operators perform an arithmetic operation on a variable and then reassigns its value.
// Compound assignment operators:
// Addition (+=), Subtraction (-=), Multiplication (*=), Division (/=) and Modulo (%=).
package FreeCourse_LearnJava.Manipulating_Variables;
public class BakeSale {
	public static void main(String[] args) {   
	    int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;
        System.out.println(numCookies);
	}
}
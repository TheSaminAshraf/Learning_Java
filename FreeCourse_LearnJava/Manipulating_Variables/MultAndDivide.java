// Multiplication and Division

// The multiplication operator (*) multiplies two values.
// The division operator (/) performs integer division.
// The value obtained is an int, for example:
// 10 / 5 = 2 and 10 / 4 = 2 as well although we expect 2.5.
// Int values are not rounded, but floored.
// Dividing any number by 0 gives an "ArithmeticException" error.
package FreeCourse_LearnJava.Manipulating_Variables;
public class MultAndDivide {
	public static void main(String[] args) {   
	    double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + subtotal * tax;
        System.out.println(total);
        double perPerson = total / 4;
        System.out.println(perPerson);
	}
}
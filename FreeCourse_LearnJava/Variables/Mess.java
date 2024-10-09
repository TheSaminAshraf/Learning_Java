// Static Checking

// Java has static typing (unlike Python which has dynamic typing).
// Java programs will not compile if a variable is assigned a value of an incorrect type.
// This is a bug, specifically a type declaration bug.
// When bugs are not caught at compilation, they interrupt execution of the code by causing runtime errors. 
// The program will crash.
// Java’s static typing helps programmers avoid runtime errors, and thus have much safer code that is free from bugs.
package FreeCourse_LearnJava.Variables;
public class Mess {
	public static void main(String[] args) {   
	    int year = 2001;
        String title = "Shrek";
        char genre = 'C';
        double runtime = 1.58;
        boolean isPG = true;
	}
}
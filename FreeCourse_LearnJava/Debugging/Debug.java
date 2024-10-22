// Introduction to Bugs
// In Java, there are many different ways of classifying errors, but they can be boiled down to three categories:
// Syntax errors: Errors found by the compiler.
// Run-time errors: Errors that occur when the program is running.
// Logic errors: Errors found by the programmer looking for the causes of erroneous results.

// Syntax Errors
// When we are writing Java programs, the compiler is our first line of defense against errors.
// It can catch syntax errors.
// Syntax errors represent grammar errors in the use of the programming language.
// They are the easiest to find and correct.
// The compiler will tell you where it got into trouble, and its best guess as to what you did wrong.
// Some common syntax errors are:
// Misspelled variable and method names
// Omitting semicolons ;
// Omitting closing parenthesis ), square bracket ], or curly brace }
// Usually the error is on the exact line indicated by the compiler, or the line just before it;
// however, if the problem is incorrectly nested braces, the actual error may be at the beginning of the nested block.
package FreeCourse_LearnJava.Debugging;
public class Debug {

  public static void main(String[] args) {
    
    System.out.println("       1");
    System.out.println("     2 3");
    System.out.println("   4 5 6");
    System.out.println("7 8 9 10");
    
  }
    
}
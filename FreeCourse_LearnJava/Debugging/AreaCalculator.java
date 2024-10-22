// Debugging Techniques
// 1. Divide and conquer: Comment out or temporarily delete half the code to isolate an issue.
// If the program compiles now, you know the error is in the code you deleted.
// Bring back about half of what you removed and repeat.
// If the program still doesn’t compile, the error must be in the code that remains.
// Delete about half of the remaining code and repeat.
// Tip: In most code editors, one can highlight a block of code and use the keyboard shortcut command + / to comment it out.
// 2. Print statements for the rescue: Use System.out.println() to check variable/return values
// at various points throughout the program.
// A lot of the time with logic errors, there was a flawed piece of logic, a miscalculation,
// a missing step, etc.
// By printing out the values at different stages of the execution flow, you can then hopefully pinpoint where you made a mistake.

// Review
// We have learnt:
// Syntax errors: Errors found by the compiler.
// Run-time errors: Errors found by checks in a running program.
// Logic errors: Errors found by the programmer looking for the causes of erroneous results.
// 
package FreeCourse_LearnJava.Debugging;
import java.util.*;

public class AreaCalculator {
  
	public static void main(String[] args) {
    
	  Scanner keyboard = new Scanner(System.in);
    
	  System.out.println("Shape Area Calculator");
	
	  while(true) {
    
	    System.out.println();
	    System.out.println("-=-=-=-=-=-=-=-=-=-");
	    System.out.println();
	    System.out.println("1) Triangle");
	    System.out.println("2) Rectangle");
	    System.out.println("3) Circle");
	    System.out.println("4) Quit");
      System.out.println();
      
	    System.out.print("Which shape: ");
	
      int shape = keyboard.nextInt();
	    System.out.println();
	
	    if (shape == 1) {
        System.out.print("Base: ");
		    int base = keyboard.nextInt();
	    	System.out.print("Height: ");
		    int height = keyboard.nextInt();
		    area_triangle(base, height);
	    } else if (shape == 2) {
        System.out.print("Length: ");
		    int length = keyboard.nextInt();
	      System.out.print("Width: ");
		    int width = keyboard.nextInt();
		    area_rectangle(length, width);
	    } else if (shape == 3) {
        System.out.print("Radius: ");
		    int radius = keyboard.nextInt();
	    	area_circle(radius);
	    } else if (shape == 4) {
		    quit();
		    break;
	    }
	  }
  }
	
  public static double area_triangle(int base, int height) {
		System.out.println();
		double A = (base * height) * 0.5;
		System.out.println("The area is " + A + ".");
    return A;
	}
	
  public static int area_rectangle(int length, int width){
		System.out.println();
		int A = length * width;
		System.out.println("The area is " + A + ".");
		return A;
	}
  
  public static double area_circle(int radius) {
		System.out.println();
		double A = Math.PI * radius * radius;
		System.out.println("The area is " + A + ".");
		return A;
	}
  
	public static String quit() {
		System.out.println("Good Bye");
		return null;
	}
}
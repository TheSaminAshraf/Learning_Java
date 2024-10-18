// Introduction to Conditional Operators
// Java includes operators that only use boolean values.
// These conditional operators help simplify expressions containing complex boolean relationships by
// reducing multiple boolean values to a single value: true or false.
// For running a code block only if MULTIPLE CONDITIONS are TRUE, we use the AND operator &&.
// For running a code block if at least ONE OF THE TWO conditions are TRUE, we use the OR operator ||.
// We can produce the opposite value, where true becomes false and false becomes true, with the NOT operator: !.

// Conditional-And: &&
// The AND operator, &&, is used between two boolean values and evaluates to a single boolean value.
// If the values on both sides are true, then the resulting value is true, otherwise the resulting value is false.

// Conditional-Or: ||
// The OR operator, ||, is used between two boolean values and evaluates to a single boolean value.
// If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.
// On some occasions, the compiler can determine the truth value of a logical expression by only evaluating the
// first boolean operand; this is known as short-circuited evaluation.
// Short-circuited evaluation only works with expressions that use && or ||.
// In an expression that uses ||, the resulting value will be true as long as one of the operands has a true value.
// If the first operand of an expression is true, we don’t need to see what the value of the other operand is
// to know that the final value will also be true.
// An expression that uses && will only result in true if both operands are true.
// If the first operand in the expression is false, the entire value will be false.

// Logical NOT: !
// The unary operator NOT, !, works on a single value.
// This operator evaluates to the opposite boolean to which it’s applied.
// NOT is useful for expressing our intent clearly in programs.
// For example, sometimes we need the opposite behavior of an if-then:
// run a code block only if the condition is false.

// Combining Conditional Operators
// We have the ability to expand our boolean expressions by using multiple conditional operators in a single expression.
// Order of evaluation:
// Conditions placed in parentheses - ()
// NOT - !
// AND - &&
// OR - ||

// Review
// Conditional operators work on boolean values to simplify our code.
// They’re often combined with conditional statements to consolidate the branching logic.
// Conditional-AND, &&, evaluates to true if the booleans on both sides are true.
// Conditional-OR, ||, evaluates to true if one or both of the booleans on either side is true.
// Logical-NOT, !, evaluates to the opposite boolean value to which it is applied.
package FreeCourse_LearnJava.Conditional_Operators;
public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      // Write conditional statement below
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
      restaurantCapacity = capacity;
      isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      /* 
         Write conditional
         ~~~~~~~~~~~~~~~~~
         if restaurantCapacity is greater
         or equal to guestCount
         AND
         the restaurant is open:
           print "Reservation confirmed"
           set isConfirmed to true
         else:
           print "Reservation denied"
           set isConfirmed to false
      */
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        isConfirmed = true;
      } else  {
        System.out.println("Reservation denied");
        isConfirmed = false;
      }
    }
    
    public void informUser() {
      // Write conditional here
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else  {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }
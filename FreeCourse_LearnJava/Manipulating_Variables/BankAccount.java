// Review

// Topics covered:
// Addition + and Subtraction -
// Multiplication * and Division /
// Modulo % for finding the remainder
// Compound assignment operators: +=, -=, *=, /= and %=
// Order of operation: Parentheses -> Exponents -> Multiplication / Division / Modulo -> Addition / Subtraction
// Greater than > and Less than <
// Equal to == and not equal to !=
// Greater than or equal to >= and less than or equal to <=
// equals() for comparing Strings and other objects
// Using + to concatenate Strings
// The final keyword which makes variables unchangeable
package FreeCourse_LearnJava.Manipulating_Variables;
public class BankAccount {
  public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 250;
    double updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance / 3;
    boolean canPurchaseTicket = amountForEachFriend >= 250;
    System.out.println(canPurchaseTicket);
    System.out.println("I gave each friend " + amountForEachFriend + "...");
  }       
}
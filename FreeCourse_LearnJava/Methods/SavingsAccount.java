// Introduction

// We will learn how to create object behavior using methods/functions.
// Methods are repeatable, modular blocks of code used to accomplish specific tasks.
// We have the ability to define our own methods that will take input, do something with it, and return the kind of output we want.
// Through method decomposition, we can use methods to break down a large problem into smaller, more manageable problems.
// Methods are also reusable.
// Procedural abstraction: knowing what a method does, but not how it accomplishes it.
package FreeCourse_LearnJava.Methods;
public class SavingsAccount {
  
  int balance;
    
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

}

/*
public class Main {
  public static void main(String[] args) {
    SavingsAccount savings = new SavingsAccount(2000);
      
    // Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);
      
    // Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew " + 300);
      
    // Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);
      
    // Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited " + 600);
      
    // Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);
      
    // Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited " + 600);
      
    // Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);
  }
}
*/
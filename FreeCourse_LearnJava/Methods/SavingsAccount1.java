// Review

// Methods are a powerful way to abstract tasks away and make them repeatable.
// They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to.
// Defining a method : Method declarations will declare a method’s return type, name, and parameters.
// Calling a method : Methods are invoked with a . and ().
// Parameters : Inputs to the method and their types are declared in parentheses in the method signature.
// Changing Instance Fields : Methods can be used to change the value of an instance field.
// Scope : Variables only exist within the domain that they are created in.
// Return: The type of the variables that will be output are declared in the method declaration.
package FreeCourse_LearnJava.Methods;
public class SavingsAccount1 {
  int balance;
  
  public SavingsAccount1(int initialBalance){
    balance = initialBalance;
  }
    
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }
    
  public void deposit(int amountToDeposit){
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }
    
  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
    }
    
  public String toString(){
    return "This is a savings account with " + balance + " saved.";
  }
           
}

/*
public class Main {
  public static void main(String[] args) {
    SavingsAccount savings = new SavingsAccount(2000);
        
    //Check balance:
    savings.checkBalance();
        
    //Withdrawing:
    savings.withdraw(300);
        
    //Check balance:
    savings.checkBalance();
        
    //Deposit:
    savings.deposit(600);
        
    //Check balance:
    savings.checkBalance();
        
    //Deposit:
    savings.deposit(600);
        
    //Check balance:
    savings.checkBalance();
        
    System.out.println(savings);
  }
}
*/
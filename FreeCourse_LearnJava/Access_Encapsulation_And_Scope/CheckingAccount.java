// What are Access and Scope
// To oversimplify things, the concepts of access and scope both center around what parts of your programs can
// interact with specific variables or methods from other parts of your program.
// A brief look at what we will cover:
// Access:
// The public and private keywords and how they relate to Classes, variables, constructors, and methods
// The concept of encapsulation
// Accessor methods, sometimes known as “getters”
// Mutator methods, sometimes known as “setters”
// Scope:
// Local variables vs. instance variables
// The this keyword

// The public Keyword
// The public and private keywords are defining what parts of your code have access to other parts of your code.
// We can define the access of many different parts of our code including instance variables, methods, constructors,
// and even a class itself.
// If we choose to declare these as public this means that any part of our code can interact with them
// - even if that code is in a different class!
// The way we declare something to be public is to use the public keyword in the declaration statement.

// The private Keyword and Encapsulation
// When a Class’ instance variable or method is marked as private, that means that you can only access those
// structures from elsewhere inside that same class.
// Sometimes restricting our code is actually useful from a design perspective.
// This is one of the core ideas behind encapsulation.
// By making our instance variables (and some methods) private, we encapsulate our code into nice little bundles of logic.
// Note that we don’t necessarily want to completely block everything from other classes.

// Accessor and Mutator Methods
// When writing classes, we often make all of our instance variables private.
// However, we still might want some other classes to have access to them, we just don’t want those classes
// to know the exact variable name.
// To give other classes access to a private instance variable, we would write an accessor method
// (sometimes also known as a “getter” method).
// Accessor methods will always be public, and will have a return type that matches the type of
// the instance variable they’re accessing.
// Similarly, private instance variables often have mutator methods (sometimes known as “setters”).
// These methods allow other classes to reset the value stored in private instance variables.
// Mutator methods, or “setters”, often are void methods — they don’t return anything, they just
// reset the value of an existing variable.
// Similarly, they often have one parameter that is the same type as the variable they’re trying to change.
package FreeCourse_LearnJava.Access_Encapsulation_And_Scope;
public class CheckingAccount{
    public String name;
    private int balance;
    private String id;
    
    public CheckingAccount(String inputName, int inputBalance, String inputId){
      name = inputName;
      balance = inputBalance;
      id = inputId;
    }
    
    public void addFunds(int fundsToAdd){
      balance += fundsToAdd;
    }
    
    public void getInfo(){
      System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
    }
    
    public void printBalance()  {
      System.out.println("Account balance is " + balance);
    }

    public int getBalance() {
      return balance;
    }
  
    public void setBalance(int newBalance)  {
      balance = newBalance;
    }

}

/*
public class Bank{
  public static void main(String[] args){
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");
    System.out.println(accountOne.name);
    accountOne.addFunds(5);
    accountOne.getInfo();
    CheckingAccount myAccount = new CheckingAccount("Mike", 300);
    myAccount.printBalance();
    System.out.println(accountOne.getBalance());
    accountOne.setBalance(5000);
    System.out.println(accountOne.getBalance());
  }

}
*/
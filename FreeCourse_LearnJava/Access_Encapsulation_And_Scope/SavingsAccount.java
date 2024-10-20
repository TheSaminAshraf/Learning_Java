// The this keyword

// Often times when creating classes, programmers will create local variables with the same name as instance variables.
// The this keyword is a reference to the current object.
// Oftentimes, you’ll see constructors have parameters with the same name as the instance variable.
// While this naming is a common convention, it can also be confusing.
// There’s nothing wrong with naming your parameters something else to be more clear.
// It is a good habit to use this. when working with your instance variables to avoid potential confusion.
package FreeCourse_LearnJava.Access_Encapsulation_And_Scope;
public class SavingsAccount{

  public String owner;
  public double balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, double balanceDollar){
    // Complete the constructor
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
    // Complete this method
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.println("The new balance is " + this.balanceDollar + " dollars");
  }
  
}

/*
public class Main{
  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

    // Make a call to addMoney() to test your method
    zeusSavingsAccount.addMoney(5000);
  }
}
*/
// Static Variables
// Much like static methods, you can think of static variables as belonging to the class itself
// instead of belonging to a particular object of the class.
// Just like with static methods, we can access static variables by using the name of the class and the . operator.
// Finally, we declare static variables by using the static keyword during declaration.
// This keyword usually comes after the variable’s access modifier (public or private).
// Unlike static methods, you can still access static variables from a specific object of the class.
// However, no matter what object you use to access the variable, the value will always be the same.
// You can think of it as all objects of the class sharing the same variable.
// final keyword means that you can’t change the variable’s value after creating it.

// Modifying Static Variables
// Editing static variables is similar to editing any other variable.
// Whether you’re writing code in a constructor, a non-static method, or a static method, you have access to static variables.
// Often times, you’ll see static variables used to keep track of information about all objects of a class.
// For example, our variable numATMs is keeping track of the total number of ATMs in the system.
// Therefore, every time an ATM is created (using the constructor), we should increase that variable by 1.
// If we could somehow destroy an ATM, the method that destroys it should decrease numATMs static variable by 1.
// Similarly, we have a variable named totalMoney.
// This variable is keeping track of all money across all ATMs.
// Whenever we remove money from an ATM using the non-static withdrawMoney() method, we should modify
// the money instance variable for that particular ATM as well as the totalMoney variable.
// In doing so, all ATMs will know how much money is in the system.

// Writing Your Own Static Methods
// Just like with variables, to create a static method, use the static keyword in the method’s definition.
// Just like with variables, this keyword usually comes after public or private.
// Often times, you’ll see static methods that are accessors or mutators for static variables.
// One important rule to note is that static methods can’t interact with non-static instance variables.
// To wrap your mind around this, consider why we use this when working with non-static instance variables.
// Let’s say we have a Dog class with a non-static instance variable named age.
// If we have a line of code like this.age = 5;, that means we’re setting the age of a specific Dog equal to 5.
// However, if age were static, that would mean that the variable belongs to the entire class, not a specific object.
// The this keyword can’t be used by a static method since static methods are associated with an entire class,
// not a specific object of that class.
// If you try to mix this with a static method, you’ll see the error message:
// non-static variable this cannot be referenced from a static context.

// Review
// Some of the main takeaways about static methods and variables:
// Static methods and variables are associated with the class as a whole, not objects of the class.
// Static methods and variables are declared as static by using the static keyword upon declaration.
// Static methods cannot interact with non-static instance variables. This is due to static methods not having a this reference.
// Both static methods and non-static methods can interact with static variables.
package FreeCourse_LearnJava.Static_Methods_Of_The_Math_Class;
public class ATM{

  public static int totalMoney = 0;
  public static int numATMs = 0;
  // Instance variables
  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;
    numATMs++;
    totalMoney += inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      totalMoney -= amountToWithdraw;
    }
  }

  public static void averageMoney() {
    System.out.println(totalMoney / numATMs);
    //System.out.println(this.money);     // error: non-static variable this cannot be referenced from a static context

  }

  public static void main(String[] args){
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    System.out.println(ATM.totalMoney);
    System.out.println(firstATM.totalMoney);
    System.out.println(secondATM.totalMoney);
    ATM.averageMoney();
  }
}
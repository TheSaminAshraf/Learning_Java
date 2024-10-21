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
package FreeCourse_LearnJava.Static_Methods_Of_The_Math_Class;
public class ATM{

    // Step 2: Create your static variables here
    public static int totalMoney = 0;
    public static int numATMs = 0;
    // Instance variables
    public int money;
  
    public ATM(int inputMoney){
      this.money = inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
      }
    }
  
    public static void main(String[] args){
      // Step 1: Create your two ATMs here
      ATM firstATM = new ATM(1000);
      ATM secondATM = new ATM(500);
      // Step 3: Print your static variable in three different ways here
      System.out.println(ATM.totalMoney);
      System.out.println(firstATM.totalMoney);
      System.out.println(secondATM.totalMoney);
    }
  
  }
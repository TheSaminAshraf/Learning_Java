// Using a Child Class as its Parent Class

// An important facet of polymorphism is the ability to use a child class object where an object of its parent class is expected.
// One way to do this explicitly is to instantiate a child class object as a member of the parent class.
// We can instantiate a CheckingAccount object as a BankAccount like this:
// BankAccount kaylasAccount = new CheckingAccount(600.00);
// We can use kaylasAccount as if it were an instance of BankAccount, in any situation where a
// BankAccount object would be expected.
// This would be true even if kaylasAccount were instantiated as a CheckingAccount, but using the explicit child as
// parent syntax is most helpful when we want to declare objects in bulk.
// It is important to note here that the compiler just considers kaylasAccount to be any old BankAccount.
// But because method overriding is handled at runtime, if we call printBalance(), we’ll see something CheckingAccount specific:
// Your checking account balance is $600.00
// This is because at runtime, kaylasAccount is recognized as the CheckingAccount it is.
// So, what if CheckingAccount has a method transferToSavings() that BankAccount does not have?
// Can kaylasAccount still use that method?
// Well, no. The compiler believes that kaylasAccount is just a BankAccount that doesn’t have some fancy
// child class transferToSavings() method, so it would throw an error.
package FreeCourse_LearnJava.Inheritance_And_Polymorphism;
public class Dinner {

  public void makeNoodles(Noodle noodle, String sauce) {
    
    noodle.cook();
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
    
  }  

}

/*
public class Main{
  public static void main(String[] args) {
    Dinner noodlesDinner = new Dinner();
    // Add your code here:
    Noodle biangBiang = new BiangBiang();
    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
  }
}
*/
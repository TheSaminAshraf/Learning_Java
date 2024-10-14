// Defining Methods
// Example method: public void checkBalance()   { // Code}
// The first line, public void checkBalance(), is the method declaration. 
// The method declaration gives the program some information about the method:
// "public" means that other classes can access this method.
// The void keyword means that there is no specific output from the method.
// checkBalance() is the name of the method.
// Every method has its own unique method signature which is composed of the method’s name and its parameter type.
// In this example, the method signature is checkBalance().
// The two print statements are inside the body of the method, which is defined by the curly braces: { and }.
// Anything we can do in our main() method, we can do in other methods. 
// All of the Java tools we know, like the math and comparison operators, can be used to make interesting and useful methods.
// checkBalance() is considered a non-static method because its signature does not include the keyword static like the main() method.

// Calling Methods
// When we add a non-static method to a class, it becomes available to use on an object of that class.
// In order to have our methods get executed, we must call the method on the object we created.
// First, we reference our object objectName, then, we use the dot operator (.) to call the method methodName().
// Note that we must include parentheses () after our method name in order to call it.
// Code generally runs in a top-down order where code execution starts at the top of a program and ends at the bottom of a program.
// However, methods are ignored by the compiler unless they are being called.
// When a method is called, the compiler executes every statement contained within the method.
// Once all method instructions are executed, the top-down order of execution continues.
// The below code is the same as the code in file "Store.java".

// Scope
// A method is a task that an object of a class performs.
// We mark the domain of this task using curly braces: {, and }.
// Everything inside the curly braces is part of the task.
// This domain enclosed by the curly braces { and } is called the scope of a method.
// We can't access variables that are declared inside a method in code that is outside the scope of that method.

// Adding Parameters
// We can customize all methods to accept parameters.
// Adding parameter values impacts our method’s signature.
// Like constructor signatures, the method signature includes the method name as well as the parameter types of the method.
// When calling a method with multiple parameters, the arguments given in the call must be placed in the same order as
// the parameters appear in the signature. If the argument types do not match the parameter types, we’ll receive an error.
// Through method overloading, our Java programs can contain multiple methods with the same name as long as each method’s
// parameter list is unique.

// Reassigning Instance Fields
// Changing instance fields is how we change the state of an object and make our objects more flexible and realistic.

// Returns
// Remember, variables can only exist in the scope that they were declared in.
// We can use a value outside of the method it was created in if we return it from the method.
// We return a value using the keyword "return".
// Once the return statement is executed, the compiler exits the function.
// Any code that exists after the return statement in a function is ignored.
// We will use dataType instead of void if the method returns dataType.
// The void keyword (which means “completely empty”) indicates that no value is returned after calling that method.
// We can use datatype keywords (such as int, char, etc.) to specify the type of value the method should return.
// The return value’s type must match the return type of the method.
// If the return expression is compatible with the return type, a copy of that value gets returned (return by value).
// Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so:
// int numTires = myCar.numberOfTires();
// When we return a primitive value, a copy of the value is returned.
// However, when we return an object, we return a reference to the object instead of a copy of it.

// The toString() Method
// When we print out Objects, we often see a String that is not very helpful in determining what the Object represents.
// We can add a method to our classes that that makes printing out the objects more descriptive.
// When we define a toString() method for a class, we can return a String that will print when we print the object.
package FreeCourse_LearnJava.Methods;
public class Store {
  // Instance fields
  String productType;
  public double price;
  double tax = 0.08;
    
  // Constructor method
  public Store(String product) {
    productType = product;
  }
  // Add advertise method below
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType);
  }    
  
  // greetCustomer() method
  public void greetCustomer(String customerName)  {
    System.out.println("Welcome to the store, " + customerName + "!");
  }

  // Increase price method
  public void increasePrice(double priceToAdd)  {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // Get price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + price * tax;
    return totalPrice;
  }
  // toString() method
  public String toString()  {
    return "This store sells " + productType + " at a price of " + price + ".";
  }

}
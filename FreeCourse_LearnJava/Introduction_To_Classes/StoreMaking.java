// Classes: Syntax
// Learn how to define a class.

// Classes: Constructors
// In Java, the constructor is a special type of method defined within the class. 
// It is used to initialize fields when an instance of the class is created.
// The name of the constructor method must be the same as the class itself.
// Generally, the constructor is defined as public.
// Below is how an instance/object of a class is created:
// className objectName = new constructorMethod();
// After the assignment operator (=) we call the constructor method using the keyword "new".
// The "new" keyword indicate that we’re creating a new instance of the class.
// Omitting the new keyword causes an error.
// If we print the value of the variable objectName we would see its memory address.
// This is because it is declared as a reference data type rather than a primitive data type, like int or double.
// This means that the variable holds a reference to the memory address of an instance.
// During its declaration, we specify the class name as the variable’s type, which in this case is className.
// If we use a special value, null, we can initialize a reference-type variable without giving it a reference.
// If we were to assign null to an object, it would have a void reference because null has no value.
// Using a null reference to call a method or access an instance variable will result in NullPointerException error.

// Classes: Instance Fields
// A Java object representing a real-world object has characteristics represented by instance fields or instance variables.
// Instance variables are specific to each instance of the class.
// This means that each object created from the class will have its own copy of these variables.
// These fields can be set in the following three ways:
// If they are public, they can be set like this: instanceName.fieldName = value;
// They can be set by class methods.
// They can be set by the constructor method.

// Classes: Constructor Parameters
// In Java, parameters are placeholders that we can use to pass information to a method.
// Since the constructor is a method, we can include parameters to assign values to instance fields.
// Inside the constructor, we can use this passed value however we want.
// A method can be characterized by its signature, which is the name, number of, and parameters of the method.
// There are two types of parameters: formal and actual.
// Formal parameters can be thought of as variables that store the data that is passed into a method.
// It specifies the type and name of the data.
// A class can have multiple constructors, we can differentiate them based on their parameters.
// The signature helps the compiler to differentiate between methods.
// When we don’t define the constructor, the Java compiler creates a default constructor that assigns default values to an instance.
// Default values can be created by assigning values to the instance fields during their declaration: 
// (Inside class declaration) public String carColor = "Red";

// Classes: Assigning Values to Instance Fields
// Parameters, also known as arguments, passed into a constructor can be used to initialize the instance fields of a created object.
// When passing in values to a constructor/method, the type of the value must match the type of the parameter.
// Remember, that we can access the fields of an object by using the dot operator.
// An argument refers to the actual values passed during the method call.
// A parameter refers to the variables declared in the method signature.
// When we pass an argument, a copy of the argument value is passed to the parameter rather than the actual variables.
// This process of calling a method with an argument value is called a call-by-value.

// Classes: Multiple Fields
// Objects are not limited to a single instance field.
// We can declare as many fields as necessary for our program's requirements.
// Remember, it's important to pass the arguments in the same order as they are listed in the parameters.

// Classes: Review
// Object-oriented programming revolves around classes and objects.
// The class is a fundamental concept of OOP and programs in Java are built with multiple classes and their objects.
// A class is a blueprint to create instances and it defines the state and behavior of these instances.
// Every class has a special method called constructor which is invoked when a new object is created.
// Constructors initialize the state of newly created instances.
// Instance fields define the characteristics of an object.
// We can declare them within a class but outside of any method or constructor.
// We use the dot operator (.) to access the instance fields.
// A program can have multiple classes, instances, and instance fields as per the program’s requirements.
// See the file "Dog.java" which covers all the above points.
package FreeCourse_LearnJava.Introduction_To_Classes;
public class StoreMaking  {
    public String productType;
    public int inventoryCount;
    public double inventoryPrice;
    //public static void main(String[] args)  {
    //  // Empty
    //}
    public StoreMaking()  {
      System.out.println("I am inside the Store constructor.");
    }
    public StoreMaking(String product, int count, double price)  {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    public void buyItems()  {
      // Empty
    }
  }

/*
public class Main{
  public static void main(String[] args) {    
    Store lemonadeStand = new Store ("lemonade");
    System.out.println(lemonadeStand.productType);
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}
*/
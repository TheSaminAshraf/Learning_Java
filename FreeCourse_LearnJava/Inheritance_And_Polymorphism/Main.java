// Introducing Inheritance
// A Java class can also inherit traits from another class.
// The object-oriented principle of inheritance saves us the headache of redefining the same class members all over again.
// Parent class, superclass, and base class refer to the class that another class inherits from.
// Child class, subclass, and derived class refer to a class that inherits from another class.

// Inheritance in Practice
// We use the keyword extends to define a class that inherits from a parent class.
/*
class Shape {
  // Shape class members
}
class Triangle extends Shape {
  // additional Triangle class members
}
*/
// When we use inheritance to extend a subclass from a superclass, we create an “is-a” relationship
// from the subclass to the superclass.
// For example, an object of Triangle is a member of the Shape class;
// however, an object of Shape is not necessarily an object of Triangle.
// Most Java programs utilize multiple classes, each of which requires its own file.
// Only one file needs a main() method — this is the file we will run.
// Note: the various classes in our Java package — even though they are in different files — will have access
// to each other, so we can instantiate one class inside of another.

// Inheriting the Constructor
// Let’s say Shape has a numSides field that is set by passing an integer into the constructor.
// If we’re instantiating a Triangle, we would want that number to always be 3, so we’d want to modify
// the constructor to automatically assign numSides with a value of 3.
// The super() method acts like the parent constructor inside the child class constructor.
// By passing 3 to super(), we are making it possible to instantiate a Triangle without passing in a value for numSides.
// Meanwhile, super(3) (behaving as Shape(3)) will shoulder the responsibility of setting numSides to 3 for our Triangle object.
// It’s like we called Shape(3).
// It is also possible to write a constructor without making a call to any super() constructor.
// In this situation, Java secretly calls the parent class’ no-argument constructor (super()).
// So in this specific example, the Triangle() constructor first calls the Shape() constructor.
// That Shape() takes care of whatever business it needs to take care of.
// And then after that is complete, we go in and set this.numSides to 3.
// If you’re writing a constructor of a child class, and don’t explicitly make a call to a constructor
// from a parent class using super, it’s important to remember that Java will automatically
// call super() as the first line of your child class constructor.

// Parent Class Aspect Modifiers
// Java class members use private and public access modifiers to determine whether they can be accessed from outside the class.
// A child class does not inherit its parent class's private members.
// There is another access modifier we can use to keep a parent class member accessible to its child classes and
// to files in the package it’s contained in — and otherwise private: protected.
// Modifier         Class         Package         Child Class         Global
// public           Yes           Yes             Yes                 Yes
// protected        Yes           Yes             Yes                 No
// no modifier      Yes           Yes             No                  No
// private          Yes           No              No                  No
// In addition to access modifiers, there’s another way to establish how child classes can interact with
// inherited parent class members: using the final keyword.
// If we add final after a parent class method’s access modifier, we disallow any child classes from changing that method.
// This is helpful in limiting bugs that might occur from modifying a particular method.
// Though it is not required, there is an established order when two or more field modifiers are used (eg. public final).
// Field modifier: https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.1

// Introducing Polymorphism
// Polymorphism, which derives from Greek meaning “many forms”, allows a child class to share the information and
// behavior of its parent class while also incorporating its own functionality.
// The main advantages of polymorphic programming:
// Simplifying syntax
// Reducing cognitive overload for developers
// These benefits are particularly helpful when we want to develop our own Java packages for other developers to import and use.
// For example, the built-in operator + can be used for both doubles and ints.
// To the computer, the + means something like addDouble() for one and addInt() for the other,
// but the creators of Java (and of other languages) didn’t want to burden us as developers with recalling each individual method.
// Note that the reverse situation is not true; you cannot use a generic parent class instance where a
// child class instance is required.
// So an Orange can be used as a Fruit, but a Fruit cannot be used as an Orange.

// Method Overriding
// One common use of polymorphism with Java classes is overriding parent class methods in a child class.
// Like the + operator, we can give a single method slightly different meanings for different classes.
// This is useful when we want our child class method to have the same name as a parent class method but behave a
// bit differently in some way.
// The overriding method has to have the following common with the overridden method:
// Method name, return type and the number and type of parameters.
// The @override keyword/annotation informs the compiler that we want to override a method in the parent class.
// If the method doesn’t exist in the parent class, we’ll get a helpful error when we compile the program.
// We can also use this keyword to call the methods of a parent class.
// While we now have the ability to override methods from a superclass, we may find ourselves in a unique situation
// where we want to use the superclass method instead of the subclass’ overridden method.
// Note: the keyword super is short for superclass (parent class).
// If that’s the case, we can call the parent class method by prepending super followed by the dot operator (.)
// to the method call.
// Note that this only works if we pass in the proper method parameters.
// printBalance();          // Calls the overridden printBalance() method from the child class 
// super.printBalance();    // Calls the original printBalance() method from the parent/super class.

// Child Classes in Arrays and ArrayLists
// Usually, when we create an array or an ArrayList, the list items all need to be the same type.
// In fact, we can put instances of different classes that share a parent class together in an array or ArrayList.
// We can even iterate through the list of items — regardless of subclass — and perform the same action with each item.
package FreeCourse_LearnJava.Inheritance_And_Polymorphism;
class Noodle {

  private double lengthInCentimeters;
  private double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
    
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
      
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
      
  }
    
  public void cook() {

    System.out.println("Boiling");
    this.texture = "cooked";

  }

  public final boolean isTasty() {

    return true;

  }

  public String getCookPrep() {

    return "Boil noodle for 7 minutes and add sauce.";

  }
    
}

class Spaghetti extends Noodle {

  Spaghetti() {

    super(30.0, 0.2, "round", "semolina flour");

  }
  
  @Override
  public String getCookPrep() {

    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

  }

}

class Pho extends Noodle {
  
  public Pho(){

    super(30.0, 0.64, "flat", "rice flour");

  }

  @Override
  public String getCookPrep() {

    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

  }

}

class Ramen extends Noodle {

  Ramen() {

    super(30.0, 0.3, "flat", "wheat flour");  

  }

  @Override
  public String getCookPrep() {

    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";

  }

}

class Spaetzle extends Noodle {

  Spaetzle() {

    super(3.0, 1.5, "irregular", "eggs, flour, salt");
    this.texture = "lumpy and liquid";     

  }

  @Override
  public void cook()  {
    
    System.out.println("Grinding or scraping the dough into the pot of boiling water.");
    System.out.println("Boiling");
    this.texture = "cooked";
    
  } 

}

public class Main{
  
  public static void main(String[] args) {

    Spaghetti spaghettiPomodoro = new Spaghetti();
    System.out.println(spaghettiPomodoro.texture);
    Pho phoChay = new Pho();
    System.out.println(phoChay.shape);
    Ramen yasaiRamen = new Ramen();
    //System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());

    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
        
    Noodle[] allTheNoodles = {spaghetti, ramen, pho};

    for (Noodle noodle : allTheNoodles) {

      System.out.println(noodle.getCookPrep());

    }
  
  }

}
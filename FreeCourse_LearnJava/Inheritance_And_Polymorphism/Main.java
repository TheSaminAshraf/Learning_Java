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
// 
package FreeCourse_LearnJava.Inheritance_And_Polymorphism;
class Noodle {

  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";
    
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
      
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
      
  }
    
  public void cook() {

    this.texture = "cooked";

  }
    
}

class Spaghetti extends Noodle  {
  
}

class Pho extends Noodle {
  
  public Pho(){

    super(30.0, 0.64, "flat", "rice flour");

  }

}

public class Main{
  
  public static void main(String[] args) {
    Spaghetti spaghettiPomodoro = new Spaghetti();
    System.out.println(spaghettiPomodoro.texture);
    Pho phoChay = new Pho();
    System.out.println(phoChay.shape);
  
  }

}
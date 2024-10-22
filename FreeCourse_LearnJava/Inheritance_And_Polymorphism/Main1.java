// Child Classes in Method Parameters

// When we call a method that contains parameters, the arguments we place in our method call must match the parameter type.
// Polymorphism gives us a little more flexibility with the arguments we can use. 
// If we use a superclass reference as a method parameter, we can call the method using subclass reference arguments.
// For example, imagine the class ScaryStory, whose constructor takes in a reference to the Monster class.
/*
class ScaryStory {
  Monster monster;
  String setting;

  public ScaryStory(Monster antagonist, String place) {
    monster = antagonist;
    setting = place;
  }

  public void tellStory(){
    System.out.println("Once upon a time, " + monster.name + " was at " + setting + " looking to scare some mortals.");
  }

  public static void main(String[] args) {
    Monster dracula;
    dracula = new Vampire("Dracula");
    ScaryStory countDracula = new ScaryStory(dracula, "Dracula Castle");
    countDracula.tellStory();
  }
}
*/
// In the main() method, we used a reference of the class Vampire as our argument even though
// the constructor requested an object of class Monster.
// This is allowed because Vampire is a subclass of the Monster class.

// Review
// Learnt:
// A Java class can inherit fields and methods from another class.
// Each Java class requires its own file, but only one class in a Java package needs a main() method.
// Child classes inherit the parent constructor by default, but it’s possible to modify the constructor
// using super() or override it completely.
// You can use protected and final to control child class access to parent class members.
// Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class,
// but also give it its own traits.
// You can override parent class methods in the child class, ideally using the @Override keyword.
// It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.
package FreeCourse_LearnJava.Inheritance_And_Polymorphism;
public class Main1{

    public static void main(String[] args) {

      Noodle ramen, pho;
      ramen = new Ramen();
      pho = new Pho();
        
      NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
    
      // Add your code here
      customer1.order(pho);

    }

}
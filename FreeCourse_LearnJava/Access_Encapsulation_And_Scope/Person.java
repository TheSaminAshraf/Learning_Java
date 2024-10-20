// Using this With Methods

// We can also use this with methods.
// Using the keyword this within a method means the object calling the method will be used to call the other method(s)
// within the method.
// Finally, this can be used as a value for a parameter.
// Let’s say a method exists that takes a Computer as a parameter (that method’s signature might be something
// like public void pairWithOtherComputer(Computer other)).
// If you’re writing another method in Computer, and want to call the pairWithOtherComputer() method,
// you could use this as the parameter.
// That call might look something like this.pairWithOtherComputer(this).
// You’re using the current object to call the method and are passing that object as that method’s parameter.
package FreeCourse_LearnJava.Access_Encapsulation_And_Scope;
public class Person{
  public int age;
  public int wisdom;
  public int fitness;

  public Person(int inputAge){
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }

  public void hasBirthday(){
    //Complete this method
    this.setAge(this.age + 1);
    this.setWisdom(this.wisdom + 5);
    this.setFitness(this.fitness - 3);
  }
}

/*
public class Main{
  public static void main(String[] args){
    Person emily = new Person(20);
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}
*/
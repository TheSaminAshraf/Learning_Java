// Static Methods Refresher

// Static methods are methods that belong to an entire class, not a specific object of the class.
// Static methods are called using the class name and the . operator.
// Similarly, valueOf() is a static method of the Double class.
// Given a String as an input, this method will turn that String into a double.
// Again, we don’t need to create a Double object in order to call this method — we use the class itself to call it.
package FreeCourse_LearnJava.Static_Methods_Of_The_Math_Class;
public class ExerciseOne{
    public static void main(String[] args){
  
      int randomNum = (int)(Math.random() * 10) + 1;
      System.out.println("Your random number between one and ten is " + randomNum);
      
      int negativeNum = -2;
      int absNum = Math.abs(negativeNum);
      System.out.println("The absolute value of "+ negativeNum + " is " + absNum);
  
      String myNewString = Integer.toString(1);
      System.out.println(myNewString);
  
    }

}
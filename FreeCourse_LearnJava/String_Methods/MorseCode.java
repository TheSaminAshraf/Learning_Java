// indexOf()

// If we want to know the index of the first occurrence of a character in a string, we can use the indexOf() method on a string.
// Remember that the indices in Java start with 0.
// Suppose we want to know the index of the first occurrence of an entire substring.
// The indexOf() instance method can also return where the substring begins (the index of the first character in the substring).
// This would output 4, because EFG starts at index 4.
// If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.
package FreeCourse_LearnJava.String_Methods;
public class MorseCode {
  
  public static void main(String[] args) {
    
    String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

    // Write the code:
    System.out.println(code.indexOf(". .- -"));
    
  }
    
}
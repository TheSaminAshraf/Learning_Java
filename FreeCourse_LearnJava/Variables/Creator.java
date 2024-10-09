// Introduction

// We store information in variables, named locations in memory.
// Naming a piece of information allows us to use that name later, accessing the information we stored.
// Variables also give context and meaning to the data we are storing.
// We must declare a variable to reference it within our program.
// Declaring a variable requires that we specify the type and name of the variable in the following way:
// dataType variableName (= value)
// 
package FreeCourse_LearnJava.Variables;
public class Creator {
    public static void main(String[] args) {
        String name = "James Gosling";
        int yearCreated = 1995;
        System.out.println(name);
        System.out.println(yearCreated);
    }
}
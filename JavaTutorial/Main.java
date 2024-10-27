package JavaTutorial;

public class Main {
    
    // Every line of code that runs in Java must be inside a class.
    // And the class name should always start with an uppercase first letter.

    public static void main(String[] args) {

        System.out.println("Hello World");

        // The name of the java file must match the class name.
        // When saving the file, save it using the class name and add ".java" to the end of the filename.
        // The main() method is required and you will see it in every Java program.
        // Any code inside the main() method will be executed.
        // To declare more than one variable of the same type, you can use a comma-separated list:
        
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // You can also assign the same value to multiple variables in one line:

        int x1, y1, z1;
        x1 = y1 = z1 = 50;
        System.out.println(x1 + y1 + z1);

        // Data types are divided into two groups:
        // Primitive data types - includes byte, short, int, long, float, double, boolean and char
        // Non-primitive data types - such as String, Arrays and Classes

    }



}

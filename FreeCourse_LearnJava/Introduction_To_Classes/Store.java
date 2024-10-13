// Introduction to Classes

// In every Java program, classes serve as representations of the real world.
// A class is a template for creating objects in Java.
// Object-oriented programming: programs are built using objects.

package FreeCourse_LearnJava.Introduction_To_Classes;
public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method
    public Store(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("lemonade", 42, .99);
      Store cookieShop = new Store("cookies", 12, 3.75);
      
      System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
      System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}
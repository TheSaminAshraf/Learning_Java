// Addition and Subtraction

// The addition operator (+) is used to add.
// The subtraction operator (-) is used to subtract.
// The increment operator (++) adds 1 to a variable.
// The decrement operator (++) subtracts 1 from a variable.
package FreeCourse_LearnJava.Manipulating_Variables;
public class PlusAndMinus {
	public static void main(String[] args) {   
	    int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo);
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade);
	}
}
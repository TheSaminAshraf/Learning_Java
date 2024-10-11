// Equals and Not Equals

// We can use the relational operator equals (==) to see if two variables are equal.
// To check that two variables are not equal, we can use the relational operator  not equals (!=).
package FreeCourse_LearnJava.Manipulating_Variables;
public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}
}
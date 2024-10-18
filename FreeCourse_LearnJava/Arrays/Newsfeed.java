// Introduction
// An array holds a fixed number of values of one type.
// Arrays hold doubles, ints, booleans, or any other primitives.
// Arrays can also contain Strings as well as object references.
// Each index of an array corresponds with a different value.

// Creating an Array Explicitly
// Just like with variables, we can declare and initialize in the same line.
// This allows us to explicitly initialize the array to contain the data we want to store.
// Just like with variables, we can declare and initialize in the same line.
// This allows us to explicitly initialize the array to contain the data we want to store.

// Importing Arrays
// Printing an array without importing java.util.Arrays provides a nondescriptive output.
// If we want to have a more descriptive printout of the array itself, we need a toString()
// method that is provided by the Arrays package in Java.
// We put this at the top of the file, before we even define the class.
// When we import a package in Java, we are making all of the methods of that package available in our code.
// The Arrays package has many useful methods, including Arrays.toString().
// When we pass an array into Arrays.toString(), we can see the contents of the array printed out.
// Syntax: Arrays.toString(arrayToPrint);

// Get Element By Index
// We use square brackets, [ and ], to access data at a certain index.
// The index of an array starts at 0 and ends at an index of one less than the number of elements in the array.
// Trying to access an element outside of its appropriate index range will result in
// ArrayIndexOutOfBoundsException error.

// Creating an Empty Array
// We can also create empty arrays and then fill the items one by one.
// String[] names = new String[5]; creates an array of Strings of size 5.
// Empty arrays have to be initialized with a fixed size.
// Once you declare this size, it cannot be changed.
// After declaring and initializing, we can set each index of the array to be a different item.
// We can also change an item after it has been assigned.
// When we use new to create an empty array, each element of the array is initialized with a
// specific value depending on what type the element is:
// Data type              Initialized value
// int                    0
// double                 0.0
// boolean                false
// Reference              null
// Creating an array of new Strings will result in the array having null references.

// Length
// To get the length of an array, we can access the length field of the array object:
// System.out.println(arrayName.length);

// String[] args
// When we write main() methods for our programs, we use the parameter String[] args.
// A String[] is an array made up of Strings.
// The args parameter is another example of a String array.
// In this case, the array args contains the arguments that we pass in from the terminal when we run the class file.
// An argument can be passed from the terminal after compiling the .java file.
// javac fileName.java (Compile .java file)
// java fileName args (Run the file and pass the argument, args).
/*
javac Main.java
$ ls
LETest.class  Main.java       script.py
LETest.java   Newsfeed.class
Main.class    Newsfeed.java
$ java Main Robot
The topics in this feed are:
[Oil, Parts, Algorithms, Love]
$ java Main Human
The topics in this feed are:
[Politics, Science, Sports, Love]
*/
package FreeCourse_LearnJava.Arrays;
import java.util.Arrays;
public class Newsfeed {
    String[] trendingArticles;
    double[] ratings;
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public String getFirstTopic() {
      return topics[0];
    }

    public int getNumTopics(){
      return topics.length;
    }

    public Newsfeed(){
      // Initialize favoriteArticles here:
      favoriteArticles = new String[10];
    }
    
    public void setFavoriteArticle(int favoriteIndex, String newArticle){
      // Add newArticle to favoriteArticles:
      favoriteArticles[favoriteIndex] = newArticle;
    }

    public void viewTopic(int topicIndex){
      views[topicIndex]++;
    }

    public String[] getTopics(){
      String[] topics = {"Opinion", "Tech", "Science", "Health"};
      return topics;
    }

    public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
      trendingArticles = initialArticles;
      views = initialViews;
      ratings = initialRatings;
    }
    
    public String getTopArticle(){
      return trendingArticles[0];
    }
    
    public void viewArticle(int articleNumber){
      views[articleNumber] = views[articleNumber] + 1;
      System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }
    
    public void changeRating(int articleNumber, double newRating){
      if (newRating > 5 || newRating < 0) {
        System.out.println("The rating must be between 0 and 5 stars!");
      } else {
        ratings[articleNumber] = newRating;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
      }
    }
}

// The following code is the Main.java file provided with the Newsfeed.java file
/*
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
		Newsfeed feed;
    if(args[0].equals("Robot")){
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new Newsfeed(robotTopics);
    }
    else if(args[0].equals("Human")){
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new Newsfeed(humanTopics);
    }
    else{
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new Newsfeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}
*/
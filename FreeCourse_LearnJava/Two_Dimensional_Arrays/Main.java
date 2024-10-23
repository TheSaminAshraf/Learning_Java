// Introduction to 2D Arrays
// An array is a group of data consisting of the same type. This means that we can have an array of primitive data types
// (such as integers).
// We can even have an array of Objects.
// In Java, arrays are considered Objects; therefore, we can also have an array of arrays:
// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Additionally, we can have 2D arrays which are not rectangular in shape.
// These are called jagged arrays:
// [['a', 'b', 'c', 'd'], ['e', 'f'], ['g', 'h', 'i', 'j'], ['k']]
// Reasons for using 2D Arrays:
// It is useful to use 2D arrays for situations where you need to store and organize data by rows and columns.
// For example, exporting data to be used in a spreadsheet.
// You can condense multiple arrays down to a single variable using 2D arrays.
// For example, if you have 10 students who each have 10 different quiz grades, you can represent the overall
// class quiz grades as a 10x10 2D array by having each row represent a student and
// each column represent one of the quizzes they have taken.
// 2D arrays can be used to map out data.
// For example, if you want to create a game of tic-tac-toe, you can represent the game state by using a 3x3 2D array.
// There are many other ways to use 2D arrays depending on the application.
// The only downside is that once initialized, no new rows or columns can be added or
// removed without copying the data to a newly initialized 2D array.
// This is because the length of arrays in Java are immutable (unable to be changed after creation).

// Declaration, Initialization and Assignment
// When declaring 2D arrays, the format is similar to normal, one-dimensional arrays,
// except that you include an extra set of brackets after the data type.
// In this example, int represents the data type, the first set of brackets [] represent an array, and
// the second set of brackets [] represent that we are declaring an array of arrays.
// You can think of this as creating an array ([]) of int arrays (int[]).
// So we end up with int[][].
// When initializing arrays, we define their size.
// Initializing a 2D array is different because, instead of only including the number of elements in the array,
// you also indicate how many elements are going to be in the sub-arrays.
// This can also be thought of as the number of rows and columns in the 2D matrix.
// int[][] intArray1;
// intArray1 = new int[row][column];
// If you already know what values are going to be in the 2D array,
// you can initialize it and write all of the values into it at once.
// We can accomplish this through initializer lists.
// In Java, initializer lists are a way of initializing arrays and assigning values to them at the same time.
// We can use this for 2D arrays as well by creating an initializer list of initializer lists.
// There are three situations in which we can use initializer lists for 2D arrays:
// 1. In the case where the variable has not yet been declared, we can provide an abbreviated form since Java
// will infer the data type of the values in the initializer lists:
// double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4,5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
// 2. If the variable has already been declared, you can initialize it by creating a new 2D array object
// with the initializer list values:
// String[][] stringValues;
// stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};
// 3. The previous method also applies to assigning a new 2D array to an existing 2D array stored in a variable.

// Accessing Elements in a 2D Array
// For a normal array, all we need to provide is an index (starting at 0) which represents the position of the
// element we want to access.
// We can access the first element using index 0, the last element using the length of the array minus one,
// and any of the elements in between.
// We provide the index of the element we want to access inside a set of brackets.
// Now for 2D arrays, the syntax is slightly different.
// This is because instead of only providing a single index, we provide two indices.
// Given a 2D array of integer data
// int[][] data = {{2,4,6}, {8,10,12}, {14,16,18}};
// Access and store a desired element 
// int stored = data[0][2];
// There are two ways of thinking when accessing a specific element in a 2D array.
// The first way of thinking is that the first value represents a row and the second value represents a column in the matrix.
// The second way of thinking is that the first value represents which subarray to access from the main array and
// the second value represents which element of the subarray is accessed
// When accessing these elements, if either the row or column value is out of bounds, then an
// ArrayIndexOutOfBoundsException will be thrown by the application.

// Modifying elements in a 2D Array
// For a one dimensional array, you provide the index of the element which you want to modify within
// a set of brackets next to the variable name and set it equal to an acceptable value.
// For 2D arrays, the format is similar, but we will provide the outer array index in the first set of brackets and
// the subarray index in the second set of brackets.
// We can also think of it as providing the row in the first set of brackets and the column index in
// the second set of brackets if we were to visualize the 2D array as a rectangular matrix.
// To assign a new value to a certain element, make sure that the new value you are using is either of the same
// type or is castable to the type already in the 2D array.

// Review of Nested Loops
// Nested loops consist of two or more loops placed within each other.
// We will be looking at one loop nested within another for 2D traversal.
// The way it works is that, for every iteration of the outer loop, the inner loop finishes all of its iterations.
// Nested loops can consist of any type of loop and with any combination of loops.

// Traversing 2D Arrays: Introduction
// Traversing 2D arrays using loops is important because it allows us to access many elements quickly,
// access elements in very large 2D arrays, and even access elements in 2D arrays of unknown sizes.
// In Java, 2D arrays are like normal arrays, but each element is another array.
// In order to find the number of elements in the outer array, we just need to get the length of the 2D array.
// When thinking about the 2D array in matrix form, this is the height of the matrix (the number of rows)
// In order to find the number of elements in the subarray, we can get the length
// of the subarray after it has been retrieved from the outer array.
// When thinking about the 2D array in matrix form, this is the width of the matrix (the number of columns)
// In most cases, getting the length of the first subarray in the 2D array will apply to the
// rest of the subarrays (if it is rectangular in shape), but there are rare occasions where
// the length of the subarrays could be different.
// This occurs if the 2D array is a jagged array.
// We don’t have to only use regular for loops for traversing 2D arrays.
// We can use enhanced for loops if we do not need to keep track of the indices.
// Since enhanced for loops only use the element of the arrays, it is a bit more cumbersome to keep track of
// which index we are at.
// This same idea applies to while and do-while loops as well.
// This is why we usually use regular for loops except for when we want to do something simple like printing.

// Traversing 2D Arrays: Practice with Loops
// In enhanced for loops, each element is iterated through until the end of the array.
// When we think about the structure of 2D arrays in Java (arrays of array objects) then we know
// that the outer enhanced for loop elements are going to be arrays.
// Remember that the syntax for enhanced for loops looks like so: for( datatype elementName : arrayName){}.
// Since 2D arrays in Java are arrays of arrays, each element in the outer enhanced for loop is an entire
// row of the 2D array.
// The nested enhanced for loop is then used to iterate through each element in the extracted row. 

// Traversing 2D Arrays: Row-Major Order
// Row-major order for 2D arrays refers to a traversal path which moves horizontally through each row starting
// at the first row and ending with the last.
// Although we have already looked at how 2D array objects are stored in Java, this ordering system conceptualizes
// the 2D array into a rectangular matrix and starts the traversal at the top left element and ends at the bottom right element.
// This path is created by the way we set up our nested loops.
// Row-major order is important when we need to process data in our 2D array by row.
// You can be provided data in a variety of formats and you may need to perform calculations of rows of data
// at a time instead of individual elements.
// An interesting thing to note is that, due to the way 2D arrays are structured in Java, enhanced for loops
// are always in row-major order.
// This is because an enhanced for loop iterates through the elements of the outer array which causes
// the terminating condition to be the length of the 2D array which is the number of rows.

// Traversing 2D Arrays: Column-Major Order
// Column-major order for 2D arrays refers to a traversal path which moves vertically down each column starting
// at the first column and ending with the last.
// This ordering system also conceptualizes the 2D array into a rectangular matrix and starts the traversal at
// the top left element and ends at the bottom right element.
// Column-major order has the same starting and finishing point as row-major order,
// but it’s traversal is completely different.
// In order to perform column-major traversal, we need to set up our nested loops in a different way.
// We need to change the outer loop from depending on the number of rows, to depending on the number of columns.
// Likewise we need the inner loop to depend on the number of rows in its termination condition.
// Column major order is important because there are a lot of cases when you need to process data vertically.
// Let’s say that we have a chart of information which includes temperature data about each day.
// The top of each column is labeled with a day, and each row represents an hour.
// In order to find the average temperature per day, we would need to traverse the data vertically
// since each column represents a day.

// Combining Traversal and Conditional Logic
// When working with 2D arrays, it is important to be able to combine traversal logic with conditional
// logic in order to effectively navigate and process the data.
// Here are a few ways in how conditional logic can affect 2D array traversal: 
// Skipping or selecting certain rows and columns
// Modifying elements only if they meet certain conditions
// Complex calculations using the 2D array data
// Formatting the 2D array
// Avoiding exceptions / smart processing

// 2D Array Review
// Arrays are objects in Java, we can have arrays of objects, therefore we can also have arrays of arrays.
// This is the way 2D arrays are structured in Java.
// We can declare and initialize 2D arrays in a few different ways depending on the situation:
/*
// Declaring without initializing
int[][] intTwoD;
// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];
// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];
// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
*/
// We retrieve elements in a 2D array by providing a row and column index char c = letters[0][1];
// We can also think of them as the index of the outer array and the index of the subarray
// We can modify elements the same way letters[1][2] = 'z';
// We traverse 2D arrays using nested loops.
// We can use loops of any type, but we typically use nested for loops to keep track of the indices
// Row-major order traverses through each row moving horizontally to the right through each row
// Column-major order traverses through each column moving vertically down through each column
// Row-major order and column-major order start and end on the same elements, but the paths are different.
// In order to convert row-major to column-major, we need to make the outer loop terminating condition depend
// on the number of columns, make the inner loop terminating condition depend on the number of rows, and flip the variables
// in our accessor within the inner loop to ensure that we don’t try to access outside of the 2D
// array since we flipped the direction of traversal.
// Here are examples of row-major and column-major order: 
/*
// Row-major order
for(int o = 0; o < letters.length; o++) {
    for(int i = 0; i < letters[o].length; i++) {
        char c = letters[o][i];
    }
}

// Column-major order
for(int o = 0; o < letters[0].length; o++) {
    for(int i = 0; i < letters.length; i++) {
        char c = letters[i][o];
    }
}
*/
// Conditional logic in our 2D array traversal allows us to use the data in a meaningful way.
// We can control which rows and columns we look at, ensure that the data we are looking at is what
// we want, perform calculations on specific elements, avoid throwing exceptions, and more.
package FreeCourse_LearnJava.Two_Dimensional_Arrays;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {

		// Declare a 2d array of float values called floatTwoD
    float[][] floatTwoD;
		floatTwoD = new float[4][10];
		
    char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
		
    ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};

    int[][] intMatrix = {
      {1, 1, 1, 1, 1},
      {2, 4, 6, 8, 0},
      {9, 8, 7, 6, 5}
    };
    int retrievedInt = intMatrix[0][3];
    System.out.println(retrievedInt);
    System.out.println(intMatrix[1][2] * 3);

    int[][] intMatrix2 = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};   
    
		// Declare and initialize a 2D array called subMatrix
		int[][] subMatrix = new int[2][2];
    subMatrix[0][0] = intMatrix2[0][0] * 5;
    subMatrix[0][1] = intMatrix2[0][1] * 5;
    subMatrix[1][0] = intMatrix2[1][0] * 5;
    subMatrix[1][1] = intMatrix2[1][1] * 5;

    System.out.println(Arrays.deepToString(subMatrix));

    int tableSize = 10;
    for(int i = 1; i <= 10; i++){
      for(int j = 1; j <= 10; j++){
        System.out.print(i * j);
        System.out.print(" ");
      }
      System.out.println();

    }

    int[][] intMatrix1 = {
      { 4,  6,  8, 10, 12, 14, 16},
      {18, 20, 22, 24, 26, 28, 30},
      {32, 34, 36, 38, 40, 42, 44},
      {46, 48, 50, 52, 54, 56, 58},
      {60, 62, 64, 66, 68, 70, 79}
    };
    int rows = intMatrix1.length;
    int columns = intMatrix1[0].length;
    int sum = 0;
    for(int i=0; i<rows; i++) {
      for(int j = 0; j < columns; j++) {
        // Add a line to calculate sum of all elements
        sum += intMatrix1[i][j];
      }
    }
    System.out.println(sum);

    int[][] binary = {
      {0, 1, 0, 1},
      {1, 1, 1, 0},
      {1, 0, 0, 1},
      {1, 0, 1, 0}
    };
		int onesCount = 0;
    for (int[] x : binary)  {
      for (int y : x) {
        if (y == 1) {
          onesCount++;
        }
      }
    }
		//System.out.println(onesCount);

    String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};	
    
		int i = 0;
    int j = 0;
    while (i < wordData.length) {
      j = 0;
      while (j < wordData[i].length)  {
        System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
        j++;
      }
      i++;
    }

    double[][] times = {{64.791, 75.972, 68.950, 79.039, 73.006, 74.157}, {67.768, 69.334, 70.450, 67.667, 75.686, 76.298}, {72.653, 77.649, 74.245, 62.121, 63.379, 79.354}};
		
		double runnerTime = 0.0;
		for(int outer = 0; outer < times.length; outer++) {
			runnerTime = 0.0;
			for(int inner = 0; inner < times[outer].length; inner++) {
        		System.out.println("Runner index: " + outer + ", Time index: " + inner);
				// Add a line to sum up the values in each row.
            runnerTime += times[outer][inner];
			}
      double averageVal = 0;
      averageVal = runnerTime / times[outer].length;
			System.out.println("Sum of runner " + outer + " times: " + runnerTime);
			System.out.println("Average of runner " + outer + ": " + averageVal);

    }
		
		double lapTime = 0.0;
		for(int outer = 0; outer < times[0].length; outer++){
			lapTime = 0.0;
			for(int inner = 0; inner < times.length; inner++){
				System.out.println("Lap index: " + outer + ", Time index: " + inner);
				// Add a line to sum up the values
        lapTime+=times[inner][outer];
			}
			double averageVal = 0;
      averageVal = lapTime / times.length;
			System.out.println("Sum of lap " + outer + " times: " + lapTime);
			System.out.println("Average time for lap " + outer + ": " + averageVal);
    }

    int[][] imageData={
      {100,90,255,80,70,255,60,50},
			{255,10,5,255,10,5,255,255},
			{255,255,255,0,255,255,255,75},
			{255,60,30,0,30,60,255,255}
    };

		int[][] newImage = new int[4][6];

    for (int i = 0; i < newImage.length; i++)  {
      for (int j = 0; j < newImage[i].length; j++) {
        newImage[i][j] = imageData[i][j];
      }
    }

		System.out.println(Arrays.deepToString(newImage));
			
		for(int i=0; i<newImage.length; i++){
      for(int j=0; j<newImage[i].length; j++){
        // Add the if-else statement here
        newImage[i][j] -= 50;
        if (newImage[i][j] < 0) {
          newImage[i][j] = 0;
        }
      }
    }

		System.out.println(Arrays.deepToString(newImage));

    double[][] scores = {{80.4, -1, -1}, {96.2, -1, -1}, {100.0, -1, -1}, {78.9, -1, -1}};
  	System.out.println(Arrays.deepToString(scores));

    scores[0][1] = 89.7;
    scores[1][1] = 90.5;
    scores[2][1] = 93.6;
    scores[3][1] = 88.1;

  	System.out.println(Arrays.deepToString(scores));
		
    double[][] newScores = new double[4][2];

  	//Use `for` loops to copy the scores below
    for (int i = 0; i < newScores.length; i++) {
      for (int j = 0; j < newScores[i].length; j++)  {
        newScores[i][j] = scores[i][j];
      }
    }

  	System.out.println(Arrays.deepToString(newScores));

    for (int i = 0; i < newScores.length; i++) {
      for (int j = 0; j < newScores[i].length; j++)  {
        if (newScores[i][j] < 90) {
          newScores[i][j] += 2;
        }
      }
    }
    System.out.println(Arrays.deepToString(newScores));

  }

}
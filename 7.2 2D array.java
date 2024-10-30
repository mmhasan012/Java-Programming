A 2D array in Java is an array of arrays, essentially a matrix, where data is stored in rows and columns. Here's how you can declare, initialize, and use a 2D array in Java:

Declaring a 2D Array
java
Copy code
int[][] arrayName;
Initializing a 2D Array
There are multiple ways to initialize a 2D array:

Static Initialization:

java
Copy code
int[][] arrayName = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Dynamic Initialization:

java
Copy code
int[][] arrayName = new int[3][3]; // 3x3 matrix
arrayName[0][0] = 1;
arrayName[0][1] = 2;
arrayName[0][2] = 3;
arrayName[1][0] = 4;
arrayName[1][1] = 5;
arrayName[1][2] = 6;
arrayName[2][0] = 7;
arrayName[2][1] = 8;
arrayName[2][2] = 9;
Example Program Using a 2D Array
Here's an example program that declares, initializes, and prints a 2D array:

java
Copy code
public class TwoDArrayExample {
    public static void main(String[] args) {
        // Static initialization of a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Dynamic initialization of a 2D array
        int[][] dynamicMatrix = new int[3][3];
        dynamicMatrix[0][0] = 1;
        dynamicMatrix[0][1] = 2;
        dynamicMatrix[0][2] = 3;
        dynamicMatrix[1][0] = 4;
        dynamicMatrix[1][1] = 5;
        dynamicMatrix[1][2] = 6;
        dynamicMatrix[2][0] = 7;
        dynamicMatrix[2][1] = 8;
        dynamicMatrix[2][2] = 9;

        // Printing the dynamically initialized 2D array
        System.out.println("Dynamically Initialized 2D Array:");
        for (int i = 0; i < dynamicMatrix.length; i++) {
            for (int j = 0; j < dynamicMatrix[i].length; j++) {
                System.out.print(dynamicMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Output
mathematica
Copy code
2D Array:
1 2 3
4 5 6
7 8 9
Dynamically Initialized 2D Array:
1 2 3
4 5 6
7 8 9
Key Points:
Declaration: int[][] matrix; declares a 2D array variable.
Static Initialization: You can directly initialize the array with values at the time of declaration.
Dynamic Initialization: You can create an empty array with a specified size and then assign values later.
Accessing Elements: Elements are accessed using two indices, the row index and the column index, e.g., matrix[0][1].
Looping Through a 2D Array: Nested loops are commonly used to traverse and process each element in a 2D array.
This example demonstrates how to work with 2D arrays in Java, including both static and dynamic initialization methods, as well as how to access and print the elements of a 2D array.








/*
A 2D array in Java is an array of arrays, essentially a matrix, where data is stored in rows and columns.
Here's how you can declare, initialize, and use a 2D array in Java:

Declaring a 2D Array
 //code
int[][] arrayName;
Initializing a 2D Array
There are multiple ways to initialize a 2D array:
Static Initialization:


 code
int[][] arrayName = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Dynamic Initialization:
code
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
*/
//code
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

/*    
***Key Points:

Declaration: int[][] matrix; declares a 2D array variable.
Static Initialization: You can directly initialize the array with values at the time of declaration.
Dynamic Initialization: You can create an empty array with a specified size and then assign values later.
Accessing Elements: Elements are accessed using two indices, the row index and the column index, e.g., matrix[0][1].
Looping Through a 2D Array: Nested loops are commonly used to traverse and process each element in a 2D array.
This example demonstrates how to work with 2D arrays in Java, including both static and dynamic initialization methods,
    as well as how to access and print the elements of a 2D array.

*/
//taking matrix "a" as an input from user and print:
 
import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int[][] a =new int[2][3];
        
        
        System.out.println("Enter the matrix :");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("["+row+"]"+"["+col+"] :");
                a[row][col]=sc.nextInt();
            }
        }
        System.out.println("The matrix a is:"  );
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }        
    }
}

//take a,b input matrix [2][3] from user;and print the both matrix and sum:
import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int[][] a =new int[2][3];
        int[][] b =new int[2][3];
        int[][] c =new int[2][3];
        System.out.println("Enter the matrix a:");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("["+row+"]"+"["+col+"]:");
                a[row][col]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the matrix b:");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("["+row+"]"+"["+col+"] :");
                b[row][col]=sc.nextInt();
            }
        }
        
        System.out.println("The matrix a is :");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+ a[row][col]);
                
            }
            System.out.println();
        }
        
        System.out.println("The matrix b is :");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+ b[row][col]);
                
            }
            System.out.println();
        }
        System.out.println("The sum of matrix a and b is:");
       for(int row=0;row<2;row++){
           for(int col=0;col<3;col++){
                c[row][col]=a[row][col]+b[row][col];
                System.out.print(" "+c[row][col] );
           }
           System.out.println();
           
       }
        
    }
}

/*
Maximum Element In Each Row
Write a program to find the maximum element in each row of the matrix.
Input Format:
The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n,
 the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order,
 first row first, then second row and so on. Assume that the maximum value of m and n is 10.
Output Format:
Refer sample output for details.
Sample Input 1:
3
2
4 5
6 9
0 3
Sample Output 1:
5
9
3
*/

//code:
import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows number:");
        int m=sc.nextInt();
        System.out.println("Enter the coloumn number:");
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("[" +i +"]" +"[" +j+"] :");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+ a[i][j]);
            }
            System.out.println();
            
        }
        for(int i=0;i<m;i++){
            int max = a[i][0];
            for(int j=1;j<n;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
                
            }
            System.out.println(max);
        }
        
    }
}

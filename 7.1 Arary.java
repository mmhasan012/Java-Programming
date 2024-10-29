/*
In Java, an array is a data structure that stores a fixed-size sequential collection of elements of the same type. 
It's useful when you know the number of elements in advance and need to store multiple values in one variable.

###Key Points
Arrays have a fixed size, defined when created.
They store elements of the same data type.
Ordered.
The index(Subscript) of an array starts from 0.
Index can't be negative.
Java arrays are objects; the array variable stores a reference to the location in memory where the elements are stored.


#Declaring an Array:
To declare an array, specify the data type and the array name, followed by square brackets [].

 code:
// Syntax
dataType[] arrayName;
// Example
int[] numbers;

#Initializing an Array
Initialize an array by specifying the number of elements (size) or by directly providing values.
Using new keyword with size:

code:
int[] numbers = new int[5]; // array of 5 integers, initialized to 0 by default;new operator used for array creation;
In java for non premative data types as like -Array,List,Class etc the "new" operator is used;

Directly assigning values:
code:
int[] numbers = {1, 2, 3, 4, 5};

#Accessing Array Elements
Array elements are accessed using the index, starting from 0.
code:
int firstNumber = numbers[0]; // Access the first element
numbers[2] = 10;              // Modify the third element
Array Example
Here's a simple example of declaring, initializing, and accessing an array.
code:
 */ 



class arrayEx {
    public static void main(String[] args) {
        int n[]={11,22,33,44};
        for(int i=0;i<n.length;i++){
            
        
        System.out.println(n[i]);
        }
    }
}



public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access elements
        System.out.println("First Element: " + numbers[0]);

        // Modify elements
        numbers[1] = 10;
        System.out.println("Second Element after modification: " + numbers[1]);

        // Loop through the array
        System.out.print("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
/*
Find max element from an 1D array.

*/
//code:
class HelloWorld {
    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 6, 8, 2, 5};
 int res = array[0];

 for ( int index=0; index < array.length; index++ )
 {
     if ( array[ index ] > res )
         res = array[ index ];
 }
 System.out.println( res );//output:8
    }
}







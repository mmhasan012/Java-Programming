/*
In Java, an array is a data structure that stores a fixed-size sequential collection of elements of the same type. 
It's useful when you know the number of elements in advance and need to store multiple values in one variable.
###Key Points
Arrays have a fixed size, defined when created.
They store elements of the same data type.
Ordered.
The index of an array starts from 0.
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
int[] numbers = new int[5]; // array of 5 integers, initialized to 0 by default
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






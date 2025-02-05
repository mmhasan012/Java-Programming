/*
In Java, an array is a data structure that stores a fixed-size sequential collection of elements of the same type. 
It's useful when you know the number of elements in advance and need to store multiple values in one variable.

###Key Points
Arrays have a fixed size, defined when created.
They store elements of the same data type.
Ordered.
The index(Subscript) of an array starts from 0.
Index can't be negative.
Array index size can be more compare elements but not less than elements number;
If Array size is less than array elements then "ArrayOutOfBoud" exception will be throw.
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

//Find max element from an 1D array.
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

//sum of array from user input;size:5
//code:

import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        int sum=0;
        System.out.println("Enter the numbers :");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();//input:1 1 1 1 1
            
        }
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            
        }
        System.out.println(sum);//output:5
    }
    
}
//sum,average,maximum,minimum of the array from user input;size:from user input
//code:

import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        int sum=0;
        System.out.println("Enter the numbers :");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            
        }
        for(int i=0;i<num.length;i++){
            sum+=num[i];

        }
        double avg= (double)sum /num.length;

        System.out.println(avg);
    }
    
}

//Accending order from an Array 
import java.util.*;
public class  Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements in Array ?");

        int n=sc.nextInt();
        System.out.println("Enter the numbers");
        int num[] =new int[n];
        
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            
        }
        Arrays.sort(num);
        System.out.println("Sorted array is : "+Arrays.toString(num));
        
    }
}

//Ascending and descending oder array using Wrapper class Also.
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            
        }
        Arrays.sort(num);
        System.out.print("Ascending Order :");
        for(int i=0;i<num.length;i++){
            System.out.print(" " +num[i]);
        }
        System.out.println();
        System.out.println("Ascending Order :" +  Arrays.toString(num));
        
        System.out.print("Descending Order :");
        
        for(int i=n-1;i>=0;i--){
            System.out.print(" " +num[i]);
        }
                // Convert to Integer array
        Integer[] integerArray = new Integer[num.length];
        for (int i = 0; i < num.length; i++) {
            integerArray[i] = num[i];
        }

        // Sort in descending order
        Arrays.sort(integerArray, Collections.reverseOrder());

        // Print the sorted array
        System.out.println();
        System.out.println("Descending order: " + Arrays.toString(integerArray));
    }
}
/*
 output:
Enter number of elements:
4

3 6 2 1
Ascending Order : 1 2 3 6
Ascending Order :[1, 2, 3, 6]
Descending Order : 6 3 2 1
Descending order: [6, 3, 2, 1]

 */
 //Finding Next greater element in an Array
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements?");
        int n=sc.nextInt();
        int[] num=new int[n];
        int[] result=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            result[i]=-1;
            for(int j=i+1;j<num.length;j++){
                if(num[j]>num[i]){
                    result[i]=num[j];
                    break;
                }
            }
            
        }
        for(int i:result){
            System.out.println(i);
        }
        
    }
}
/*
output:
How many elements?
5
1 6 3 99 2
6
99
99
-1
-1

*/


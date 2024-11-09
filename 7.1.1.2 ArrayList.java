/*
ArrayList is a resizable array implementation of the List interface in Java, part of the java.util package.
It provides a dynamic array that can grow as needed, unlike standard arrays in Java which have a fixed size. 
Here are some key features and basic usage examples of ArrayList:

Key Features:
Resizable: Automatically grows and shrinks as elements are added or removed.
Ordered: Maintains the order of insertion.
Indexed: Allows random access via indices, similar to arrays.
Null Elements: Can store null elements.
Not Synchronized: Not thread-safe by default. Use Collections.synchronizedList() for thread-safe operations.

difference between Array & ArrayList:
In Java, both arrays and ArrayList are used to store elements,
but they have significant differences in their usage, behavior, and features. Here's a detailed comparison between arrays and ArrayList:

1. Size and Resizing
Array: Fixed size. The size is specified at the time of declaration and cannot be changed.

Copy :
int[] array = new int[10]; // Array of fixed size 10
ArrayList: Dynamic size. It can grow and shrink automatically as elements are added or removed.

Copy:
ArrayList<Integer> arrayList = new ArrayList<>(); // Initial size is 0, but it can grow as needed
2. Type of Elements
Array: Can store both primitive types (like int, char, etc.) and objects.
code:
int[] intArray = new int[10]; // Array of primitives
String[] stringArray = new String[10]; // Array of objects
ArrayList: Can only store objects. For primitive types, you need to use their wrapper classes (like Integer, Character, etc.).

code:
ArrayList<Integer> arrayList = new ArrayList<>(); // ArrayList of objects
3. Syntax and Declaration
Array: Declared using square brackets.

code:
int[] array = new int[10];
ArrayList: Declared using the ArrayList class.

code:
ArrayList<Integer> arrayList = new ArrayList<>();

4. Performance
Array: Faster in terms of accessing and iterating over elements due to lower-level operations.
code:
int value = array[0]; // Accessing element
ArrayList: Slightly slower compared to arrays due to additional method calls and dynamic resizing.

code:
int value = arrayList.get(0); // Accessing element

5. Memory Efficiency
Array: More memory-efficient as it stores elements directly.
ArrayList: Less memory-efficient due to the overhead of maintaining dynamic array and additional methods.

6. Flexibility
Array: Less flexible. Once created, its size cannot be changed.
ArrayList: More flexible. It can grow and shrink dynamically as needed.

7. Utility Methods
Array: Does not provide utility methods like add, remove, etc. You need to manually handle these operations.
code:
array[0] = 10; // Adding an element
ArrayList: Provides a rich set of methods like add, remove, contains, etc.
code:
arrayList.add(10); // Adding an element

8. Type Safety
Array: Type-safe. Once declared, it can only hold elements of the specified type.
code:
int[] array = new int[10];
ArrayList: Type-safe with generics. It can hold elements of the specified type parameter.
code:
ArrayList<Integer> arrayList = new ArrayList<>();

9. Multidimensional
Array: Supports multidimensional arrays (e.g., 2D arrays).
code:
int[][] matrix = new int[3][3];
ArrayList: Can be used to create lists of lists for similar functionality but requires more code.
code:
ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

10. Initialization
Array: Can be initialized at the time of declaration.
 code:
int[] array = {1, 2, 3, 4, 5};
ArrayList: Requires elements to be added individually or using a collection.
code:
ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
*/
//Example Comparison:
//Array Example:
 //code:
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[5]; // Fixed size array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        
        for (int i : array) {
            System.out.println(i);
        }
    }
}
ArrayList Example:
java
Copy code
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // Dynamic size
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}

//All operation of ArrayList

import java.util.*;
class Main{
    public static void main(String[]s){
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(3,4);//index:3 & data:4
        
        
        System.out.println("ArrayList Size is :");//output:4
        System.out.println(num.size());//output:4
        System.out.println("Numbers are :");
        for(int x:num){
            System.out.print(" " +x);//output:1 2 3 4
        }
        System.out.println();
        num.add(2,1);//data will allocate in index 2;previous data will not deleted;that's will shift in next right index
        System.out.println("After data allocation inside arraylist :");
        for(int x:num){
            System.out.print(" " +x);//output:1 2 1 3 4
        }
        System.out.println();
        
        num.remove(0);//'0'is index number
        System.out.println("After remove specific data:");
        for(int x:num){
            System.out.print(" " +x);//output:2 1 3 4
        }
        System.out.println();
        //print specific index value
        System.out.println("Index '0' Data :" +num.get(0));//o/p:2
        System.out.println();
        
        //replace data
        num.set(2,5);
        System.out.println("After replace the Index'2' data :");
        for(int x:num){
            System.out.print(" " +x);//output:2 1 3 4
        }
        System.out.println();
        //check the specific element is avoilable or not
        boolean has_2=num.contains(2);
        System.out.println("Data '2' available :" +has_2);
        boolean has_100=num.contains(100);
        System.out.println("Data '100' available :" +has_100);
        System.out.println();
        
        boolean check=num.isEmpty();
        System.out.println("ArrayList is empty :" +check );
        System.out.println();
        
        num.clear();
        System.out.print("ArrayList elements are : " );
        for(int x:num){
        System.out.print(" " +x);
        }

    }
}

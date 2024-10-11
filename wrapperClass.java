/*
In Java, a wrapper class is an object representation of a primitive data type.
 Java provides wrapper classes for each of the eight primitive 
 data types, allowing them to be used in situations where objects are required, 
 such as in collections or for synchronization. The wrapper classes in Java are:

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boole
Key Features of Wrapper Classes:
Immutability: Wrapper class objects are immutable,
 meaning once they are created, their values cannot be changed.

Utility Methods: Wrapper classes provide a number of utility methods.
 For example, Integer.parseInt() converts a string to an integer.

Object Methods: Since wrapper classes are objects,
 they can be used to invoke methods defined in the Object class,
  such as toString(), equals(), and hashCode()

  Autoboxing and Unboxing:

Autoboxing: The automatic conversion of a primitive type to its corresponding wrapper class. For example, converting an int to an Integer.
java
Copy code
int num = 5;
Integer numObj = num; // Autoboxing
Unboxing: The automatic conversion of a wrapper class back to its corresponding primitive type. For example, converting an Integer to an int.
java
Copy code
Integer numObj = 5;
int num = numObj; // Unboxing
 */

public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: Converting a primitive to a wrapper object
        Integer intObj = 10;
        // Unboxing: Converting a wrapper object to a primitive
        int intPrimitive = intObj;
        
        // Using a utility method from the wrapper class
        String str = "123";
        int parsedInt = Integer.parseInt(str);
        
        System.out.println("Integer Object: " + intObj);
        System.out.println("Primitive int: " + intPrimitive);
        System.out.println("Parsed int from String: " + parsedInt);
    }
}


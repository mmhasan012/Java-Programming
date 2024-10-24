/*
  In Java, data types are divided into two main categories:

Primitive Data Types
Reference Data Types
1. Primitive Data Types
Primitive data types are the most basic data types available 
within the Java language. There are eight primitive data types, 
each of which is predefined by the language and named by a reserved keyword.

byte:Size: 8-bit
Range: -128 to 127
Example: byte b = 100;
short:Size: 16-bit
Range: -32,768 to 32,767
Example: short s = 10000;
int:Size: 32-bit
Range: -2^31 to 2^31 - 1
Example: int i = 100000;
long:Size: 64-bit
Range: -2^63 to 2^63 - 1
Example: long l = 100000L;
float:Size: 32-bit
Single-precision floating point
Example: float f = 234.5f;
double:Size: 64-bit
Double-precision floating point
Example: double d = 123.4;
boolean:Size: not precisely defined
Values: true or false
Example: boolean b = true;
char:Size: 16-bit
Range: '\u0000' (or 0) to '\uffff' (or 65,535)
Example: char c = 'A';


2. Reference Data Types
Reference data types are objects that are created using
 defined constructors of the classes. They are used to access objects and
  store the address of the object in the variable. Reference types can be 
  user-defined (like classes, interfaces) or provided by Java libraries (like arrays, strings).

Classes:

Example: String s = "Hello";
Interfaces:

Example: Runnable r = new MyRunnable();
Arrays:

Example: int[] arr = new int[5];
Enumerations (Enums):

Example: enum Color { RED, GREEN, BLUE };
 */

public class dataTypes {
    public static void main(String[] args) {
        // Primitive data types
byte byteVar = 10;
short shortVar = 200;
int intVar = 1000;
long longVar = 100000L; //
float floatVar = 20.5f; //
double doubleVar = 123.456;
boolean booleanVar = true;
char charVar = 'A';

// Reference data types
String stringVar = "Hello, World!";
int[] arrayVar = {1, 2, 3, 4, 5};

// Print the values
System.out.println("byte : " + byteVar);
System.out.println("short : " + shortVar);
System.out.println("int : " + intVar);
System.out.println("long : " + longVar);
System.out.println("float : " + floatVar);
System.out.println("double : " + doubleVar);
System.out.println("boolean : " + booleanVar);
System.out.println("char : " + charVar);
System.out.println("String: " + stringVar);
System.out.println("Array:");
for(int i : arrayVar){
    //System.out.println(i + " ");
    System.out.print(i + " ");

}
    }
}

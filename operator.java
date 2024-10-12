/*
In Java, operators are special symbols that perform operations on variables and values. Java provides a rich set of operators to manipulate variables. Operators in Java can be classified into several categories:

Arithmetic Operators
Unary Operators
Relational Operators
Logical Operators
Bitwise Operators
Assignment Operators
Conditional (Ternary) Operator
Instanceof Operator

    
1. Arithmetic Operators
Arithmetic operators are used to perform basic mathematical operations.

+ Addition: Adds two values.
- Subtraction: Subtracts one value from another.
* Multiplication: Multiplies two values.
/ Division: Divides one value by another.
% Modulus: Returns the remainder of a division operation.

    
Example
public class operator {
    public static void main(String[] args) {
        
    
    int a = 10;
int b = 5;
System.out.println("a + b = " + (a + b)); // 15
System.out.println("a - b = " + (a - b)); // 5
System.out.println("a * b = " + (a * b)); // 50
System.out.println("a / b = " + (a / b)); // 2
System.out.println("a % b = " + (a % b)); // 0

}
}
/*
2. Unary Operators
Unary operators are used with only one operand.

+ Unary plus: Indicates a positive value (usually optional).
- Unary minus: Negates an expression.
++ Increment: Increases a value by one.
-- Decrement: Decreases a value by one.
! Logical complement: Inverts the value of a boolean.
    */
Example
int x = 10;
System.out.println("x = " + x);       // 10
System.out.println("++x = " + ++x);   // 11 (pre-increment)
System.out.println("x++ = " + x++);   // 11 (post-increment, prints before increment)
System.out.println("x = " + x);       // 12
System.out.println("--x = " + --x);   // 11 (pre-decrement)
System.out.println("x-- = " + x--);   // 11 (post-decrement, prints before decrement)
System.out.println("x = " + x);       // 10
System.out.println("!true = " + !true); // false




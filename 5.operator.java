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
System.out.println("x-- = " + x--);   // 11 (post-decrement, prints before decrement)
System.out.println("x = " + x);       // 10
System.out.println("!true = " + !true); // false


/*
3. Relational Operators
Relational operators are used to compare two values.

== Equal to
!= Not equal to
> Greater than
< Less than
>= Greater than or equal to
<= Less than or equal to
Exaple
*/
//Example
int a = 10;
int b = 5;
System.out.println("a == b: " + (a == b)); // false
System.out.println("a != b: " + (a != b)); // true
System.out.println("a > b: " + (a > b));   // true
System.out.println("a < b: " + (a < b));   // false
System.out.println("a >= b: " + (a >= b)); // true
System.out.println("a <= b: " + (a <= b)); // false

/*
4. Logical Operators
Logical operators are used to combine multiple boolean expressions.

&& Logical AND: Returns true if both operands are true.
|| Logical OR: Returns true if at least one operand is true.
! Logical NOT: Inverts the value of a boolean.

*/
//Example
boolean x = true;
boolean y = false;
System.out.println("x && y: " + (x && y)); // false
System.out.println("x || y: " + (x || y)); // true
System.out.println("!x: " + !x);           // false


/*
5. Bitwise Operators
Bitwise operators perform operations on individual bits of integer types.

& Bitwise AND
| Bitwise OR
^ Bitwise XOR
~ Bitwise Complement
<< Left Shift
>> Right Shift
>>> Unsigned Right Shift

*/

//Example
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary
System.out.println("a & b: " + (a & b)); // 1  (0001 in binary)
System.out.println("a | b: " + (a | b)); // 7  (0111 in binary)
System.out.println("a ^ b: " + (a ^ b)); // 6  (0110 in binary)
System.out.println("~a: " + ~a);         // -6 (inverts all bits)
System.out.println("a << 1: " + (a << 1)); // 10 (1010 in binary)
System.out.println("a >> 1: " + (a >> 1)); // 2  (0010 in binary)
System.out.println("a >>> 1: " + (a >>> 1)); // 2 (unsigned right shift)



/*
6. Assignment Operators
Assignment operators are used to assign values to variables.

= Simple assignment
+= Add and assign
-= Subtract and assign
*= Multiply and assign
/= Divide and assign
%= Modulus and assign
&= Bitwise AND and assign
|= Bitwise OR and assign
^= Bitwise XOR and assign
<<= Left shift and assign
>>= Right shift and assign
>>>= Unsigned right shift and assign
*/
//Example
int a = 10;
a += 5;  // a = a + 5
System.out.println("a += 5: " + a); // 15
a -= 3;  // a = a - 3
System.out.println("a -= 3: " + a); // 12
a *= 2;  // a = a * 2
System.out.println("a *= 2: " + a); // 24
a /= 4;  // a = a / 4
System.out.println("a /= 4: " + a); // 6
a %= 3;  // a = a % 3
System.out.println("a %= 3: " + a); // 0




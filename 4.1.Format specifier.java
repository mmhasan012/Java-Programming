/*

In Java, format specifiers are used in methods like printf, format, and String.format to format strings. Format specifiers start with a % character and are followed by optional flags, width, precision, and a conversion character that indicates the type of value being formatted.

Here's a detailed breakdown of the format specifiers in Java:

Common Format Specifiers
Integer Types:

%d : Decimal integer
%o : Octal integer
%x : Hexadecimal integer
%X : Hexadecimal integer (uppercase)
Floating-Point Types:

%f : Decimal floating point
%e : Scientific notation (lowercase)
%E : Scientific notation (uppercase)
%g : Computer's choice of %f or %e (whichever is shorter)
%G : Computer's choice of %f or %E (whichever is shorter)
Character Types:

%c : Character
%C : Character (uppercase)
String Types:

%s : String
%S : String (uppercase)
Boolean Types:

%b : Boolean value
%B : Boolean value (uppercase)
Other Types:

%n : Platform-specific newline
%% : Literal % character
Flags
Flags are optional and can modify the output. They are placed between the % and the conversion character.

- : Left-justify within the given field width.
+ : Include a sign (+ or -) with numeric values.
0 : Pad numeric values with leading zeros.
, : Use a locale-specific grouping separator (e.g., comma for thousands).
( : Enclose negative numbers in parentheses.
Width and Precision
Width: Minimum number of characters to be printed. If the value is shorter than the width, it will be padded.
Precision: Number of digits after the decimal point for floating-point numbers or maximum number of characters for strings.

*/
//code:

public class FormatSpecifiersExample {
    public static void main(String[] args) {
        int intVar = 42;
        double doubleVar = 123.456789;
        char charVar = 'A';
        String stringVar = "Hello, World!";
        boolean booleanVar = true;

        // Integer
        System.out.printf("Integer (%%d): %d%n", intVar);             // Decimal integer
        System.out.printf("Integer (%%o): %o%n", intVar);             // Octal integer
        System.out.printf("Integer (%%x): %x%n", intVar);             // Hexadecimal integer
        System.out.printf("Integer (%%X): %X%n", intVar);             // Hexadecimal integer (uppercase)

        // Floating-point
        System.out.printf("Float (%%f): %.2f%n", doubleVar);          // Decimal floating point
        System.out.printf("Float (%%e): %e%n", doubleVar);            // Scientific notation
        System.out.printf("Float (%%E): %E%n", doubleVar);            // Scientific notation (uppercase)
        System.out.printf("Float (%%g): %g%n", doubleVar);            // Computer's choice
        System.out.printf("Float (%%G): %G%n", doubleVar);            // Computer's choice (uppercase)

        // Character
        System.out.printf("Character (%%c): %c%n", charVar);          // Character

        // String
        System.out.printf("String (%%s): %s%n", stringVar);           // String

        // Boolean
        System.out.printf("Boolean (%%b): %b%n", booleanVar);         // Boolean value

        // Other
        System.out.printf("Percentage (%%%%): %% %n");                // Literal % character
        System.out.printf("Newline (%%n): Hello%nWorld%n");           // Platform-specific newline

        // Width and precision
        System.out.printf("Width (10): %10d%n", intVar);              // Width example
        System.out.printf("Precision (%%.2f): %.2f%n", doubleVar);    // Precision example
        System.out.printf("Width & Precision (10.2f): %10.2f%n", doubleVar); // Width and precision
        System.out.printf("Left-justify (%%-10d): %-10d end%n", intVar); // Left-justify

        // Flags
        System.out.printf("With sign (%%+d): %+d%n", intVar);         // Include sign
        System.out.printf("Leading zeros (%%010d): %010d%n", intVar); // Pad with zeros
        System.out.printf("Grouping (%%,d): %,d%n", 1000000);         // Use grouping separator
    }
}


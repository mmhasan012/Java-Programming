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

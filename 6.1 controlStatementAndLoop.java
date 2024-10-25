/*
Control statements in Java are used to control the flow of execution of the program based on 
  certain conditions or the occurrence of specific events. They can be broadly categorized into three types:
1.decision-making statements, 
2.looping statements, and 
3.branching statements.
  Here’s an overview of each:

1. Decision-Making Statements
if statement
Evaluates a condition and executes a block of code if the condition is true.
  */
//Syntax of if statement
if (condition) {
    // Code to execute if condition is true
}



//if-else statement
//Provides an alternative block of code if the condition is false.
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}


//if-else-if ladder
//Checks multiple conditions in sequence.

if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition2 is true
} else {
    // Code to execute if none of the above conditions are true
}



//switch statement
//Selects one of many code blocks to be executed.
switch (expression) {
    case value1:
        // Code to execute if expression == value1
        break;
    case value2:
        // Code to execute if expression == value2
        break;
    // More cases...
    default:
        // Code to execute if expression doesn't match any case
}



2. Looping Statements
for loop
Repeats a block of code a specific number of times.
for (initialization; condition; update) {
    // Code to be executed
}


while loop
Repeats a block of code as long as a condition is true.
while (condition) {
    // Code to be executed
}


do-while loop
Similar to the while loop, but the condition is evaluated after the block of code is executed.
do {
    // Code to be executed
} while (condition);



3. Branching Statements
break statement
Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch.
break;


continue statement
Skips the current iteration of a loop and proceeds to the next iteration.
continue;


return statement
Exits from the current method and optionally returns a value.
return value; // Optional

//Examples
//if-else Example

int number = 10;
if (number > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Non-positive number");
}


//for loop Example
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

//switch Example
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Another day");
}

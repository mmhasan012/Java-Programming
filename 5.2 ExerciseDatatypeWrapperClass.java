/*
Dinesh also joined the group of 3 idiots and now their group is called Four Seasoners.

Meanwhile, Binoy has moved to a new house in the same locality. Now the houses of Ajay, Binoy, and Chandru are located in the shape of a triangle. Dinesh also has moved to a house in the same locality.

When Ajay asked Dinesh about the location of his house , Dinesh said that his house is at the centroid point of the houses of the other 3. Though Ajay was good in Mathematics, he was puzzled. Can you please help Ajay out?

Given the 3 vertices {(x1,y1), (x2,y2) and (x3,y3)} of a triangle, write a program to determine the point which is the centroid of the 3 vertices.

Input Format:

Input consists of 6 integers. The first integer corresponds to x1. The second integer corresponds to y1. The third and fourth integers correspond to x2 and y2 respectively. The fifth and sixth integers correspond to x3 and y3 respectively.

Output Format:

Refer Sample Input and Output for exact formatting specifications.

[All floating point values are displayed, correct to 1 decimal place]


Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

X1

2

Y1

4

X2

10

Y2

15

X3

5

Y3

8

Dinesh's house is located at (5.7,9.0)
*/

//code:
   import java.util.*;

   public class Main{
       public static void main(String[]s){

           Scanner sc= new Scanner(System.in);
           System.out.println("X1");
           int x1=sc.nextInt();
            System.out.println("Y1");
           int y1=sc.nextInt();

            System.out.println("X2");
           int x2=sc.nextInt();
            System.out.println("Y2");
           int y2=sc.nextInt();

            System.out.println("X3");
           int x3=sc.nextInt();
            System.out.println("Y3");
           int y3=sc.nextInt();

           float x =(x1+x2+x3)/3f;
           float y =(y1+y2+y3)/3f;

           System.out.printf("Dinesh's house is located at (%.1f,%.1f)",x,y);

           
       }
   }



/*
Nikhil, the founder of “Pine Tree” company wished to design an Event Management System that would let its Customers plan and host events seamlessly via an online platform.

As a part of this requirement, Nikhil wanted to write a piece of code for his company’s Amphi Event Management System that will display customized welcome messages by taking Customers’ name as input. Help Nikhil on the task.

Input Format:
First line of the input is a string that corresponds to a Customer’s name. Assume that the maximum length of the string is 50.

Output Format:
Output should display the welcome message along with the Customer’s name.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter your name
Beena
Hello Beena ! Welcome to Amphi Event Management System
*/
//code:

import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            

            Scanner sc =new Scanner (System.in);
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Hello " + name + " ! Welcome to Amphi Event Management System");

        
     }
}

/*
"Pine Tree" Company has signed up a big time Event Management deal from the Rotary Youth Club for a Trade Fair organized at Codissia Complex, wherein all startup companies in the Software industry are demonstrating their latest products and services and meet with industry partners and Customers.

Amphi Event Management System has to be modified to write a piece of code that will get the input of the number of events to be hosted for the Fair at Codissia from its users and display the same. Help the company to accomplish the requirement.

Input Format:
First line of the input is an integer that corresponds to the number of events to be hosted at Codissia.

Output Format:
Output should display the number of events to be hosted at Codissia.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the number of events hosted in Codissia
50
Number of events hosted in Codissia is 50
*/
//code:
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of events hosted in Codissia");
        int numberOfEvents = sc.nextInt();
        System.out.println("Number of events hosted in Codissia is " +numberOfEvents);
      
            
        
     }
}

/*
Be it a last minute get together, a birthday party or corporate events, the "Pine Tree" Event Management Company helps you plan and execute it better and faster. Nikhil, the founder of the company wanted the Amphi Event Management System to get and display the event details from his Customers for every new order of the Company.

Write a program that will get the input of the event details like name of the event, type of the event, number of people expected, a string value (Y/N) telling whether the event is going to be a paid entry and the projected expenses (in lakhs) for the event. The program should then display the input values as a formatted output.

Input Format:
First input is a string that corresponds to the name of the event. Assume the maximum length of the string as 50.
Second input is a string that corresponds to the type of the event. Assume the maximum length of the string as 50.
Third input is an integer that corresponds to the number of people expected for the event.
Fourth input is a character that corresponds to Y/N telling whether the event is going to be a paid entry or not.
Fifth input is a double value that corresponds to the projected expenses (in lakhs) for the event.

Output Format:
Output should display the event details as given in the sample output.
All double values need to be displayed correct to 1 decimal place
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the name of the event
Food Fest 2017
Enter the type of the event
Public
Enter the number of people expected
5000
Is it a paid entry? (Type Y or N)
N
Enter the projected expenses (in lakhs) for this event
5.7
Event Name : Food Fest 2017
Event Type : Public
Expected Count : 5000
Paid Entry : N
Projected Expense : 5.7L
*/
//code:

   import java.util.*;
class Main {
    public static void main(String[] args) {
        
            Scanner sc = new  Scanner (System.in);
            System.out.println("Enter the name of the event");
            String eventName=sc.nextLine();

            System.out.println("Enter the type of the event");
            String eventType =sc.nextLine();

            System.out.println("Enter the number of people expected");
            int numberOfPeopleExpected =sc.nextInt();

            System.out.println("Is it a paid entry? (Type Y or N)");
            char type =sc.next().charAt(0);

            System.out.println("Enter the projected expenses (in lakhs) for this event");
            float projectedExpenses = sc.nextFloat();

            System.out.println("Event Name : "+eventName);
            System.out.println("Event Type : "+eventType);
            System.out.println("Expected Count : "+numberOfPeopleExpected);            
            System.out.println("Paid Entry : "+type);
            System.out.printf("Projected Expense : %.1fL",projectedExpenses);       
     }
}

/*
Neerja Banhot was the head of the all Indian cabin crew in the Pan Am 73 flight.
Neerja made sure that everything inside the flight was fine. She noticed that the date being displayed inside the flight was in the Indian date format.

Since it was an international flight it had to be in the International date format. Given the date, month and year can you print it in the correct format.
Input Format:
The first line is an integer that corresponds to the day number.
The second line is an integer that corresponds to the month number.
The third line is an integer that corresponds to the year.
Output Format:
The Output should display the date in a single line separated by slashes in the international format.

Sample Input 1:
5
9
1986
Sample Output 1:
1986/9/5
*/
//code:
import java.util.*;
class Main{

    public static void main(String[]S){

        Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();

        System.out.println(+year+"/"+month+"/"+day);

    } 
}
/* 
Wrapper Class – 1

Write a Java program to print the following static values defined in the Float Wrapper Class
Maximum exponent a float can hold
Maximum value a float can hold
Number of bits used to represent a float value

 Input and Output Format:
There is no input to this program.
Refer sample output for formatting specifications.
 Sample Output:
Maximum exponent :127
Maximum value :3.4028235E38
Number of bits :32
*/
//code:

public class Main {

	public static void main(String[] args) {
		
		int maxExponent=Float.MAX_EXPONENT;

		float maxValue= Float.MAX_VALUE;
	   int numOfBits=Float.SIZE; 

		System.out.println("Maximum exponent :"+ maxExponent);
		System.out.println("Maximum value :"+ maxValue);
		System.out.println("Number of bits :"+ numOfBits);

	}

}

/*     Wrapper Class – II       
Write a Java program to get an input long in binary form and to print the input value in decimal form (base 10) and in binary form.
Hint : Use the following method defined in the Integer class
parseLong(String s, int radix)

Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input:
101010

Sample Output:
Long value of 101010 is 42
*/
//code:
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc= new  Scanner(System.in);
		String binaryString =sc.nextLine();

		long decimalValue =Long.parseLong(binaryString,2);
		System.out.println("Long value of "+binaryString+ " is " +decimalValue);
		
	}

}
/*
Four Seasoners

Dinesh also joined the group of 3 idiots and now their group is called Four Seasoners.









Meanwhile, Binoy has moved to a new house in the same locality. Now the houses of Ajay, Binoy, and Chandru are located in the shape of a triangle. Dinesh also has moved to a house in the same locality.


When Ajay asked Dinesh about the location of his house , Dinesh said that his house is at the centroid point of the houses of the other 3. Though Ajay was good in Mathematics, he was puzzled. Can you please help Ajay out?

Given the 3 vertices {(x1,y1), (x2,y2) and (x3,y3)} of a triangle, write a program to determine the point which is the centroid of the 3 vertices.


Input Format:

Input consists of 6 integers. The first integer corresponds to x1. The second integer corresponds to y1. The third and fourth integers correspond to x2 and y2 respectively. The fifth and sixth integers correspond to x3 and y3 respectively.

Output Format:

Refer Sample Input and Output for exact formatting specifications.

[All floating point values are displayed, correct to 1 decimal place]

 

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output]

X1
2

Y1
4

X2
10

Y2
15

X3
5

Y3
8

Dinesh's house is located at (5.7,9.0)
*/
//code:
   import java.util.*;

   public class Main{
       public static void main(String[]s){

           Scanner sc= new Scanner(System.in);
           System.out.println("X1");
           int x1=sc.nextInt();
            System.out.println("Y1");
           int y1=sc.nextInt();
	       
            System.out.println("X2");
           int x2=sc.nextInt();
            System.out.println("Y2");
           int y2=sc.nextInt();

            System.out.println("X3");
           int x3=sc.nextInt();
            System.out.println("Y3");
           int y3=sc.nextInt();

           float x =(x1+x2+x3)/3f;
           float y =(y1+y2+y3)/3f;

           System.out.printf("Dinesh's house is located at (%.1f,%.1f)",x,y);
           
       }
   }

/*
Problem

Welcome Message – 5
Neerja Banhot was the head of the all Indian cabin crew in the Pan Am 73 flight. Neerja made sure that everything inside the flight was fine.
She wanted one of her crew members to welcome the passengers to the flight and announce the departure time.  So Neerja confirms the details of the 
flight number and the departure time (in 24 hrs format) with the pilot.
Given the flight number, the name of the air hostess and the departure time print the welcome message that her colleague has to say.

Input Format:
The first line is a integer that corresponds to the flight number.
The second line is a string that corresponds to the name of the air hostess.
The third line is a float corresponding to the departure time.
Output Format:
The Output should display the welcome message in a single line.
Print the time correct to two decimal points.

Sample Input 1:
PanAm73
Neerja
5.25
Sample Output 1:
Welcome to PanAm73. I am Neerja. Your flight would start at 5.25 Hrs.
*/
//code:


/*
Wrapper Class III

Write a Java program to get an input long in a certain radix or base and to print the integer value in the same radix or base.
Hint : Use the following method defined in the Integer class
parseLong(String s, int radix)
toString(long i, int radix)
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input and Output:
Enter the radix
8
Enter the integer value in radix 8
11
The input value in radix 8 is 11
*/

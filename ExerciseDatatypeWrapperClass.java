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

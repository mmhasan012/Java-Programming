/*
People on board

Pan Am 73 was ready to take off. But before the take off Neerja wanted to take a count of the total number of people inside the flight.
The cockpit crew consisted of the Pilot In Command, the Co-Pilot and the Radio Engineer. The cabin crew consisted of 15 crew members including Neerja.
Given the number of men, women and children on board find the total number of people on the aircraft.
Input Format:
The input consists of three integers M, W and C corresponding to the number of men, women and children.

Output Format:
The output should display an integer corresponding to the total number of people in the aircraft, in a single line.

Sample Input:
90
100
85
Sample Output:
293

*/
//code:
   import java.util.*;
   class Main{
       public static void main(String[]s){


           Scanner sc=new Scanner(System.in);
           int m=sc.nextInt();
            int w=sc.nextInt();
            int c=sc.nextInt();

            int sum=m+w+c+18;
            System.out.printf("%d",sum);



       }
   }
/*
Passenger Count
Pan Am 73 was ready to take off. But before the take off Neerja wanted to take a count of the total number of passengers on board. 
The cockpit crew consisted of the Pilot In Command, the Co-Pilot and the Radio Engineer.
The cabin crew consisted of 15 crew members including Neerja. Given the total number of people on the aircraft find the number of passengers.
Input Format:
The input consists of one integer T corresponding to the total number of people in the aircraft.

Output Format:
The output should display an integer corresponding to the total number of passengers in the aircraft, in a single line.
Sample Input:
293
Sample Output:
275
*/
//code:
   import java.util.*;
   class Main{
       public static void main(String[]s){
           Scanner sc=new Scanner(System.in);
           int total=sc.nextInt();
           int p=total-18;
           System.out.printf("%d",p);
       }
   }


/*
Number of seats

Pan Am 73 was ready to take off. Neerja was not sure of the total number of seats in the aircraft. 
The Aircraft had Re rows and Ce columns in the economic class and Rb rows and Cb columns in the business class.
Given these details calculate the number of seats in the aircraft.
Input Format:
The first line of the input consists of an integer corresponding to Re.
The second line consists of an integer corresponding to Ce.
The third line consists of an integer corresponding to Rb.
The fourth line consists of an integer corresponding to Cb.

Output Format:
The output should display an integer corresponding to the total number of seats in the aircraft, in a single line.

Sample Input:
40
10
20
15
Sample Output:
700
*/
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc =new Scanner(System.in);
        int re=sc.nextInt();
        int ce=sc.nextInt();
        int rb=sc.nextInt();
        int cb=sc.nextInt();

        int a=re*ce;
        int b=rb*cb;

        int totalSeat=a+b;
        System.out.printf("%d",totalSeat);
    }
}   


/* 

Percentage

 

Pan Am 73 was ready to take off. Neerja wanted to know the distribution of passengers in the economic class and the business class.

Economic Class

Business Class

Given the number of passengers in the business class Bc and economic class Ec, find the percentage of passengers in each class.

Input Format:
The first line of the input consists of an integer corresponding to Ec.
The second line consists of an integer corresponding to Bc.

Output Format:
Output should display in the first line, the floating point integer corresponding to the percentage of passengers travelling in the economic class.
The second line should display the floating point integer corresponding to the percentage of passengers travelling in the business class.
Round all floating point integers correct to two decimal places.

Sample Input:
450
150
Sample Output:
75.00
25.00

*/

//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);

        int ec=sc.nextInt();
        int bc=sc.nextInt();
        int total=ec+bc;

        float pctEC=((float)ec/total)*100;
         float pctBC=((float)bc/total)*100;

         System.out.printf("%.2f",pctEC);
         System.out.printf("%.2f",pctBC);

    }
}   

/*

Crew Members

Pan Am 73 was ready to take off. Neerja being the Flight Purser had the responsibility of assigning the cabin crew 
to each of the classes (Business and Economic) to ensure the passengers are safe and comfortable.
The number of cabin crew members assigned to a class depends on the number of passengers in that particular class.

Given the number of cabin crew members Nc, the number of people travelling in the business class Bc and 
the number of people travelling in the economic class Ec, find the number of crew members to be assigned to the business and economic classes.


Input Format:
The first line of the input consists of an integer corresponding to Nc.
The second line consists of an integer corresponding to Bc.
The third line consists of an integer corresponding to Ec.

Output Format:
Output should display in the first line, an integer corresponding to the number of crew members to be assinged to the business class.
The second line should display an integer corresponding to the number of crew members to be assinged to the economic class.

Sample Input:
10
100
400

Sample Output:
2
8
*/
//code:

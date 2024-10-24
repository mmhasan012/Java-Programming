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

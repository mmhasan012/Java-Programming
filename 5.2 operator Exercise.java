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
   import java.util.*;
   class Main{
       public static void main(String[]s){
           Scanner sc=new Scanner(System.in);

           int Nc =sc.nextInt();
            int Bc =sc.nextInt();
             int Ec =sc.nextInt();

             int totalP=Bc+Ec;

             int crewForBc=(int) Math.round((double) Bc/totalP*Nc);
             int crewForEc= Nc-crewForBc;


             System.out.println(crewForBc);
             System.out.println(crewForEc);

       }
   }


/*
Take off position

The entire Air crew was all set and Pan Am 73 was ready to take off.
The Pilot wanted to know the exact point on the run way from where the flight has to take off.
He knew from the GPS his current location (x1, y1) and the end point (x2, y2) of the runway. 
Usually aircrafts take off exactly from the mid-point of the runway.

Given x1,y1,x2 and y2 can you calculate the exact point from which the flight has to take off.
Input Format:
The first line of the input consists of the co-ordinates (x1, y1) where x1 and y1 are separated by spaces.
The second line consists of the co-ordinates (x2, y2) where x1 and y1 are separated by spaces.

Output Format:
Output should print the co-ordinates at the midpoint of the runway where the flight has to take off, separated by spaces.
Sample Input:
2 2
20 2
Sample Output:
11 2
*/
//code:
import java.util.*;
class Main{

    public static void main(String[]s){

        Scanner sc= new Scanner(System.in);
        int x1=sc.nextInt();
         int y1=sc.nextInt();
          int x2=sc.nextInt();
           int y2=sc.nextInt();

           int x=(x1+x2)/2;
           int y=(y1+y2)/2;

           System.out.printf("%d %d",x,y);
    }


}   
/*
Take off code

The entire Air crew was all set and Pan Am 73 was ready to take off. The Pilot had the engine running. The Pilot had to send a take off code to the aviation ground station. The pilot had various three digit number codes written in his notepad. The code is intrepreted as, the hundredth place referring to the priority, tenth place to the nature of the action and the unit's place referring to the action.



Given a three digit code number can you explain how does the pilot intrepret the same.

Input Format:

The input consists of an integer corresponding to the take off code.

Output Format:
The output should display the take off code in lines separately, in a way how it is intrepreted.
Refer to sample input and output for formatting specifications.

Sample Input:
126
Sample Output:
Priority : 1
Nature:2
Action : 6
*/

import java.util.* ;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);

        int code=sc.nextInt();

        int priority=code/100;
        int nature=(code/10)%10;
        int action=code%10;

        System.out.println("Priority : "+priority);
        System.out.println("Nature : "+nature);
        System.out.println("Action : "+action);
    }
}   
/*
Encrypted code

The entire Air crew was all set and Pan Am 73 was ready to take off. The Pilot triggered On the engine. 
Following it, he has to send a take off code to the aviation ground station. The radio engineer had to aid him in doing this. 
The radio engineer had to encrypt the code to be sent. The code was a three digit number and the encrypted code was a sum of the digits in the code.

Can you help the radio engineer encrypt the code given by the pilot?
Input Format:
The input has a single line containing an integer that corresponds to the take off code.
Output Format:
The output should display in a single line, an integer that corresponds to the encrypted code.
Sample Input:
126
Sample Output:
9
*/
//code:

import java.util.*;

class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);

        int code=sc.nextInt();
        /*
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;

        }
        System.out.printf("%d",sum);
    }
}       


*/
        int hundred=code/100;
        int ten=(code/10)%10;
        int unit=code%10;

        int sum= hundred+ten+unit;

        System.out.printf("%d",sum);

      }
    
    }

/*
Time – Karachi landing

Pan Am 73 was on air. Neerja had to announce the time at which they would reach Karachi. 
But since there were a few children on board she did not want to announce the time in 24 hour format but in 12 hour format.

But the 'hours' value in the 24 hour time format needed to be converted. Can you help her doing this?
For example, 23.30hrs is 11.30 PM. It is evident that the minutes count doesn't change during the conversion, that is only 23 gets converted to 11.

Input Format:
The input consists of a single line containing an integer that corresponds to the hour value of the 24 hour time format.
Output Format:
Output should display in a single line an integer corresponding to the hour value after conversion.
Sample Input:
22
Sample Output:
10

*/
//code
   import java.util.*;
   class Main{
       public static void main(String[]s){

           Scanner sc=new Scanner(System.in);

           int time24=sc.nextInt();
           int time12 = time24%12;

           if(time24%12==0){
               time12=12;
           }

           System.out.printf("%d",time12);

       }
   }

/*
Remaining Flight Time

Pan Am 73 was on air. Neerja had to announce the time at which they would reach Karachi.
Neerja had a fair idea about the average speed S (in kmph) of the aircraft and she knew the distance D (in km) to be covered to reach Karachi.
Given S and D, can you calculate the time (in minutes) still left to reach Karachi.
Input Format:
The first line of the input corresponds to an integer S, the speed of the aircraft in kmph.
The second line corresponds to an integer D, the distance between the aircraft and Karachi.
Output Format:
The Output should display a floating point integer that returns the time still left to reach Karachi, in minutes. Round off the value to two decimal points.

Sample  Input:
400
700
Sample Output:
1.75
*/
//code:
   import java.util.*;
   class Main{
       public static void main(String[]s){
           Scanner sc=new Scanner(System.in);

           int S=sc.nextInt();
           int D=sc.nextInt();

           float T=(float)D/S;

           System.out.printf("%.2f",T);

       }
   }
/*
WonderWorks Magic Show
The Magic Castle, the home of the Academy of Magical Arts at California has organized the great ‘WonderWorks Magic Show’.
3 renowned magicians were invited to mystify and thrill the crowd with their world’s spectacular magic tricks.
At the end of each of the 3 magicians’ shows, the audience were requested to give their feedback in a scale of 1 to 10.
Number of people who watched each show and the average feedback rating of each show is known.
Write a program to find the average feedback rating of the WonderWorks Magic show.

Input Format:
First line of the input is an integer value that corresponds to the number of people who watched show 1.
Second line of the input is a float value that corresponds to the average rating of show 1.
Third line of the input is an integer value that corresponds to the number of people who watched show 2.
Fourth line of the input is a float value that corresponds to the average rating of show 2.
Fifth line of the input is an integer value that corresponds to the number of people who watched show 3.
Sixth line of the input is a float value that corresponds to the average rating of show 3.

Output Format:
Output should display the overall average rating for the show. Display the rating correct to 2 decimal places.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the number of people who watched show 1
400
Enter the average rating for show 1
9.8
Enter the number of people who watched show 2
500
Enter the average rating for show 2
9.6
Enter the number of people who watched show 3
100
Enter the average rating for show 3
5
The overall average rating for the show is 9.22
*/
//code:
import java.util.*;
class Main {
    public static void main(String[] args) {
        
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter the number of people who watched show 1");
            int s1=sc.nextInt();
            System.out.println("Enter the average rating for show 1");
            float r1=sc.nextFloat();

            System.out.println("Enter the number of people who watched show 2");
            int s2=sc.nextInt();
            System.out.println("Enter the average rating for show 2");
            float r2=sc.nextFloat();


            System.out.println("Enter the number of people who watched show 3");
            int s3=sc.nextInt();
            System.out.println("Enter the average rating for show 3");
            float r3=sc.nextFloat();

            int totalPeople=s1+s2+s3;

            float totalRatingInShow1=s1*r1;
            float totalRatingInShow2=s2*r2;
            float totalRatingInShow3=s3*r3;

            float overAllAvgRating=(totalRatingInShow1+totalRatingInShow2+totalRatingInShow3)/totalPeople;
            System.out.printf("The overall average rating for the show is %.2f",overAllAvgRating);

        
     }
}
/*Wisconsin State Fair
Wisconsin State Fair is one of the largest midsummer celebrations in the Midwest Allis, showcasing the agriculture skills and prowess of the state.
The Event organizers hired few part-time employees to work at the fair and the agreed salary paid to them are as given below:

Weekdays --- 80 / hour
Weekends --- 50 / hour

Justin is a part-time employee working at the fair. Number of hours Justin has worked in the weekdays is 10 more than the number
of hours he had worked during weekends. If the total salary paid to him in this month is known, write a program to estimate the number
of hours he had worked during weekdays and the number of hours he had worked during weekends.

Input Format:
First line of the input is a double value that corresponds to the total salary paid to Justin.

Output Format:
First line of the output should display the number of hours Justin has worked during the weekdays.
Second line of the output should display the number of hours Justin has worked during the weekends.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output:
Enter the total salary paid
2750
Number of weekday hours is 25
Number of weekend hours is 15*/
//code:
import java.util.*;
class Main {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the total salary paid");
            int salary=sc.nextInt();

            int weekendHrs=(salary-800)/130;
            int weekdayHrs=(weekendHrs+10);

            System.out.println("Number of weekday hours is "+weekdayHrs);
            System.out.println("Number of weekend hours is "+weekendHrs);
        
     }
}

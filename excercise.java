/*
Problem

Name:Encrypted code

 
The entire Air crew was all set and Pan Am 73 was ready to take off. The Pilot triggered On the engine. Following it, he has to send a take off code to the aviation ground station. The radio engineer had to aid him in doing this. The radio engineer had to encrypt the code to be sent. The code was a three digit number and the encrypted code was a sum of the digits in the code.



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
Problem

Tickets sold for Charity Event
HelpIndia, a famous NGO has been selective in identifying events to raise funds for charity. Suzanne is a volunteer from the NGO who was selling tickets to the public for the charity event. She sold 'X' more adult tickets than children tickets and she sold twice as many senior tickets as children tickets. Assume that an adult ticket costs $5, children ticket costs $2 and senior ticket costs $3.
Suzanne made 'Y' dollars from ticket sales. Find the number of adult tickets, children tickets, and senior tickets sold.

 
Input Format:
The first input is an integer value X that corresponds to the number of adult tickets more than children tickets.
The second input is an integer value Y that corresponds to the money in dollars made by Suzanne from ticket sales.

Output Format:
The first line of the output should display the number of children tickets sold.
The second line of the output should display the number of adult tickets sold.
The third line of the output should display the number of senior tickets sold.
Refer sample input and output for formatting specifications.
[All text in bold corresponds to input and rest corresponds to output.]

Sample Input and Output :
Enter the value of X
10
Enter the value of Y
700
Number of children tickets sold : 50
Number of adult tickets sold : 60
Number of senior tickets sold : 100

  */
import java.util.*;
class Main {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of X");
            int x=sc.nextInt();
            System.out.println("Enter the value of Y");
            int y=sc.nextInt();

            int childT=(y-5*x)/13;
            int adultT=childT+x;
            int seniorT=childT*2;

            System.out.println("Number of children tickets sold : "+childT);
            System.out.println("Number of adult tickets sold : "+adultT);
            System.out.println("Number of senior tickets sold : "+seniorT);



        
     }
}


/*
                //WonderWorks Magic Show
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






/*
                             //Wisconsin State Fair
Wisconsin State Fair is one of the largest midsummer celebrations in the Midwest Allis,
showcasing the agriculture skills and prowess of the state. The Event organizers hired few 
part-time employees to work at the fair and the agreed salary paid to them are as given below:

Weekdays --- 80 / hour
Weekends --- 50 / hour

Justin is a part-time employee working at the fair. Number of hours Justin has worked in the weekdays is 10 more than the number of hours he had worked during weekends. If the total salary paid to him in this month is known, write a program to estimate the number of hours he had worked during weekdays and the number of hours he had worked during weekends.

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
Number of weekend hours is 15
*/

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


/*Problem

Candy Game
Mona set off with great zeal to the "Fun Fair 2017". There were numerous activities in the fair, though Mona liked the Candy game. Delicious candies were wrapped in colourful foiled sheets with some random numbers on each of the candies. The game coordinators then formed many groups of few candies together, such that each candy group makes an integer and hid them all around the room. The objective of the game is that the players should look for the occurrences of number four anywhere in the integers (candy groups) placed in the room.

Mona started off with the game where there are many such integers, for each of them she should calculate the number of occurrences of the digit 4 in the decimal representation. Can you please help her in succeeding the game?

Input Format:
The only line of input contains a single integer from the candy group.

Output Format:
Output should contain the number of occurrences of the digit 4 in the respective integer from the candy groups that Mona gets.
Refer sample input and output for formatting specifications.

Sample Input 1:
447474

Sample Output 1:
4

Sample Input 2:
12

Sample Output 2:
0
*/

//code:
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String number =sc.nextLine();

        int count=0;

        for( char digit : number.toCharArray() ){
            if(digit=='4'){
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}

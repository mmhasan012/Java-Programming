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

/*
Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. This week’s competition was a Team event and students who register for the event will be given a unique registration code N. The participants are teamed into 10 teams and the team to which a participant is assigned to depends on the absolute difference between the first and last digit in the registration code.

The event organizers wanted your help in writing an automated program that will ease their job of assigning teams to the participants. If the registration number given is less than 10, then the program should display "Invalid Input".

Input Format:
The only line of input contains an integer N.

Output Format:
Output the absolute difference between the first and last digit of N.
Refer sample input and output for formatting specifications.

Sample Input 1:
345

Sample Output 1:
2

Sample Input 2:
9

Sample Output 2:
Invalid Input
*/
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int regno=sc.nextInt();
        if(regno<10){
            System.out.println("Invalid Input");
        }
        else{
            String numStr=Integer.toString(regno);
            int firstD=Character.getNumericValue(numStr.charAt(0));
            int lastD= Character.getNumericValue(numStr.charAt(numStr.length()-1));

            int diff= Math.abs(firstD-lastD);
            System.out.printf("%d",diff);
        }
    }
}



/*
Sum of digits

Write a program using while loop to find the sum of digits of a given number.

Input format :

Input consists of an integer value.

Output Format :

Output consists of sum of digits in the input value.

[ Refer Sample Input and Output for further details ]

Sample Input and Output  1 :

[ All text of bold corresponds to Input and the rest output ]

Enter the value :
1345
Sum of digits in 1345 is 13

 

Sample Input and Output  2 :

Enter the value :
11111
Sum of digits in 11111 is 5
*/

//code:

import java.util.*;
   class Main{
       public static void main(String[]s){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the value :");
           int value =sc.nextInt();

           int sum=0;
           int temp=value;
           while(temp!=0){
               int result=temp%10;
               sum=sum+result;
               temp=temp/10;
           }

           System.out.println("Sum of digits in "+value+ " is "+sum);

       }
   }
/*
SPECIAL NUMBER

A 2-digit number is said to be a special number if the sum of the sum of its digits and the products of its digits is equal to the number itself.

For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9.

10+9 = 19.

Write a program to find all special numbers between 2 limits m and n(both inclusive). Assume that m and n are 2-digit numbers.

Input Format:

Input consists of 2 integers m and n.

Output Format:

Refer Sample Output .

Sample Input 1:

11

30

Sample Output 1:

19

29
*/
//code:

 import java.util.*;
   class Main{
       public static void main(String[]s){
           Scanner sc=new Scanner(System.in);
           int m=sc.nextInt();
           int n=sc.nextInt();

           //int m,n;
           while(m<n){
               int tenTh=m%10;
               int unit=m/10;
               int sum1=tenTh+unit;
               int product=tenTh*unit;
               int sum2=sum1+product;

               if(m==sum2){
                   System.out.println(+m);
               }
               m++;
           }
       }
   }


/*
At the annual "KrackerJack Karnival", there was a newest attraction ever in the City, the "Hanging Bridge". Visitors will be able to walk 200ft on the bridge, hanging around 50ft above the ground, and enjoy a wide-angle view of the breathtaking greenery.
The Hanging Bridge was inaugurated successfully in co-ordination with the Event Manager Rahul. There is a limit on the maximum number of people on the bridge and Rahul has to now ensure the count of people on the bridge currently should not exceed the limit. He then approximately estimated that C adults and D kids who came to the show, were on the hanging bridge. He also noticed that there are L legs of the people touching the bridge.
Rahul knows that kids love to ride on the adults and they might ride on the adults, and their legs won't touch the ground and hence he would miss counting their legs. Also Rahul knew that the adults would be strong enough to ride at max two kids on their back.
Rahul is now wondering whether he counted the legs properly or not. Specifically, he is wondering is there some possibility of his counting being correct. Please help Rahul in finding it.
 
Input Format:
The only line of input contains three space separated integers C, D, L denoting number of the adults, number of the kids and number of legs of people counted by Rahul, respectively.

Output Format:
Output a single line containing a string "yes" or "no" (both without quotes) according to the situation.
Refer sample input and output for formatting specifications.

Sample Input 1:
1 1 4

Sample Output 1:
yes

Sample Input 2:
2 4 16

Sample Output 2:
no

Sample Input 3:
2 4 7

Sample Output 3:
no
*/
//code:
import java.util.Scanner;

public class HangingBridgeLegs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        
        scanner.close();

        // Calculate the maximum and minimum possible legs
        int maxLegs = 2 * (C + D);
        int minLegs = 2 * C + 2 * Math.max(0, D - 2 * C);

        // Check if L is within the valid range and even
        if (L >= minLegs && L <= maxLegs && L % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}









/*
The ExConFair is the region's largest trade fair on Construction Equipments & Technology. The Event organizers hired college students as volunteers to work at the fair as the event is targeted to be attended by approx. 30 million visitors.
 
At the Office in the fair, there are two guards who count how many times a volunteer enters into the fair ground. Though the duty of a guard is 24 hour in a day, but sometimes they fall asleep during their duty and could not track the entry of volunteers in the fair ground. But one better thing is that they never fall asleep at the same time. At least one of them remains awake and counts who enters into the office. Now the Event Head wants to calculate how many times a volunteer has entered into the fair ground. He asked to the guard and they give him two integers A and B, count of first guard and second guard respectively.
Help the Event Head to count the minimum and maximum number of times a volunteer could have entered into the fair ground.
 
Input Format:
First line of the input consists of two integers that correspond respectively to A and B.

Output Format:
Output a single line containing two space separated integers, the minimum and maximum number of times a volunteer could have entered into the fair ground.
Refer sample input and output for formatting specifications.

Sample Input 1:
19 17

Sample Output 1:
19 36

Sample Input 2:
30 40

Sample Output 2:
40 70
*/
//code:


/*
Hotel Royal Gardenia has arranged for an elite business party for the lead industrialists and celebrities of the City. Followed by a dinner buffet, the Event coordinators planned for some casino game events for the high-toned crowd. Peter was a visitor at the party and he takes some number of rubles to the casino with the intention of becoming rich. He plays three machines in turn. Unknown to him, the machines are entirely predictable. Each play costs one ruble. The first machine pays 20 rubles every 25th time it is played; the second machine pays 80 rubles every 120th time it is played; the third pays 8 rubles every 12th time it is played.
Given the number of rubles with Peter (there will be at least one and fewer than 1000), and the number of times each machine has been played since it last paid, write a program that calculates the number of times Peter plays until he goes broke.

Input Format:
First line of the input is an integer that corresponds to the number of rubles with Peter.
Next 3 lines of the input is an integer that corresponds to the number of times each machine has been played since it last paid.

Output Format:
Output a single line that gives the number of times Peter plays until he goes broke.
Refer sample input and output for formatting specifications.

Sample Input 1:
48
3
12
4

Sample Output 1:
Peter plays 56 times before going broke

Sample Input 2:
35
10
30
9

Sample Output 2:
Peter plays 71 times before going broke

*/
//code:
import java.util.Scanner;

public class CasinoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rubles Peter has
        int rubles = scanner.nextInt();
        
        // Read the number of times each machine has been played
        int machine1Plays = scanner.nextInt();
        int machine2Plays = scanner.nextInt();
        int machine3Plays = scanner.nextInt();

        // Initialize the number of plays
        int totalPlays = 0;

        // Simulate the game until Peter goes broke
        while (rubles > 0) {
            // Play the first machine
            totalPlays++;
            rubles--; // Cost of playing
            machine1Plays++;
            if (machine1Plays % 25 == 0) {
                rubles += 20; // Payout from the first machine
            }

            // Play the second machine
            if (rubles > 0) {
                totalPlays++;
                rubles--; // Cost of playing
                machine2Plays++;
                if (machine2Plays % 120 == 0) {
                    rubles += 80; // Payout from the second machine
                }
            }

            // Play the third machine
            if (rubles > 0) {
                totalPlays++;
                rubles--; // Cost of playing
                machine3Plays++;
                if (machine3Plays % 12 == 0) {
                    rubles += 8; // Payout from the third machine
                }
            }
        }

        // Output the total number of plays
        System.out.println("Peter plays " + totalPlays + " times before going broke");
    }
}

/*
Calendar Quiz
 
Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. This week’s participants were kids of age 12 to 15 and the quiz questions were based on Gregorian calendar.
 
In the first round of the competition, the Host of the event told the participants that it was Monday on the date 01/01/2001. Later he questioned each one of the participant what would be the day on the 1st January, giving them a particular year. Write a program to help the Host validate the answers given by the participants.
 
Input Format:
The first line contains an integer that corresponds to a year.

Output Format:
Output the day on the 1st January of that given year.
Refer sample input and output for formatting specifications.

Sample Input 1:
1994

Sample Output 1:
Saturday

Sample Input 2:
2014

Sample Output 2:
Wednesday
*/

//code:






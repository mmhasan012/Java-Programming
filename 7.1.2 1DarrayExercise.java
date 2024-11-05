
/*
Sports IV
On the account of annual day celebrations, Amphisoft Technologies Pvt Ltd has arranged sports events for their employees. 
The cricket lovers formed teams and registered for the game. Some of the ‘n’ cricket lovers were not able to register the
team due to the maximum number of teams achieved or they couldn’t form the team or the last date of registration was over. 
The event coordinators decided to conduct a lucky prize winner event during the cricket match to motivate those cricket lovers.

“CricMindless” is the team that came first for the finals after the semi-final. Those ‘n’ cricket lovers were asked to predict how much
score “CricMindless” will secure at the game-winning match. Those people were given their predictions based on the "CricMindless" team's previous performances.
After the “CricMindless” team's batting, the event coordinators asked Stephen to tell who all predicted the score correctly and where those people were sitting on the ground to give the gift.

Stephen finds it difficult to finish this task. Help him using a program.
Assume that array indices are the positions or seating numbers (starting by 1) where those ‘n’ people are sitting.

Input Format:
In the first line, read a positive integer that represents ‘n’ cricket lovers (where, n>0).
In the second line, read ‘n’ positive integers in an array which correspond to the predicted scores.
In the third line, read a positive integer that represents the actual score gained by “CricMindless”.

Output Format:
Display the positions of correctly predicted people.
Refer sample Input and Output for format specifications.

Sample Input 1:
10
100 101 23 0 84 150 59 34 54 37
104
Sample Output 1:
None of the persons predicted the score correctly.

Sample Input 2:
8
109 87 0 1 10 87 67 87
87
Sample Output 2:
lucky prize winner 1 at location 2.
lucky prize winner 2 at location 6.
lucky prize winner 3 at location 8.
*/
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] score=new int[n];
        for(int i=0;i<score.length;i++){
            score[i]=sc.nextInt();
        }
        int findScore=sc.nextInt();
        int count=0;
        for(int i=0;i<score.length;i++){
            if(score[i]==findScore){
                count++;
                System.out.println("lucky prize winner "+count+  " at location "+(i+1)+".");
            }
        }
        if(count==0){
            System.out.println("None of the persons predicted the score correctly.");

        }

    }
}


/*
Problem

Mean and Median
Develop a program to calculate the Mean and Median in an Array.
Mean Ideology:
        Given ‘N’ size unsorted or sorted array,
Median Ideology:
       Given the ‘N’ size sorted array,
                        the middle element is called Median if ‘N’ is odd;
                        otherwise, the average of two elements in the middle, if ‘N’ is even.
Input Format:
In the first line, read a positive integer that represents the number of elements in an array.
In the second line, read integer elements for the above array.

Output Format:
Display the Mean and Median values.
Restrict the decimal places to two.    

Sample Input 1:
10
4978 11735 14216 14470 38120 51135 64630 67060 73429 99233
Sample Output 1:
Mean : 43900.60
Median : 44627.50

Sample Input 2:
8
1 3 4 2 6 5 8 7
Sample Output 2:
Mean : 4.50
Median : 4.50
*/
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num =new int[n];

        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];

        }
        double mean=(double)sum/num.length;
        System.out.printf("Mean : %.2f",mean);

        Arrays.sort(num);
       int midIndex=num.length/2;
       double median;
       if(num.length%2==1){
           median=num[midIndex];
       }
       else{
           median=(double)(num[midIndex-1]+num[midIndex])/2;
       }
        System.out.println();
       System.out.printf("Median : %.2f",median);

    }
}

/* 

Cumulative sum

Write a program to form a cumulative sum array from an array.

For Eg, for the array {2,3,5,7,1}, the cumulative sum array is {2,5,10,17,18}

Note:
Refer to the problem requirements.

Input Format:
Input consists of n+1 integers. The first integer corresponds to ‘n’, the size of the array.
The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15.
Output Format:
Refer sample output for details. The integers in the output are separated by a single space.
[All text in bold corresponds to input and the rest corresponds to output]

Sample Input 1:
Enter the number of elements in an array
5
Enter the array elements
2
3
5
7
1

Sample Output 1:
Cumulative sum array
2 5 10 17 18

*/
//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Cumulative sum array");
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            System.out.printf("%d ",sum);

        }
    }
}

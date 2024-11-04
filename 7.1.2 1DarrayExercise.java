
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

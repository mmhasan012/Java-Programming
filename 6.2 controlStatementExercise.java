/*
Plants under shade

There are certain plants that needs to be grown under the shade of huge trees and the dead leaves from 
the trees become the natural manure for the plants. So willow trees are planted throughout the village at certain positions.
The position(distance from the first tree) follows the following series
0 6 10 17 22 30 36....

Input format:
Input is an integer which corresponds to number of willow trees, n.
Output format:
Output is the series that contains 'n' numbers.

Sample Input 1:
7
Sample Output 1:
0 6 10 17 22 30 36
Sample Input 2:
5
Sample Output 2:
0 6 10 17 22

*/
//code:
import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        int count1=6;
        int count2=4;
        System.out.print("0 ");
        
        for(int i=1;i<n;i++){
            if(i%2==0){
                num=num+count2;
                count2++;
                
            }
            else{
                num=num+count1;
                count1++;
            }
            System.out.print(num+" ");
        }
    }
}


/*
The renowned book fair of the season "Publishers Federation Book Expo" is back, it promises to be bigger and better with a spread of about a million books on display. It is organized in a wide space this year on the topmost floor N of Hotel Grand Regency.

Williams, an ardent book lover visits the fair and wants to minimize the time it takes him to go from the N-th floor to ground floor. He can either take the elevator or the stairs.
The stairs are at an angle of 45 degrees and Williams's velocity is V1 m/s when taking the stairs down. The elevator on the other hand moves with a velocity V2 m/s. Whenever an elevator is called, it always starts from ground floor and goes to N-th floor where it collects Williams (collecting takes no time), it then makes its way down to the ground floor with Williams in it.
The elevator cross a total distance equal to N meters when going from N-th floor to ground floor or vice versa, while the length of the stairs is sqrt(2) * N because the stairs is at angle 45 degrees. Williams has requested your help to decide whether he should use stairs or the elevator to minimize his travel time. Can you help him out?


Input Format:
First line of the input contains three space-separated integers N, V1, V2.

Output Format:
Output a single line with string Elevator or Stairs, denoting the answer to the problem.
Refer sample input and output for formatting specifications.

Sample Input 1:
5 10 15

Sample Output 1:
Elevator

Sample Input 2:
2 10 14

Sample Output 2:
Stairs

*/
//code:
import java.util.*;
public class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter floor No : ");
        int fn=sc.nextInt();
        
        System.out.print("Enter william's velocity : ");
        double v1=sc.nextDouble();
        
        System.out.print("Enter elevetor velocity : ");
        double v2=sc.nextDouble();
        
        
        double tStair=(double)(Math.sqrt(2)*fn)/v1;
        double tElevetor=(double)(2*fn)/v2;
        
        if(tStair < tElevetor){
            System.out.printf("Stair : %.2f s",tStair);
            
        }
        else{
            System.out.printf("Elevetor : %.2f s ",tElevetor);
            
        }
        
        
    }
}

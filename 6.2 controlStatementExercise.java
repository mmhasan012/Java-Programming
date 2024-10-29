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



/*
*****Area Split
Pandu, the farmer, has three sons named, Bhima, Arjuna, and Nakula. 
He has also planned for Three field crop rotation and hand over each field to his three sons.
His sons are fond of even numbers. So they wanted to split the field only if he is able to split it
into 3 even number (w.r.to area) fields. Pandu was so particular that the difference in the area of
the fields should be minimum because he equally liked his three sons. He would split the field only if it is possible,
else he would do normal farming.

Note that it is possible to split only if all three land have a positive area.
Write a program to help Pandu in splitting the land.
Input Format:
The first (and the only) input line contains an integer that corresponds to the area of the field.
Note: Assume inputs are positive.

Output Format:
In the first line of the output, print "Yes", if the field can be divided into
three parts as per the requirements of Pandu, else print "No".
If the first line of the output is "Yes", the next line of the output consists of 3 integers separated
by a space, which corresponds to the areas of the divided field. In case of distinct integers, the smallest number should appear first.

Sample Input 1:
6
Sample Output 1:
Yes
2 2 2
Sample Input 2:
7
Sample Output 2:
No

*/
/*
Problem Requirements:
Objective: Determine if a given field can be split into three even-numbered fields such that:
Each field has a positive area.
The difference in the areas of the fields should be minimal.
Input: A single integer representing the total area of the field.

Output:
"Yes" if the field can be split into three even-numbered fields.
"No" if the field cannot be split as required.
If "Yes", also output the areas of the three fields in non-decreasing order.

Key Constraints:
The field areas must be even numbers.
All three fields must have a positive area.
The areas must have minimal differences.

Key Observations:
*Even Number Requirement: Each of the three areas must be even. This implies that 
the total area itself must be an even number. If the total area is odd, it is immediately impossible to split it into three even areas.
*Positive Area Requirement: Each of the three fields must have a positive area, which means 
each area must be at least 2 (since the smallest even positive number is 2).
*Minimal Difference: To achieve minimal differences, ideally, the areas should be as equal as possible.

Feasibility Conditions:
*Divisibility by 6: If the total area is divisible by 6, the simplest way to split it would be into three equal parts.
For instance, if the area is 6, the three parts would be 2, 2, and 2.
*Divisibility by 2 but not 6: If the area is divisible by 2 but not by 6, more complex considerations are needed to check
if it can still be split into three even fields.

Steps to Determine the Output:
Check if the total area is even: If not, print "No".
Check if the area can be divided into three even parts:
Calculate the ideal split if the area is divisible by 6.
If not, check other possible combinations ensuring minimal differences and all parts being even.
Example Analysis:
Example 1:
Input: 6
Analysis: 6 is divisible by 6. It can be split into 2, 2, and 2.
Output: Yes, 2 2 2
Example 2:

Input: 7
Analysis: 7 is odd and cannot be split into even parts.
Output: No

Algorithm:
Read the input area.
Check if the area is even.
If the area is divisible by 6, split it into three equal parts.
If not, check other combinations ensuring minimal differences and even parts.

Output the result.
Potential Edge Cases:
Minimum input value (smallest even number, e.g., 2, which can't be split into three positive even parts).
Larger numbers that are even but not divisible by 6 (e.g., 14, 22).


*/

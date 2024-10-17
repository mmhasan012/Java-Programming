/*
  ex-1:
  output:
Enter the number of line
5
*
**
***
****


*/
//code
import java.util.*;
class main{
    public static void main(String[]s){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of line");
        int nL=sc.nextInt();
        
        for(int row=1;row<=nL;row++){
            for(int col=1;col<=row;col++){
             System.out.printf("*");   
            }
             System.out.println();   

            }
        }
        
    }
  

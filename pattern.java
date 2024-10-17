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
  
/*
Enter the line number
4
A
AB
ABC
ABCD

*/


//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the line number");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.printf("%c",col+64);
            }
            System.out.println();
        }
    }
}


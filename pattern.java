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


/*
Enter the line number
5
1
10
101
1010
10101

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
                System.out.printf("%d",col%2);
            }
            System.out.println();
        }
    }
}


/*
Enter the line number: 4
1234
123
12
1

*/

//code:
import java.util.*;
class Main{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        
        System.out.printf("Enter the line number: " );
        int n=sc.nextInt();
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.printf("%d",col);
            }
            System.out.println();
        }
    }
}



/*
Enter the line number: 5
1
12
123
1234
12345
1234
123
12
1
*/

//code:
import java.util.*;
public class patternH{
    public static void main(String[]s){
        Scanner sc=new Scanner(System.in);
        
        System.out.printf("Enter the line number: " );
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.printf("%d",col);
            }
            System.out.println();
        }

        for(int row=n-1;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.printf("%d",col);
            }
            System.out.println();
        }
    }
}

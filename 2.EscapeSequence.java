/*Escape sequences in Java are used to represent characters 
that are otherwise difficult to include directly in a string.
 They start with a backslash (\) followed by a character that
  has a special meaning. Here are some common escape sequences in Java:
\n : New line
\t : Tab
\b : Backspace
\r : Carriage return
\f : Form feed
\' : Single quote
\" : Double quote
\\ : Backslash 
*/
public class EscapeSequence {
    public static void main(String[] args) {
        
        System.out.println("write once run anywhere");
        System.out.println("write \nonce \nrun \nanywhere");
        System.out.println("write \tonce \trun \tanywhere");
        System.out.println("write \bonce \brun \banywhere");
        System.out.println("write \ronce \rrun \ranywhere");
        System.out.println("write \fonce \frun \fanywhere");
        System.out.println("write \'once run anywhere\'");
        System.out.println("write \"once run anywhere\"");
        System.out.print("C:\\Users\\Public");

    }
}

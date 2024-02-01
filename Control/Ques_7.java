
// **********7. Write a program to check whether a character is alphabet or not

package Control;

import java.util.Scanner;

public class Ques_7 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println(sc);
                System.out.println("Enter a character");
        
                
                char c = sc.next().charAt(0);
                if(c>='a' && c<='z'){
                  System.out.println("This is a alphabet");
                }
                else if(c>='A' && c<='Z'){
                  System.out.println("This is a alphabet");
                }
                else{
                System.out.println("This is not a alphabet");
                }
        }
}

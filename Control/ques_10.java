// *******10. Write a program to check whether a character is uppercase or lowercase alphabet*******
package Control;
import java.util.Scanner;
public class ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Entr a Alphabet");

        // *******first take value in character than we conver the character in integer for after that it check condition*********
        char c = sc.next().charAt(0);
        
        if((int)c>=65 && (int)c<=90){
        System.out.println("uppercase");
        }
        else{
            System.out.println("lowercase");
        }
    }
}

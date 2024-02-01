//Write a program to input any character and check whether it is alphabet, digit or special character

package Control;

import java.util.Scanner;

public class ques_9 {


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter a cahracter");
        char c = sc.next().charAt(0);
        // char ch='a';
    
        if (c>='a'&&c<='z'||c>='A'&&c<='Z') 
        {
            System.out.println("alphabet");
        }
        else if (c>=0 && c>=1) 
        {
            System.out.println("positive digit"); 
        }
        else if (c<0 && c<1) 
        {
            System.out.println("negativ digit"); 
        }
        else
        {
            System.out.println("special character");
        }

    }

}


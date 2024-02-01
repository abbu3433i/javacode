// 3. Write a program to check whether a number is negative, positive or zero

package Control;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("The number is negative no..");
        }
        else if(n==0){
            System.out.println("The number is Zero..");
        }
        else{
            System.out.println("The number is positive no..");
        }
        
    }
}

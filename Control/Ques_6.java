// **********6. Write a program to check whether a year is leap year or not***********

package Control;

import java.util.Scanner;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter a year:");
        
        int y = sc.nextInt();
        if(y%4==0){
            System.out.println("This is leap year "+y);
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}

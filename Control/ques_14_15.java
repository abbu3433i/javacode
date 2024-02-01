// *******14. Write a program to input angles of a triangle and check whether triangle is valid or not*******

package Control;

import java.util.Scanner;

public class ques_14_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("enter side of triangle A");
        int a = sc.nextInt();
        System.out.println("enter side of triangle b");
        int b = sc.nextInt();
        System.out.println("enter side of triangle c");
        int c = sc.nextInt();

        if(a+b+c==180){
            System.out.println("The angle of triangle is valid");
        }
        else{
            System.out.println("NOT VALID....");
        }
    }
}

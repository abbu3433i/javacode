// ************1. Write a program to find maximum between two numbers************

package Control;

import java.util.Scanner;

public class Ques {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println(sc);
      System.out.println("Enter 1st number");
      int n = sc.nextInt();

      System.out.println("Enter 2nd number");
      int s = sc.nextInt();
      if(n>s){
        System.out.println("The maximum no. is: "+n);
      }
      else{
        System.out.println("The maximum no. is: "+s);
      }
    }
}

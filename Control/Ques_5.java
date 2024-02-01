// 5. Write a program to check whether a number is even or odd

package Control;

import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}

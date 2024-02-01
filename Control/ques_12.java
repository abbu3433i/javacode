package Control;

import java.util.Scanner;

public class ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter a month number");

        int a = sc.nextInt();
        if(a==1){
            System.out.println("january");
        }
        else if(a==2){
            System.out.println("febraury");
        }
        else if(a==3){
            System.out.println("march");
        }
        else if(a==4){
            System.out.println("april");
        }
        else if(a==5){
            System.out.println("may");
        }
        else if(a==6){
            System.out.println("june");
        }
        else if(a==7){
            System.out.println("july");
        }
        else if(a==8){
            System.out.println("august");
        }
        else if(a==9){
            System.out.println("september");
        }
        else if(a==10){
            System.out.println("octobar");
        }
        else if(a==11){
            System.out.println("november");
        }
        else if(a==12){
            System.out.println("December");
        }
        else{
            System.out.println("Please enter valid month no...");
        }
    }
}

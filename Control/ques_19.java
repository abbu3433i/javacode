package Control;

import java.util.Scanner;

public class ques_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter physics marks:");
        int p = sc.nextInt();
        System.out.println("Enter chemistry marks:");
        int c = sc.nextInt();
        System.out.println("Enter biology marks:");
        int b = sc.nextInt();
        System.out.println("Enter maths marks:");
        int m = sc.nextInt();
        System.out.println("Enter computer marks:");
        int computer = sc.nextInt();
     
        float percentage = ((p+c+b+m+computer)/500.0f)*100;


        if(percentage<40 && percentage>30){
            System.out.println(percentage+"% : Grade F");
        }
        else if(percentage>=40 && percentage<60){
            System.out.println(percentage+"% : Grade E");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println(percentage+"% : Grade D");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println(percentage+"% : Grade C");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println(percentage+"% : Grade B");
        }
        else if(percentage>=90 && percentage<95){
            System.out.println(percentage+"% : Grade A");
        }
        else{
            System.out.println("yor are fail...."+percentage+"%");
        }
    }
}

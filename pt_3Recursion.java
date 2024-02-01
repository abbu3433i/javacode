import java.util.Scanner;

public class pt_3Recursion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int res = fact(n);
    System.out.println(res);
    
    sc.close();
    }//main

    /*1.# If recursion means function calling itselt repeated than there is a chance 
     that it will enter into infinite loop how will you come out from the infinite loop
     2.# Recursion hamesha ulta chalta he or tabhi rukhta he jab uski base condition meet ho jaye*/

/************Recursion*************/
static int fact(int n){
    if(n==1){
    return 1;
    }
    return n*fact(n-1);   //idhar fir se fact fun. call ho rha he reapetedly 
}


}//class

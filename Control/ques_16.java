// *******16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle*******

package Control;

public class ques_16 {
    public static void main(String[] args) {
        int a = 25;
        int b = 35;
        int c = 25;

        if(a==b && b==c && c==a){
            System.out.println("Equilateral triangle");
        }
        else if(a==b || b==a || c==a){
            System.out.println("isosceles tiangle");
        }
        else{
            System.out.println("Scalene tiangle");
        }
    }
}

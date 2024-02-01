public class a_5Ifelse {
    public static void main(String[] args) {
        int k =90;
        int h = 91;

        if(k<h){                                             //if(true)
            System.out.println("First line");
            System.out.println("second line");
            System.out.println("three line");
            if(h>k){
                System.out.println("second if exicuted");
            }
            System.out.println("out of innner if");
        }
        System.out.println("outside of outer if");
    }
}

// ********calculate profit or loss*******


package Control;

public class ques_18 {
    public static void main(String[] args) {
        int sp = 105;
        int cp = 85;
        int profit = sp-cp;
        int loss = cp-sp;
        if(profit>0){
            System.out.println("profit hua bhai..."+profit);
        }
        else {
            System.out.println("loss ho gya re.."+loss);
        }
         
    }
}

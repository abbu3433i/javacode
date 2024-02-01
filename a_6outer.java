public class a_6outer {

         int x = 87;    //instance

    //    outer(int a){
    //        x=a;
    //     }

      
    public static void main(String[] args) {
        a_6outer ct = new a_6outer();
        System.out.println(ct.x);
        
        //given value with the help of object
        outer1 ct1 = new outer1();
        System.out.println(ct1.y);
        ct1.y = 70;
        System.out.println(ct1.y);

        outer3 h = new outer3();
         h.some();  
         
         //outer3 ke object ka refrence bhi lena padega
         outer3.ct dt = h.new ct();
         System.out.println(dt.k);

     }
}


class outer1{

    int y;
}




class outer3{
    void some(){
        System.out.println("hiiiiii");
    }

    class ct{
        int k = 90;    //
    }
}

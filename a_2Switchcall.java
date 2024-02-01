/*********switch calling methods in classes******** */
/***********java4 method called in java3 ke main fn.**********/

public class a_2Switchcall {
    static int xyz(){
        System.out.println("xyz is successfully implimented");
        return 45;
    }
    public static void main(String[] args) {
        java4.pqr();
        // xyz();
    }
}


 class java4{
    public static void pqr(){
        System.out.println("pqr is successfully implemented");
    }

    public static void main(String[] args) {
        // pqr();
        int h = a_2Switchcall.xyz();
        System.out.println(h);
    }
}

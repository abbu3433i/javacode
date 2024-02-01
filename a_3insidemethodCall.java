/*********method ke andar function ko call kar skte hen********/
//******class created inside the class*****
public class a_3insidemethodCall {
    public static void main(String[] args) {
        System.out.println(abbu.vdn());
    }

    class abbu{
       static int vdn(){
            System.out.println("this is printing");
            int x = 0;
            if (x!=0) {
                vdn();                                             //here this vdn call itself
            }
            System.out.println("hello");
            return 45;
        }
    }
}

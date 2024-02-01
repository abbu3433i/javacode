public class a_4test {
    int h = 89;  //instance variale--because it is inside the heap method 

     int abhishek(){
        return 45;
    }

    public static void main(String[] args) {
        int f = 89;  // local variable-- because it inside the stack of (main method)

        //object of test
       a_4test ct = new a_4test();

       //object of A
       a_4test.A y = ct.new A();
      
       //object of B
       a_4test.A.B x = y.new B();
 
       //calling h and b
       System.out.println(ct.h);
       System.out.println(x.b);

       //calling of myname method
       System.out.println(ct.abhishek());
       

    }

     class A {
    
        class B {
            int b = 8;
        }  
    }
}

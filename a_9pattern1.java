public class a_9pattern1 {
    public static void main(String[] args) {
    
        /**********Increasing order******** */

    //     int n = 5;
    //     for(int r=1; r<=n; r++){
            
    //         for(int c=1; c<=r; c++){     //col row pe depend ho gya he
 
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    /**********Decreasing order******** */ 
    // int n = 5;
    //     for(int r=1; r<=n; r++){

    //         for(int c=r; c<=n; c++){     //col ki starting value row pe depend he 
 
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    /************pattern-1************* */

    //  int n = 8;
    //     for(int r=1; r<=n; r++){        //Row batata he or chalata he ke kitni row aayengi

    //         for(int c=r; c<=n; c++){     // decreasing triangle
 
    //             System.out.print("$ ");
    //         }

    //         for(int c=1; c<=r; c++){     // increasing triangle
 
    //             System.out.print("* ");
    //         }
            

    //         System.out.println();
    //     }




    /************pattern-2*****'homework'******** */

   // 'n' matlb row kitni row chahiye 
    int n =9;    
    for(int r=1; r<=n; r++){           //ye just row batata he ki kitne baar print karna he 
   
        for(int c=1; c<r; c++){           //increasing order
            System.out.print("  ");
        }
   
        for(int c=r; c<=n; c++){
            System.out.print("$ ");      //decreasing order
        }
     

        System.out.println();
      }
     
    }
}

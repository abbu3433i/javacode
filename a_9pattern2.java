public class a_9pattern2 {
    public static void main(String[] args) {
        
        /*************Triangle banana he to ********* */
        // int n=6;
        // for(int r=1; r<=n; r++){
        //     for(int c=r; c<=n; c++){
        //         System.out.print(" ");     //only one hi space dena hoga
        //     }
        //     for(int c=1; c<=r; c++){
        //         System.out.print("* ");    //ye same hi rahega

        //     }
            
        //     System.out.println();
        // }


        
        
    /***Agar "purane bale for loop" ke niche naya for loop chalane ho to phele bale for loop ke bahar
     * naya for loop bana lo to jo bhi next iteration hoga bo purane bale ke niche se hi continue rahega*******/
                    int n = 5;
            
                    // Print upper part of the pattern
                    for (int r = 1; r <= n; r++) {
                        for (int c = 1; c <= r; c++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            
                    // Print lower part with decrement for loop
                    // for (int r = n - 1; r >= 1; r--) {
                    //     for (int c = 1; c <= r; c++) {
                    //         System.out.print("* ");
                    //     }
                    //     System.out.println();
                    // }
                
                    //print lower part with increment for loop
                    for(int r=1; r<=n-1; r++){
    
                        for(int c=r; c<=n-1; c++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
        
    
    
        }//main
    }//class

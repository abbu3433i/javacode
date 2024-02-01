public class a_9pattern4 {
    public static void main(String[] args) {

    /*************Swastik sign***************** */

    //     int n=7;
    //     int mid=n/2+1;   //Taking mid value

    //        for(int r=1; r<=n; r++){

    //         for(int c=1; c<=n; c++){

    //             if(r==mid||c==mid ||r==1&& c>mid ||r==7&& c<mid ||r<mid&&c==1 ||r>mid&&c==n){
                    
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //        }
    // }





     /************row value print kar do*********** */
     
        // int n=5;

        //    for(int r=1; r<=n; r++){
        // //    for(int r=1,p=1; r<=n||p>=n; r++,p++){      ek se jade initialization or condition kar sakte hen

        //     for(int c=1; c<=r; c++){
        //     System.out.print(r+" ");
                
        //     }
        //     System.out.println();
        //    }


/***first design star pattern then print number with the help of new variable which is p*** */

    //     int n =5;
    // for(int r=1,p=1; r<=n; r++,p++){
    //   //spacing
    //     for(int c=r; c<=n; c++){
    //         System.out.print("  ");
    //     }
    //     //decrement method  
    //     for(int c=r; c>=1; c--){
    //         System.out.print(p+" ");
    //     }
    //     //Increament
    //     for(int c=1; c<r; c++){
    //         System.out.print(p+" ");
    //     }

    //    System.out.println();
    // }

    /*******ulta mountain********/

    //     int n =5;
    // for(int r=1,p=5; r<=n || p>=1; r++,p--){
    //   //spacing
    //     for(int c=1; c<=r; c++){
    //         System.out.print("  ");
    //     }  
    //     for(int c=r; c<=n; c++){
    //         System.out.print(p+" ");
    //     }
    //     //Increament
    //     for(int c=r; c<n; c++){
    //         System.out.print(p+" ");
    //     }

    //    System.out.println();
    // }


/**********?????********** */
    /********1. Method to solve odd no. in increasing wise *************/
    // int n =4;
    // for(int r=1,p=1; r<=n; r++,p++){
       
    //    int odd = 2*p-1;   //this will convert even value in odd
    //     for(int c=1; c<=r; c++){

    //         System.out.print(odd);
    //     }
    //    System.out.println();
    // }
    
    // /*****2. Method to solve odd no. in increasing wise ******/
    // /**WE add 2 in p, so p will give odd number**/
    //     int n =4;
    // for(int r=1,p=1; r<=n; r++, p+=2){  
        
    //     for(int c=1; c<=r; c++){
    //         System.out.print(p+" ");
    //     }

    //    System.out.println();
    // }



    /***********Half diamond in numbers************ */

    // //upper part
    //     int n =4;
    // for(int r=1,p=1; r<=n; r++, p+=2){  
    //     //Increament
    //     for(int c=1; c<=r; c++){
    //         System.out.print(p+" ");
    //     }
    //    System.out.println();
    // }
    // //lower part
    // for(int r=1,p=5; r<=n; r++,p-=2){

    //     for(int c=r; c<n; c++){
    //         System.out.print(p+" ");
    //     }
    //    System.out.println();
    // }

    

        
    
    

    }//main
}//class



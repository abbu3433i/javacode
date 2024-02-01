public class a_9pattern3 {
        public static void main(String[] args) {
    
            /**************hollow circle*************** */

        //    int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){
        //         if(r==1 || c==1|| r==n|| c==n){
        //             System.out.print("* ");     //print ke andar string me do value li hen to do hi value niche bhi aayegin
        //         }
        //         else{
        //             System.out.print("  ");     // do value idhar bhi
        //         }
        //     }
        //     System.out.println();
        //    }




/***************row==col[2,2] "Leftside" Diagonal print***************** */

        //    int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if(r==1 || c==1|| r==n|| c==n ||c==r){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }



 /***************row+col==n+1 (1,6) "Rightside" Diagonal print*********************** */
        
        // int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if(r==1 || c==1|| r==n|| c==n ||c==r||c+r==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }



/************Left hollow triangle************** */
           
        //    int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if( r==n ||c==1||c==r){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }



/***************Old hollow watch************** */

        //    int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if( r==n ||r==1||c==r ||r+c==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }


/***************Old filled watch with the help of c==3,c==4*************** */

        //    int n=6;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if( r==n ||r==1||c==r ||r+c==n+1||     c==3||c==4 ){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }


/************* " + " sing pattern *************** */

        //    int n=5;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if(r==3||c==3 ){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //    }



/***************kite pattern**************** */

        //    int n=5;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if(r==3||c==3 ||r+c==n+1 ||r==c){
        //             if( (r==5&&c==1) ||(c==5&&r==1) ||(r==5&&c==5) ||(r==1&&c==1) ){
        //                 System.out.print("  ");
        //                 continue;   //continue control le lega and loop me bhej dega naya iteration chalane ke liye
        //             }
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         } 
        //     }
        //     System.out.println();
        //    }






    /*****************Numbers loop***************** */
    
    //----printing column value----

//     int n =6;
//     for(int r=1; r<=n; r++){
        
//         for(int c=1; c<=r; c++){
//             System.out.print(c+" ");
//         }

//        System.out.println();
//     }


/***********mountain with values********** */

    // int n =5;
    // for(int r=1; r<=n; r++){
    //   //spacing
    //     for(int c=r; c<=n; c++){
    //         System.out.print("  ");
    //     }
    //     //decrement 
    //     for(int c=r; c>=1; c--){
    //         System.out.print(c+" ");
    //     }
    //     //Increament
    //     for(int c=2; c<=r; c++){
    //         System.out.print(c+" ");
    //     }

    //    System.out.println();
    // }


    /*******pt--2****** */

//     int n = 6; // Number of rows in the pattern

//     for (int r=1; r<=n; r++) {
//         // Print leading spaces
//         for (int c=1; c<=n-r; c++) {
//             System.out.print("  ");
//         }

//         // Print numbers
//         for (int c=1; c<=r; c++) {
//             System.out.print((c%2) + " ");
//         }
//         // Move to the next line
//         System.out.println();
//     }
        

    /********Diamond******* */

    // int n =6;
    // //upper triangle
    // for(int r=1; r<=n; r++){
        
    //     for(int c=r; c<=n; c++){
    //         System.out.print(" ");
    //     }
    //     for(int c=1; c<=r; c++){
    //         System.out.print("* ");
    //     }

    //    System.out.println();
    // }
    // //lower triangle
    // for(int r=1; r<=n; r++){
        
    //     for(int c=1; c<=r; c++){
    //         System.out.print(" ");
    //     }
    //     for(int c=r; c<n; c++){
    //         System.out.print(" *");
    //     }
    //    System.out.println();
    // }



    /**********Solid "H" ********* */

    // int n =9;
    // int mid=n/2+1;
    // for(int r=1; r<=n; r++){
        
    //     for(int c=1; c<=n; c++){
    //         if(c==1||c==n||r==mid||r==c||r+c==n+1 ||c==2||c==8||r==4||r==6){
    //             if (r==4&&c==5||r==6&&c==5 ||r==1&&c==2 ||r==n&&c==2  ||r==1&&c==8 ||r==n&&c==8) {
    //                 System.out.print(" ");
    //                 continue;
    //             }
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }

    //    System.out.println();
    // }



/****************my name is A****************** */

        //    int n=5;
        //    for(int r=1; r<=n; r++){

        //     for(int c=1; c<=n; c++){

        //         if(r==1&&c==3 || r==3&&c==2 ||r==5&&c==1 ||r==3&&c==4 ||r==5&&c==5 ||r==3&&c==3){
                    
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         } 
        //     }
        //     System.out.println();
        //    }
        
    
        
    
        }//main
    }//class
    

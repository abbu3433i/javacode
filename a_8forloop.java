public class a_8forloop {
    public static void main(String[] args) {
        /*1.****series of number print karna ho 1-10(for loop use kro)******* */
        /*2. OR for loop tab bhi use hoga jab hame pata ho ki programm kitni baar run hoga */

        
        /**************Break statement*************** */
        
        //intialization "int" karta he,then "i<4" me condition check hogi,then "i++" increment karega

        // for(int i=0; i<4; i++){
        //     System.out.println(i+" hi");

        //     /****break***'for' loop ke andar 'if' ke saath hi aayega hamesha  */

        //     if (i==2) {
        //         break;    //**condition** match hote hi 'break;' jis loop me he us loop se bahar nikal jayega
        //                   //-->means bike me break lag jayega phir bo nhi cahlegi ese hi loop nhi chalega...
        //     }
        // }
    




    /******************Continue statement***************** */

    for(int i=0; i<4; i++){
  
        for(int j=0; j<4; j++){

            if(i==j){
                continue;    //continue just control le lega or aage nhi jane dega and upar bale loop me bhej dega       
            }
            System.out.println(i+" "+j);
        }
    }



  }//main
}//class


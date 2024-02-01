
public class a_10whileloop {
public static void main(String[] args) {
    /*1.*************jab bhi tumhe kisi bhi 1 hi no.(int=121) pe code likhna ho to while loop use karo *********** */
    /*2. OR while loop tab bhi use hota he jab hame pata na ho ki programm kitni baar run hoga*/

    // int n=1;        //initialization hamesha while ke upar aayega
    // while(n<6){
        
    //     int c=1;             //initialization hamesha while ke upar aayega bhale hi while ke andar while use kro
    //     while (c<=6) {
    //         System.out.print("* ");
    //         c++;
    //     }

    //     System.out.println();
    //     n++;
    // }



    int n=5;
    for(int r=1; r<n; r++){
        //space
        for(int c=r; c<n; c++){
            System.out.print("  ");
        }
        //increment
        for(int c=1,q=1; c<=r; c++){
            if(c>=2){
                System.out.print("  ");
                continue;
            }
            System.out.print(q+" ");
        }
        //increment
        for(int c=1,p=2; c<r; c++){
            if(c==1&&r==3||c==1&&r==4||c==2&&r==4){
                System.out.print("  ");
                continue;
            }
            System.out.print(p+" ");
        }

        System.out.println();
    }
    for(int r=1; r<=1; r++){
        for(int c=1; c<=n+4; c++){
            System.out.print(c+" ");
        }
    }

           
}//main 
}//class





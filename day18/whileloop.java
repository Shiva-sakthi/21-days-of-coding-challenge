package day18;

import java.util.Random;

public class whileloop {
    public static void main(String[] args) {
         

       /*  in genarally while loop
        initialization is in outside of the loop

       int j=0;

        while(j<=3){
        System.out.print("hi");
            j=j+1;
        } */

        Random rand = new Random();
    
        

      // generate a random number until the random no is random no is 6
        // initailize
       int  newnum=0;

        while (newnum!=6 ) {
             newnum = rand.nextInt(10);

            System.out.println(newnum);
        
        }
    }
}

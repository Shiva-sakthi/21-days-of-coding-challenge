package day9;

import java.util.Scanner;

public class practice1 {
public static void main(String[] args) {
    
    //int mark = 35;

    //if(mark>=35){
      //  System.out.print("pass");

    //}
    //else{
      //  System.out.print("fail");
   // }

   Scanner scan = new Scanner(System.in);
   System.out.print("Enter your income:");
    int income = scan.nextInt();

    if(income>7000){
        System.out.print("eligible for scholarship");
    }
    else{
        System.out.print("sorry better luck ");
    
    }

}
    
}

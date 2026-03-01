package day11;
import java.util.Scanner;

public class ternary {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the number for a and b:");

         int a = scan.nextInt();
         int b = scan.nextInt();

         String num = a>b?"greater":"smaller";
         System.out.print(num);
    }
    
}

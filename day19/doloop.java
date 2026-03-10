package day19;
import java.util.Scanner;
public class doloop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count=0;

        do{
            System.out.print("enter the number>10 :");
             count = scan.nextInt();
        } while(count<10);
        System.out.print("yeah!!!");

    }
}

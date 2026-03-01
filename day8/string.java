package day8;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        //String a = "one";
        //String b = new String("one");
        //String c=b;

        //System.out.print(a==c);

        Scanner scan = new Scanner(System.in);
       

        System.out.println("enter the rcb victory or not");
        String RCB = scan.nextLine();

        if (RCB.equals("win")){
            System.out.println("Saala cup namthe");

        }
        else{
            System.out.println("cup illa");
        }


        
        

    }
}

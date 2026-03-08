import java.util.Scanner;

public class practice3 {

    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = scan.nextInt();

        int[] mark = new int[size];

    

        for(int i=0; i<=size-1; i++){

            mark[i]= scan.nextInt();

            
        }
         for(int i=0; i<=3; i++){


        System.out.println(mark[i]);
         }
    }

}
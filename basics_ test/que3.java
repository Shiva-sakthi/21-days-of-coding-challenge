
import java.util.Scanner;
public class que2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int requestCount = scan.nextInt(); 

        if (requestCount <= 5) {
            System.out.print(" Allowed"); 
        } else {
            System.out.print(" Blocked"); 
        }
}

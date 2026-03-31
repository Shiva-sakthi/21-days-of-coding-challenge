
import java.util.Scanner;
public class que2 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
        int totalMessages = scan.nextInt(); 
         int compressed = totalMessages - 100;

        if (totalMessages <= 100) {
            System.out.print("Status: Active: " + totalMessages + ", Compressed: 0");
        } else {
            System.out.print("Status: Active: 100, Compressed: " + compressed);
        }
}
}

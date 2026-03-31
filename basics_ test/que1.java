
import java.util.Scanner;
public class que1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the credit score");
        int credit_score = scan.nextInt();
        System.out.print("enter your employement status");
        String employement_status = scan.nextLine();
        int income = scan.nextInt();
        int emi = scan.nextInt();
        String status = "Rejected";
        String interestRate = "N/A";


        if(credit_score>=600 && credit_score<=749){
            System.out.print("status is set to review");

            if(credit_score>=750){
                System.out.print("you are eligible and welcome to next process");

            }
            if(employement_status.equals("salaried || self employed")){
                System.out.print("you are eligible");
            }
            else{
                System.out.print("rejected");
            }
            if (income >=25000 && emi<=50){
                System.out.print("you are completely verified");
            }

            else{
                System.out.print("rejected");
            }
            if (credit_score >= 800) {
                        interestRate = "7%";
                    } 
                    else {
                        interestRate = "8%";


        }
        else {
            System.out.print("rejected");
        }

        
    }
}

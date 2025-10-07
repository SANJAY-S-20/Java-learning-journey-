/*
🧮 1️⃣ Bank Interest Rate Advisor
Problem Statement:
A bank offers different interest rates based on a customer’s account type and balance.

 */




import java.util.Locale;
import java.util.Scanner;

public class Bank_Interest_Rate_Advisor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Account type - Savings/Current : ");
        String act_type = in.next().toLowerCase(Locale.ROOT);

        System.out.println("Account balance : ");
        float balance = in.nextFloat();

        float interest;

        if (act_type.equals("savings")){
            if (balance >= 100000){
                interest = balance*(8f/100);
            }else if ( balance >= 50000){
                interest = balance*(5f/100);
            } else if (balance >= 10000) {
                interest = balance*(2f/100);
            }else {
                interest = 0;
            }
        } else if (act_type.equals("current")) {
            if (balance >= 100000){
                interest = balance*(10f/100);
            }else if ( balance >= 50000){
                interest = balance*(8f/100);
            } else if (balance >= 10000) {
                interest = balance*(4f/100);
            }else {
                interest = 0;
            }
        }else {
            System.out.println("Invalid account type.");
            return;
        }

        float returns = balance + interest;

        System.out.println("Account type : "+act_type+"\nBalance : "+balance+"\nInterest : "+interest+"\nTotal returns: "+returns);

    }
}

/*
Loan Eligibility Checker (Relational + Logical + Ternary Operators)
 */

import java.util.Scanner;

public class Loan_Eligibility_Checker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Customer name : ");
        String name = in.next();

        System.out.println("Age : ");
        int age = in.nextInt();

        System.out.println("Do they have a good credit score : (True/False) ");
        boolean credit = in.nextBoolean();

        String result = ( age >21 && credit ) ? "Loan approved." : "Loan rejected.";

        System.out.println(" ----- Result ----- ");
        System.out.println("Name : "+name+"\nAge : "+age+"\nCredit : "+credit+"\nStatus : "+result);
    }
}

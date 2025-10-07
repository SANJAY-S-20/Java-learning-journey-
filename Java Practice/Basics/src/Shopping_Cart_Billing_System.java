/*
Shopping Cart Billing System (All Operators Practice)
Problem Statement:

Write a Java program that simulates a simple shopping cart where the user buys multiple items and gets a discount if eligible.
 */

import java.util.Scanner;

public class Shopping_Cart_Billing_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of item purchased : ");
        int items = in.nextInt();

        System.out.println("Price per item : ");
        float price = in.nextFloat();

        float bill = items * price;
        float tax = bill * ( 10f / 100 );

        float sub_bill = bill + tax;


        float discount = (bill > 10000) ? bill * (10f/100) : 0 ;

        System.out.println("Are they member (true/false) : ");
        boolean member = in.nextBoolean();

        float spl_dis = member ? bill * (5f / 100) : 0 ;

        float final_bill = bill + tax - discount - spl_dis ;

        System.out.println(" ------ AK Supermarket ------ ");
        System.out.println("\nNo of items : "+items+"\nPrice per item : "+price+"\nTax : "+tax+"\nSub bill : "+sub_bill+"\nDiscount : "+discount+"\nMember discount : "+spl_dis+"\nFinal bill : "+final_bill);



    }
}

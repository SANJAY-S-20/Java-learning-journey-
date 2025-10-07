/*
Problem Statement:

An insurance company calculates the premium based on a customer’s age and car model year.

Rules:

If age < 25 → base premium = ₹8,000

If age ≥ 25 → base premium = ₹5,000

If car model year < 2018 → add ₹1,000 to premium

Otherwise no extra charge
 */


import java.util.Scanner;

public class Car_Insurance_Premium_Estimator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = in.nextInt();

        System.out.println("Vehicle model year : ");
        int year = in.nextInt();

        int premium;


        if ( age <=0 ){
            System.out.println("Invalid age.");
            return;
        } else if (age>= 25) {
            premium = 8000;
            if ( year >= 2018){
                premium += 1000;
            }
        } else {
            premium = 5000;
            if (year >= 2018){
                premium += 1000;
            }
        }

        System.out.println("----- Car Premium -----");
        System.out.println("Age : "+age+"\nModel Year : "+year+"\nPremium : "+premium);

    }
}

/*
A company gives a 5% salary increment each year for 5 years.
Write a program to display the salary after each year.
 */


import java.util.Scanner;

public class Salary_Increment_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your salary : ");
        float salary = in.nextInt();

        float increment;

        for (int i = 1; i < 5; i++) {
            increment = salary*(5f/100);
            salary += increment;
            System.out.println("Salary "+i+" year : "+salary);
        }
    }
}

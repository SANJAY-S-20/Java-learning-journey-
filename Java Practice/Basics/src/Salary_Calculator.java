/*
Salary Calculator (Arithmetic + Assignment Operators)

A company wants a simple program to calculate an employee’s monthly salary after tax and bonus.
 */

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Employee name : ");
        String name = in.next();

        System.out.println("Base salary : ");
        int salary = in.nextInt();

        float bonus = salary * ( 10f / 100 );
        float tax = salary * ( 5f / 100 );

        float final_salary = salary + bonus - tax;

        System.out.println("Name : "+name+"\nBase salary : "+salary+"\nBonus : "+bonus+"\nTax : "+tax+"\nFinal salary : "+final_salary);
    }
}

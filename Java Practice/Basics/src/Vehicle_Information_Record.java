/*
Problem Statement:

Create a simple program to store and display details about a vehicle.
 */

import java.util.Scanner;

public class Vehicle_Information_Record {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);

       System.out.println("Vehicle Name : ");
       String name = in.next();

       System.out.println("Year : ");
       int year = in.nextInt();

       System.out.println("Engine capacity in liters : ");
       float capacity = in.nextFloat();

       System.out.println("Is it electric : ");
       boolean type = in.nextBoolean();

       System.out.println("Price : ");
       double price = in.nextDouble();

       System.out.println("----- Vehicle Information Record -----");
       System.out.println("Name : "+name+"\nYear : "+year+"\nCapacity : "+capacity+"\ntype : "+type+"\nPrice : "+price);


   }
}
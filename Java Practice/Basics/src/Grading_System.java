/*
Create a program that determines a student’s grade based on marks out of 100.

if - else statement

 */


import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your mark : ");
        int mark = in.nextInt();

        char grade = 'X';

        if (mark <= 100 && mark > 0) {
            if (mark > 90) {
                grade = 'A';
            } else if (mark > 70) {
                grade = 'B';
            } else if (mark > 50) {
                grade = 'C';
            } else if (mark > 35) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        } else {
            System.out.println("Invalid mark.");
        }

        if (grade == 'F'){
            System.out.println("Fail.");
        }else {
            System.out.println("Result : "+grade);
        }
    }
}

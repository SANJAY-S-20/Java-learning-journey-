import java.util.Scanner;

public class Student_Grades_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] std = new int[4][3];
        float[] total = new float[4];
        float[] avg = new float[4];
        char[] grade = new char[4];

        System.out.println("Enter marks for 4 subject for 3 students :");
        for (int i = 0; i < std.length; i++) {
            System.out.println("Student : "+(i+1));
            for (int j = 0; j < std[i].length; j++) {
                std[i][j] = in.nextInt();
                total[i] += std[i][j];
            }

            avg[i] = total[i]/10;

            if (avg[i] > 90){
                grade[i] = 'A';
            } else if (avg[i] > 75) {
                grade[i] = 'B';
            } else if (avg[i] > 50) {
                grade[i] = 'C';
            } else if (avg[i] > 35) {
                grade[i] = 'D';
            }else {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < std.length; i++) {
            System.out.println("Student "+(i+1));
            for (int j = 0; j < std[i].length; j++) {
                System.out.println("Mark : "+std[i][j]);
            }

            System.out.println("Total : "+total[i]+"\nAverage : "+avg[i]+"\nGrade : "+grade[i]);
        }

    }
}
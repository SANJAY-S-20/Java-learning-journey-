import java.util.Arrays;
import java.util.Scanner;

public class Students_Marks_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] table = new  int[3][3];

        System.out.println("ENTER 3 STUDENTS 3 SUBJECT MARKS.");

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }



        for (int i = 0; i < table.length; i++) {
            int total=0;
            System.out.println("Student : "+(i+1));
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
            System.out.println("Total : "+total);
        }

    }
}

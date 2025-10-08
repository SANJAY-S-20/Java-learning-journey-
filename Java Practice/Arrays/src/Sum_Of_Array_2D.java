import java.util.Arrays;
import java.util.Scanner;

public class Sum_Of_Array_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of rows : ");
        int r = in.nextInt();

        System.out.println("Number of columns : ");
        int c = in.nextInt();

        int[][] arr = new int[r][c];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                total += arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Sum : "+total);

    }
}
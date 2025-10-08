import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number of rows : ");
        int row = in.nextInt();

        System.out.println("Number of columns : ");
        int col = in.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}

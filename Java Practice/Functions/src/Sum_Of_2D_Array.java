import java.util.Scanner;

public class Sum_Of_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Rows : ");
        int r = in.nextInt();
        System.out.println("Columns : ");
        int c = in.nextInt();

        int[][] values = new int[r][c];

        System.out.println("Enter values : ");

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = in.nextInt();
            }
        }

        int result = sum(values);

        System.out.println("Total value : "+result);
    }

    static int sum(int[][] value){

        int total=0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                total += value[i][j];
            }
        }
        return total;
    }
}
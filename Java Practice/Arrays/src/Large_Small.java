import java.util.Scanner;

public class Large_Small {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many values : ");
        int[] values = new int[in.nextInt()];

        System.out.println("Enter the values : ");

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max){
                max = values[i];
            }
        }

        int low = values[0];

        for (int i = 0; i < values.length; i++) {

            if (values[i] < low) {
                low = values[i];
            }
        }

        System.out.println("Largest value : "+max+"\nLowest value : "+low);
    }
}

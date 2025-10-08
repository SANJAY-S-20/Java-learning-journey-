import java.util.Scanner;

public class Count_Positive_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many values : ");
        int[] values = new int[in.nextInt()];

        System.out.println("Enter the values : ");
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0){
                positive++;
            }else {
                negative++;
            }
        }

        System.out.println("Positive values : "+positive+"\nNegative values : "+negative);
    }
}

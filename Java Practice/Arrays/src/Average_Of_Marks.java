import java.util.Scanner;

public class Average_Of_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] mark  = new int[5];
        int total = 0;
        int average;

        System.out.println("Enter 5 subject marks : ");

        for (int i = 0; i < mark.length; i++) {
            mark[i] = in.nextInt();
        }

        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }

        average = total/5;

        System.out.println("Total : "+total+"\nAverage : "+average);

    }
}

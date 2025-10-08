import java.util.Scanner;

public class Student_Analyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        int avg;
        int max;
        int low;

        System.out.println("Enter how many students : ");
        int[] std = new int[in.nextInt()];

        System.out.println("Marks : ");

        for (int i = 0; i < std.length; i++) {
            std[i] = in.nextInt();
            total += std[i];
        }

        avg = total/std.length;

        max = std[0];
        for (int i = 0; i < std.length; i++) {
            if(std[i] > max){
                max = std[i];
            }
        }

        low = std[0];
        for (int i = 0; i < std.length; i++) {
            if (std[i] < low){
                low = std[i];
            }

        }

        System.out.println("Total : "+total+"\nAverage : "+avg+"\nMaximum mark : "+max+"\nLowest mark : "+low);

    }
}

import java.util.Scanner;

public class Finding_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many values : ");
        int[] values = new int[in.nextInt()];

        System.out.println("Enter the values : ");
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        System.out.println("What value you need to find :");
        int v = in.nextInt();

        boolean found = false;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == v){
                System.out.println("It's in the array");
                found = true;
                break;
            }
        }

        if ( !found ){
            System.out.println("It's not in the array.");
        }

    }
}

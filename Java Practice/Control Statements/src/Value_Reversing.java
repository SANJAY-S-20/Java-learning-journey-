import java.util.Scanner;

public class Value_Reversing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value : ");
        int value = in.nextInt();

        int reverse = 0;

        while ( value > 0 ){
            int rem = value % 10;

            reverse = (reverse * 10 )+ rem;
            value = value/10;
        }

        System.out.println("Reverse value : "+reverse);

    }
}

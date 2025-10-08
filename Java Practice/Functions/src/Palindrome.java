import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What number need to be checked : ");
        int pal = in.nextInt();



        if(is_pal(pal)){
            System.out.println(pal+" is Palindrome.");
        }
        else {
            System.out.println(pal+" is not palindrome.");
        }

    }

    static boolean is_pal(int n){
        int original = n;
        int rev=0;

        while (n > 0){
            int rem = n%10;
            rev = rev *10+rem;

            n = n/10;
        }

        return (rev == original);
    }
}

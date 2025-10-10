import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>(5);

        System.out.println("How many names : ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(in.next());
        }

        System.out.println("Names : \n"+list);
    }
}

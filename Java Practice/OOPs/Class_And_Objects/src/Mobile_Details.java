import java.util.Scanner;

class Mobile{
    String brand;
    int year;
    float price;

    void details(){
        System.out.println("Brand : "+brand+"\nYear : "+year+"\nPrice : "+price);
    }
}

public class Mobile_Details {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        System.out.println("Mobile 1 Details : ");
        System.out.println("Model : ");
        m1.brand = in.next();
        System.out.println("Year : ");
        m1.year = in.nextInt();
        System.out.println("Price : ");
        m1.price = in.nextFloat();

        System.out.println("Mobile 2 Details : ");
        System.out.println("Model : ");
        m2.brand = in.next();
        System.out.println("Year : ");
        m2.year = in.nextInt();
        System.out.println("Price : ");
        m2.price = in.nextFloat();

        m1.details();
        m2.details();



    }
}
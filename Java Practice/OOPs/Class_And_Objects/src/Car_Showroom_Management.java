class Showroom{
    String brand;
    String model;
    int year;
    double price;
    static int seat;

    Showroom(){
        brand = "TATA";
        model = "Safari";
        year = 2020;
        price = 2000000;
    }

    Showroom(String a, String b, int c, double d){
        brand = a;
        model = b;
        year = c;
        price = d;
    }

    void display(){
        System.out.println(" ------ Car Showroom ------");
        System.out.println("Brand : "+brand+"\nModel : "+model+"\nYear : "+year+"\nPrice : "+price+"\nSeating Capacity : "+seat);
    }
}


public class Car_Showroom_Management {
    public static void main(String[] args) {
        Showroom car_1 = new Showroom();
        Showroom car_2 = new Showroom("Audi", "Ghost", 2020, 30000000);

        Showroom.seat = 4;

        car_1.display();
        car_2.display();
    }
}

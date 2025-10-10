class Vehicle{
    String brand;
    String model;
    int price_per_day;
    int days;

    Vehicle(String b, String m, int p, int days){
        this.brand = b;
        this.model = m;
        this.price_per_day = p;
        this.days = days;
    }

    void display(){
        System.out.println(" ----- Vehicle rental system ----- ");
        System.out.println("\n ----- Details ----- ");
        System.out.println("Brand : "+brand+"\nModel : "+model+"\nPrice per day : "+price_per_day+"\nDays : "+days);
    }

    int rent_calculation(int r, int da){
        return r*da;
    }

}

class Bike extends Vehicle{
    int capacity;
    int helmet;

    Bike(String b, String m, int p, int days, int c, int h){
        super(b,m,p,days);
        this.capacity = c;
        this.helmet = h;
    }

    @Override
    void display(){
        System.out.println(" ----- Vehicle rental system ----- ");
        System.out.println("\n ----- Details ----- ");
        System.out.println("Brand : "+brand+"\nModel : "+model+"\nPrice per day : "+price_per_day+"\nDays : "+days+"\nCapacity : "+capacity+"\nHelmet"+helmet);
    }

}

class Car extends Vehicle{
    int seats;

    Car(String b, String m, int p,int days, int d){
        super(b,m,p,days);
        this.seats = d;
    }

    @Override
    void display(){
        System.out.println(" ----- Vehicle rental system ----- ");
        System.out.println("\n ----- Details ----- ");
        System.out.println("Brand : "+brand+"\nModel : "+model+"\nPrice per day : "+price_per_day+"\nSeats : "+seats);
    }

}

public class Vehicle_Rental_System {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Tata","Safari",7000,4);
        Vehicle b1 = new Bike("Yamaha", "Rx",300,5,10,2);
        Vehicle c1 = new Car("Audi","Ghost",10000, 5,4);

        v1.display();
        System.out.println("\nTotal rent : "+v1.rent_calculation(v1.price_per_day, v1.days));
        b1.display();
        System.out.println("\nTotal rent : "+b1.rent_calculation(b1.price_per_day, b1.days));
        c1.display();
        System.out.println("\nTotal rent : "+c1.rent_calculation(c1.price_per_day, c1.days));



    }
}

/*
✅ Inheritance

✅ Constructor Overriding (super(...) usage)

✅ Method Overriding (same name, new implementation)

✅ Polymorphism in action
 */
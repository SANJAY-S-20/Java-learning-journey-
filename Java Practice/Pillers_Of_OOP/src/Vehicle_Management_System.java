class Vehicle{
    String brand;
    int year;
    double price;

    Vehicle(String b,int y, double p){
        this.brand = b;
        this.year = y;
        this.price = p;
    }

    void display(){
        System.out.println("===== Vehicle Detail =====");
        System.out.println("Brand name : "+brand+"\nYear : "+year+"\nPrice : "+price);
    }
}

class Car extends Vehicle{
    String model;
    int doors;

    Car(String b,int y,double p,String m,int d){
        super(b,y,p);
        this.model = m;
        this.doors = d;
    }

    @Override
    void display(){
        System.out.println(" ----- Full car detail ----- ");
        System.out.println("Brand name : "+brand+"\nYear : "+year+"\nPrice : "+price+"\nModel : "+model+"\nDoors : "+doors);

    }
}

class Bike extends Vehicle{
    String type;
    boolean abs;


    Bike(String b,int y,double p,String t,boolean ab){
        super(b,y,p);
        this.type = t;
        this.abs = ab;
    }

    @Override
    void display(){
        System.out.println("Brand name : "+brand+"\nYear : "+year+"\nPrice : "+price+"\nType : "+type+"\nABS : "+abs);
    }
}

public class Vehicle_Management_System {
    public static void main(String[] args) {

        Car c1 = new Car("Tata",2020,2000000,"Safari",4);
        Vehicle V1 = new Vehicle("Audi",2025,20000000);
        Bike b1 = new Bike("Yamaha",2020,2000000,"Sports",true);

        V1.display();
        c1.display();
        b1.display();

    }
}

import java.util.Scanner;

class Students{
    String name;
    int age;
    private float fees;


    Students(String a, int b , float c){
        this.name = a;
        this.age = b;
        this.fees = c;
    }

    void display(){
        System.out.println("Details : \n");
        System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nFees : "+this.fees);
    }

    void discount(float a){
        if(a > 50000){
            this.fees -= 5000;
        }else {
            System.out.println("No discount.");
        }
    }
}

public class Student_Grade_Management {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Name : ");
        String n = in.next();

        System.out.println("Age : ");
        int age = in.nextInt();

        System.out.println("Fees");
        float fee = in.nextFloat();

        Students s1 = new Students(n, age, fee);

        s1.display();

        System.out.println("\nLet's check for discount ; ");

        s1.discount(fee);

    }
}

class Customer{
    String name;
    String mail;
    float bill;


    Customer(String n, String e, float b){
        name = n;
        mail = e;
        bill = b;
    }

    void display(){
        System.out.println("Name : "+name+"\nE-Mail : "+mail+"\nBill : "+bill);
    }

}

class Premium extends Customer{
    float discount;
    float f_bill;



    Premium(String n,String e,float b, float d){
        super(n,e,b);
        discount = d;
    }


    void  calculation(){
        float discountAmount = (bill * discount) / 100;
        f_bill = bill - discountAmount;
    }

    void display_1(){

            System.out.println("Name : "+name+"\nE-Mail : "+mail+"\nBill : "+bill+"\nDiscount :"+f_bill);

    }
}



public class Online_Shopping_System {
    public static void main(String[] args) {
        Customer c1 = new Customer("sanjay","san_email",450.5f);
        Premium p1 = new Premium("sriram", "sri_mail", 5000, 5);

        System.out.println("Normal customer\n");
        c1.display();
        System.out.println("Premium customer\n");
        p1.calculation();
        p1.display_1();

    }
}

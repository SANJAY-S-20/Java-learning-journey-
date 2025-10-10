import java.util.Scanner;

class Bank{
    String Holder_name;
    int act_no;
    float balance;


    void check(){
        System.out.println("Your current balance : "+balance);
    }

    void withdraw(float amt){
        if (amt < balance){
            balance -= amt;
            System.out.println("Withdraw amount : " + amt +"\nCurrent balance : "+balance);
        }else {
            System.out.println("Insufficient balance.");
        }
    }

    void deposit(float dep){
        balance += dep;
        System.out.println("Deposited amount : "+dep+"\nCurrent balance : "+balance);
    }

    void detail(){
        System.out.println("Name : "+Holder_name+"\nAccount no : "+act_no+"\nBalance : "+balance);
    }
}

public class Mini_Banking_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bank customer = new Bank();


        System.out.println("Welcome to SIB");
        System.out.println("Customer name : ");
        customer.Holder_name = in.next();
        System.out.println("Customer Account no : ");
        customer.act_no = in.nextInt();
        System.out.println("Initial balance : ");
        customer.balance = in.nextFloat();

        int op;
        do {
            System.out.println("----- Select your option -----");
            System.out.println("1.Account Details\n2.Check Balance\n3.Deposit\n4.Withdraw\5.Exit");
            op = in.nextInt();

            switch (op){
                case 1:

                    customer.detail();

                    break;
                case 2:
                    customer.check();
                    break;
                case 3:
                    System.out.println("How much you want to deposit : ");
                    float n = in.nextFloat();
                    if (n > 0){
                        customer.deposit(n);
                    }else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("How much you want to withdraw : ");
                    float a = in.nextFloat();
                    customer.withdraw(a);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        }while (op != 5);
    }
}


import java.util.Scanner;

abstract class Account{
    final private String actHolderName;
    final private int actNumber;
    private double balance;


    Account(String actHolderName,int actNumber,double balance){
        this.actHolderName = actHolderName;
        this.actNumber = actNumber;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getActHolderName() {
        return actHolderName;
    }

    public int getActNumber() {
        return actNumber;
    }

    public double getBalance() {
        return balance;
    }


    abstract void withdraw(double amount);

    final void deposit(double amount){
        if (amount > 0){
            setBalance(getBalance()+amount);
        }
    }

    final void check(){
        System.out.println("Your current balance : "+getBalance());
    }

     void interest(){}


    void display(){
        System.out.println("Account Holder Name : "+getActHolderName()+"\nAccount Number : "+getActNumber());
    }
}

class Savings extends Account {

    double rate;

    Savings(String actHolderName, int actNumber, double balance,double rate) {
        super(actHolderName, actNumber, balance);
        this.rate = rate;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("Successfully withdraw : "+amount);
        }else {
            System.out.println("Insufficient fund.");
        }
    }


    void interest(){
        double value;
        value = getBalance()*(rate/100);
        setBalance(getBalance()+value);
        System.out.println("Interest added : "+value);
        System.out.println("Current balance : "+getBalance());
    }

    @Override
    void display() {
        super.display();
        System.out.println("Balance : "+getBalance());
    }

}

class CurrentAccount extends Account{

    final double overDraft = 10000;

    CurrentAccount(String actHolderName, int actNumber, double balance) {
        super(actHolderName, actNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance()+overDraft){
            setBalance(getBalance()-amount);
            System.out.println("Successfully withdraw : "+amount);
        }else {
            System.out.println("Insufficient fund.");
        }
    }


    @Override
    void display() {
        super.display();
        System.out.println("Over draft limit : "+overDraft+" Balance : "+getBalance());
    }
}



public class BankSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" ----- Welcome to SBI Bank ----- ");

        System.out.println("Account holder name : ");
        String name = in.next();

        int actNo = 500 +(int)(Math.random()*1000);

        System.out.println("Initial balance : ");
        double balance = in.nextDouble();

        System.out.println("Interest rate : ");
        double value = in.nextDouble();

        Account a1 = null;

        while (a1 == null){
            try{
                System.out.println("Account type (savings/Current) : ");
                String actType = in.next();

                AccountType type = AccountType.valueOf(actType.toUpperCase());

                if (type == AccountType.SAVINGS){
                    a1 = new Savings(name,actNo,balance,value);
                    System.out.println("Account created successfully.");
                    a1.display();

                } else if (type == AccountType.CURRENT) {
                    a1 = new CurrentAccount(name,actNo,balance);
                    System.out.println("Account created successfully.");
                    a1.display();

                } else {
                    throw new IllegalArgumentException("Invalid account type.");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Error : "+e.getMessage());
            }
        }



        int op;

        do {

            System.out.println("Choose your option : ");
            System.out.println("1. Deposit \n2. Withdraw \n3. Check Balance \n4. Interest \n5. Exit");
            op = in.nextInt();
            in.nextLine();

             Operation option = Operation.choice(op);

             if (option == null){
                 continue;
             }


            switch (option) {
                case DEPOSIT:
                    System.out.println("How much you want to deposit : ");
                    double depoAmt = in.nextDouble();
                    a1.deposit(depoAmt);
                    a1.display();
                    break;
                case WITHDRAW:
                    System.out.println("How much you want to withdraw : ");
                    double withAmt = in.nextDouble();
                    a1.withdraw(withAmt);
                    a1.display();
                    break;
                case CHECK:
                    a1.check();
                    break;
                case INTEREST:
                    if (a1 instanceof Savings){
                        a1.interest();
                    }else {
                        System.out.println("Interest is not applicable for Current Account.");
                    }
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Choose the right option.");
            }
        }while(op !=5 );
    }
}

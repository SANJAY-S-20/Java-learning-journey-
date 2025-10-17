import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Bank {

    Scanner in = new Scanner(System.in);

    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private int accountCounter = 1000;

    static BankAccount systemAccount ;

    Bank(){
        systemAccount = new CurrentAccount("System Account ",5555,0);
        accounts.add(systemAccount);
    }



    public BankAccount createAccount(String name, AccountType type, double balance, double interestRate) {
        int accNum = accountCounter++;
        BankAccount acc;
        if (type == AccountType.SAVINGS) {
            acc = new Savings(name, accNum, balance, interestRate);
        } else {
            acc = new CurrentAccount(name, accNum, balance);
        }
        accounts.add(acc);
        System.out.println("\nAccount Created Successfully!");
        acc.checkDetails();
        systemAccount.setBalance(systemAccount.getBalance()-balance);
        systemAccount.addTransaction("Initial deposit : "+accNum+" | ",balance);
        return acc;
    }

    public void transferMoney(int fromAc, int toAc, double amount){
        BankAccount fromAcc = findAccount(fromAc);
        BankAccount toAcc = findAccount(toAc);

        if (fromAcc == null || toAcc == null){
            System.out.println("Account not found.");
            return;
        }

        if ( amount < 0 || fromAcc.getBalance() < amount){
            System.out.println("Invalid amount or Insufficient fund.");
            return;
        }

        fromAcc.setBalance(fromAcc.getBalance() - amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        fromAcc.addTransaction("Transferred to "+toAcc.getActNumber(), amount);
        toAcc.addTransaction("Received from "+fromAcc.getActNumber(), amount);

        System.out.println("Transferred Successfully.");


    }

    public void  searchAccount(){
        System.out.println("Enter account no : ");
        int act = in.nextInt();
        List<BankAccount> matchingAct = accounts.stream().filter(acc-> Integer.toString(acc.getActNumber()).startsWith(Integer.toString(act))).toList();

        if (matchingAct.isEmpty()){
            System.out.println(" ****** No account fount ****** ");
        } else {
            matchingAct.forEach(acc -> acc.checkDetails());
        }
    }


    public BankAccount findAccount(int accNo) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accNo == 5555){
                System.out.println("System Account Log-In | Special Access Needed\nEnter password : ");
                String pd = in.next();
                if (pd.equals("Admin123")){
                    return accounts.get(i);
                } else {
                    return null;
                }
            }
            if (accounts.get(i).getActNumber() == accNo) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).checkDetails();
        }
    }
}



class Transaction {
    final public String type;
    public double amount;
    private final LocalDateTime dateTime;
    static int counter = 5000;

    final private int txtId = counter++;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();

    }

    @Override
    public String toString() {

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
        String formattedstring = dateTime.format(formatted);

        return "TxtId : "+txtId +" | " + type + " : ₹ " + amount +" | "+formattedstring;
    }



}



abstract class BankAccount{
    final private String actHolderName;
    private int actNumber;
    private double balance;
    private List<Transaction> transactions;

    BankAccount(String actHolderName,int actNumber,double balance){
        this.actHolderName = actHolderName;
        this.actNumber = actNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getActNumber() { return actNumber;}

    public double getBalance() { return balance; }

    void deposit(double amount){
        if (amount < 0){
            System.out.println("Amount should be positive.");
        }else {
            setBalance(getBalance()+amount);
            System.out.println("Successfully deposited : "+amount+"\nCurrent balance  : "+getBalance());
            addTransaction("Deposit",amount);
            Bank.systemAccount.setBalance(Bank.systemAccount.getBalance()-amount);
            Bank.systemAccount.addTransaction("Deposited to : "+getActNumber()+" | ", amount);

        }
    }

    abstract void withdraw(double amount);

    void checkDetails(){
        System.out.println(" ----- Account Details ----- ");
        System.out.println("Account Holder Name : "+actHolderName);
        System.out.println("Account Number : "+actNumber);
        System.out.println("Balance : "+getBalance());
    }

    void checkBalance(){
        System.out.println("Your current balance : "+getBalance());
    }

    void addTransaction(String type,double amount){

       transactions.add(new Transaction(type, amount));
    }

    public void showTransactions() {
        System.out.println("\n--- All Transactions ---");

        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            System.out.println(t);
        }

        System.out.println("Current balance : "+getBalance());
    }


    void addInterest(){ }
}

class Savings extends BankAccount{
    private double interest;

    Savings(String name,int actNo, double balance,double rate){
        super(name,actNo,balance);
        this.interest = rate;
    }

    @Override
    void withdraw(double amount) {
        if (amount < 0 ){
            System.out.println("Invalid withdraw amount.");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient fund.");
        } else {
            setBalance(getBalance()-amount);
            System.out.println("Successfully withdraw : "+amount +"\nCurrent balance  : "+getBalance());
            addTransaction("Withdraw",amount);
        }
    }

    @Override
    void addInterest() {
        double interestRate = getBalance()*(interest/100);
        setBalance(getBalance()+interestRate);
        addTransaction("Interest",interestRate);
        System.out.println("Interest added : "+String.format("%.2f",interestRate));
        Bank.systemAccount.setBalance(Bank.systemAccount.getBalance()-interestRate);
        Bank.systemAccount.addTransaction("Interest added to "+getActNumber()+" | ", interestRate);
    }
}

 class CurrentAccount extends BankAccount{

    private double overdraft = 10000 ;

    CurrentAccount(String name,int actNo,double balance){
        super(name,actNo,balance);
    }

     @Override
     void withdraw(double amount) {
         if (amount < 0 ){
             System.out.println("Invalid withdraw amount.");
         } else if (amount > getBalance()+overdraft) {
             System.out.println("Insufficient fund.");
         } else {
             setBalance(getBalance()-amount);
             System.out.println("Successfully withdraw : "+amount +"\nCurrent balance  : "+getBalance());
             addTransaction("Withdraw",amount);
         }
     }

     @Override
     void addInterest() {
         System.out.println("Interest not applicable for current account.");
     }
 }


public class BankSystem {
    private static Scanner in = new Scanner(System.in);
    private static Bank bank = new Bank();
    Bank system = new Bank();


    public static void main(String[] args) {

        System.out.println(" ===== Welcome to SBI Bank ===== \n");
        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Search Account");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Name: ");
                    String name = in.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = in.nextDouble();
                    in.nextLine();
                    AccountType type = null;
                    while (type == null) {
                        System.out.print("Enter Account Type (SAVINGS/CURRENT): ");
                        String input = in.next().toUpperCase();
                        try {
                            type = AccountType.valueOf(input);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid account type! Please enter SAVINGS or CURRENT.");
                        }
                    }
                    double interestRate = 0;
                    if (type == AccountType.SAVINGS) {
                        System.out.print("Enter Interest Rate: ");
                        interestRate = in.nextDouble();
                    }
                    bank.createAccount(name, type, balance, interestRate);
                }
                case 2 -> {
                    System.out.print("Enter Account Number: ");
                    int accNo = in.nextInt();
                    BankAccount acc = bank.findAccount(accNo);
                    if (acc != null) {
                        System.out.println("Logged in successfully.");
                        performOperations(acc);
                    }
                    else System.out.println("Account not found!");
                }
                case 3 -> bank.displayAllAccounts();
                case 4 -> bank.searchAccount();
                case 5 -> {
                    return;
                }
            }
        }
    }

    private static void performOperations(BankAccount acc) {
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Add Interest (Savings Only)");
            System.out.println("6. Transfer Money");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int opt = in.nextInt();

            Operation option = Operation.choice(opt);

            if (option == null){
                continue;
            }

            switch (option) {
                case DEPOSIT -> {
                    System.out.print("Enter deposit amount: ");
                    acc.deposit(in.nextDouble());
                }
                case WITHDRAW -> {
                    System.out.print("Enter withdrawal amount: ");
                    acc.withdraw(in.nextDouble());
                }
                case CHECK -> acc.checkBalance();
                case SHOW_TRANSACTION -> acc.showTransactions();
                case INTEREST -> acc.addInterest();
                case TRANSFER -> transferMoney(acc);
                case EXIT -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void transferMoney(BankAccount fromAcc){
        System.out.println("Enter receiver account no : ");
        int toAcc = in.nextInt();
        System.out.println("How much you want to transfer : ");
        double amount = in.nextInt();

        bank.transferMoney(fromAcc.getActNumber(), toAcc,amount);

    }


}



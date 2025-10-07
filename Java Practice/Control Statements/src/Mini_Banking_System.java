import java.util.Scanner;

public class Mini_Banking_System {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float balance = 10000;
        int op;


        do {

            System.out.println("----- Select one option -----");
            System.out.println("1.Check balance \n 2.Deposit \n 3.Withdraw \n 4.Exit");
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Balance : " + balance);
                    break;
                case 2:
                    System.out.println("How much you want to deposit : ");
                    int amount = in.nextInt();
                    balance += amount;
                    System.out.println("Balance : " + balance);
                    break;
                case 3:
                    System.out.println("How much you want to withdraw : ");
                    int withdraw = in.nextInt();
                    if (withdraw < balance ){
                        balance -= withdraw;
                        System.out.println("Withdraw amount : " + withdraw);
                        System.out.println("Balance : " + balance);
                    }else{
                        System.out.println("Insufficient fund.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using.");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }while (op != 4);

    }
}

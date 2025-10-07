/*
You deposit ₹10,000 in a savings account.
Every month, the amount grows by 2%.
Display your balance for the first 12 months.
 */


public class Bank_Savings_Growth {
    public static void main(String[] args) {


        float deposit = 10000;
        float growth;

        for (int i = 1; i < 12; i++) {
            growth = deposit*(2f/100);
            deposit += growth;

            System.out.println("Year "+i+" : "+deposit);
        }

    }
}

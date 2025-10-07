/*
💡 4️⃣ Electricity Usage Pattern
Problem Statement:

Simulate electricity usage over 12 months.
The usage starts at 120 units and increases by 5% each month.
The rate per unit is ₹3.50.
Print the total bill per month and a yearly total.
 */


public class Electricity_Usage_Pattern {
    public static void main(String[] args) {

        float unit = 120;
        float rate = 3.50f;
        float yearly = 0;

        for (int i = 0; i <=12 ; i++) {

            float price = unit*rate;

            System.out.println("Month : "+i+"Unit : "+unit+"Price : "+price);

            yearly += price;

            unit = unit + unit *  (5f/100);

        }

        System.out.println("Yearly usage price : "+yearly);
    }
}

import java.util.Scanner;

public class Student_Admissions_Billing_System {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tot_std;

        do{
            System.out.println("Enter how many students :");
            tot_std =in.nextInt();
        }while (tot_std <= 0);

        String[] name = new String[tot_std];
        int[] id = new int[tot_std];
        int[] age = new int[tot_std];
        int[] mark = new int[tot_std];
        boolean[] scholar = new boolean[tot_std];
        char[] grade = new char[tot_std];
        int op;

        float base_fee = 15000;
        float discount = 0;
        float spl_discount = 0;
        float[] fee = new float[tot_std];

        for (int i = 0; i < tot_std; i++) {



            System.out.println("Student : "+i);
            System.out.println("Name : ");
            name[i] = in.next();
            System.out.println("ID : ");
            id[i] = in.nextInt();
            System.out.println("Age : ");
            age[i] = in.nextInt();
            if (age[i] < 0){
                System.out.println("Entered invalid input skipping this student.");
                continue;
            }

            if ( age[i] < 12 ){
                base_fee = 12000;
            }

            System.out.println("Mark : ");
            mark[i] = in.nextInt();
            if (mark[i] < 0 || mark[i] > 100){
                System.out.println("Invalid mark skipping this student.");
                continue;
            }

            if ( mark[i] > 90){
                grade[i] = 'A';
            } else if (mark[i] > 75) {
                grade[i] = 'B';
            } else if (mark[i] > 50) {
                grade[i] = 'C';
            } else if (mark[i] > 35) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            if ( mark[i] > 90){
                discount = base_fee * (10f/100);
            } else if (mark[i] > 75) {
                discount = base_fee * (5f/100);
            }

            System.out.println("Is the student have scholarship (T/F) : ");
            scholar[i] = in.nextBoolean();

            if (scholar[i]){
                spl_discount = base_fee * ( 20f/100);
            }else {
                spl_discount = 0;
            }

            fee[i] = base_fee - discount - spl_discount ;

        }

        do{
            System.out.println("Select your options : ");
            System.out.println("1.List all students\n2.Search by ID\n3.Exit");

            op = in.nextInt();

            switch (op){
                case 1:
                    for (int i = 0; i < tot_std; i++) {
                        System.out.println("Student : "+i);
                        System.out.println("Name : "+name[i]+"\nID : "+id[i]+"\nAge : "+age[i]+"\nMark : "+mark[i]+"\nGrade : "+grade[i]+"\nScholar : "+scholar[i]);

                        System.out.println("Discount : "+discount+"\nSpecial discount : "+spl_discount+"\nFee : "+fee[i]);

                    }
                    break;

                case 2:
                    System.out.println("Enter the ID : ");
                    int s_id = in.nextInt();

                    for (int i = 0; i < tot_std; i++) {
                        if (id[i] == s_id){
                            System.out.println("Name : "+name[i]+"\nID : "+id[i]+"\nAge : "+age[i]+"\nMark : "+mark[i]+"\nGrade : "+grade[i]+"\nScholar : "+scholar[i]);

                            System.out.println("Discount : "+discount+"\nSpecial discount : "+spl_discount+"\nFee : "+fee[i]);
                        }
                    }
                    break;

                default:
                    System.out.println("Enter right option.");
            }

        }while(op != 3);



    }
}
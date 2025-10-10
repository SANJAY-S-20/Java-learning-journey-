class Students{
    String name;
    String dept;
    int roll_no;

    Students(String n, String d, int r){
        name = n;
        dept = d;
        roll_no = r;
    }

    void display(){
        System.out.println("========== Student Detail ==========\n");
        System.out.println("Name : "+name+"\nDept : "+dept+"\nRoll no : "+roll_no);
    }
}

class Exam extends Students{
    int sub_1;
    int sub_2;
    int sub_3;
    int total;

    Exam(String n, String d, int r,int a, int b, int c){
        super(n, d, r);
        sub_1 = a;
        sub_2 = b;
        sub_3 = c;
    }

    void total_mark(){
        total = sub_1+sub_2+sub_3;
    }

    void display_info(){
        System.out.println("Name : "+name+"\nDept : "+dept+"\nRoll no : "+roll_no+"\nTotal mark : "+total);
    }
}



public class College_Result_Management_System {
    public static void main(String[] args) {
        Students s1 = new Students("Sanjay","CT",101);
        Exam e1 = new Exam("Sanjay","CT",202,22,33,44);

        s1.display();
        e1.total_mark();
        e1.display_info();
    }
}

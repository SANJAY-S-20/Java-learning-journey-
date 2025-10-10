class Details{
    String name;
    int age;
    int standard;

    Details(){
        name = null;
        age = 0;
        standard = 0;
    }

    Details(String n, int a, int s){
        name = n;
        age = a;
        standard = s;
    }

    void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nStandard : "+standard);
    }
}

class Mark extends Details{
    int mark;

    Mark(){
        mark = 0;
    }

    Mark(String n, int a, int s, int m){
        super(n, a, s);
        mark = m;
    }

    void check(int c){
        if (c >= 40 ){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    void display_info(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nStandard : "+standard+"\nMark : "+mark);
    }
}

public class Student {
    public static void main(String[] args) {
        Mark m1 = new Mark("sanjay", 20, 5,66);

        //m1.display();
        m1.display_info();
        m1.check(66);
    }
}

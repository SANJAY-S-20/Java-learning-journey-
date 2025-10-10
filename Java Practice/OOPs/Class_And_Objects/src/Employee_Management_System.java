class Emp{
    final private String name;
    final private int id;
    private float salary;

    Emp(){
        name = "Sanjay";
        id = 777;
        salary = 100000;
    }

    Emp(String a, int b, float c){
        name = a;
        id = b;
        salary = c;
    }

    public float getSalary(){
        return salary;
    }

    public void setSalary(float salary){
        if (salary > 0){
            this.salary =salary;
        }else {
            System.out.println("invalid");
        }
    }

    public String getName(){
        return name;
    }

    void display(){
        System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary);
    }
}

public class Employee_Management_System {
    public static void main(String[] args) {

        Emp e1 = new Emp();
        Emp e2 = new Emp("Sriram", 101, 200000);

        e1.display();
        e2.display();

        System.out.println("Changing salary");
        e2.setSalary(5000);

        System.out.println("Final salary of "+e2.getName()+" : "+e2.getSalary());

    }
}

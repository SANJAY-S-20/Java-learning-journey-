class Employee{
    String name;
    float salary;
    int id;
    float bonus;


    Employee(){
        name = "Unknown";
        id = 0;
        salary = 0;
        bonus = 0;
    }

    Employee(String a, float b, int c, float d){
        name = a;
        salary = b;
        id = c;
        bonus = d;
    }

    void display(){
        System.out.println("------ Employee Details ------");
        System.out.println("Name : "+name+"\nId : "+id+"\nSalary : "+salary+"\nBonus : "+bonus);

    }
}

public class Employee_Salary_Calculator {
    public static void main(String[] args) {

        Employee emp_1 = new Employee();
        Employee emp_2 = new Employee("Sanjay", 101, 100000, 5000);

        emp_1.display();
        emp_2.display();

    }
}

class Employee {
    String empName;
    int empID;
    double salary;

    Employee() {
        empName = "Unknown";
        empID = 0;
        salary = 0.0;
    }

    Employee(String name, int id, double sal) {
        empName = name;
        empID = id;
        salary = sal;
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Salary: " + salary);
    }
}

public class EmpMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101, 50000);
        Employee emp2 = new Employee();

        emp1.display();
        emp2.display();
    }
}
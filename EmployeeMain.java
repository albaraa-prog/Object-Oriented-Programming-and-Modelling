class Employees {
    String employeeID;
    double salary;

    void inputvalues(String ID, double S) {
        employeeID = ID;
        salary = S;
    }

    void calculateTotalSalary(double bonus) {
        salary += bonus;
    }

    void Display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Original Salary: $" + salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.inputvalues("EMP001", 50000);
        emp.Display();
        emp.calculateTotalSalary(5000);
        System.out.println("Incremented Salary: $" + emp.salary);
    }
}

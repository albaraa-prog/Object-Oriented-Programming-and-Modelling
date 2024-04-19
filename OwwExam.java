class Employeem {
    String empName;
    int empID;
    double basicSalary, houseAllowance;

    // Parameterized constructor
    Employeem(String empName, int empID, double basicSalary, double houseAllowance) {
        this.empName = empName;
        this.empID = empID;
        this.basicSalary = basicSalary;
        this.houseAllowance = houseAllowance;
    }

    // Non-parameterized constructor
    Employeem() {
        this("", 0, 0.0, 0.0); // Calling the parameterized constructor with default values
    }

    double calculateTotalSalary() {
        return basicSalary + houseAllowance;
    }

    void display() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("House Allowance: " + houseAllowance);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class OwwExam {
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Employeem emp1 = new Employeem("Al Baraa", 21314, 300, 450);
        System.out.println("\nEmployee 1:");
        emp1.display();
        System.out.println();

        // Creating an Employee object using the non-parameterized constructor
        Employeem emp2 = new Employeem();
        emp2.empName = "meow";
        emp2.empID = 400560;
        emp2.basicSalary = 100000;
        emp2.houseAllowance = 100000;
        System.out.println("Employee 2:");
        emp2.display();
    }
}

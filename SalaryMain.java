// Interface Tax
interface Tax {
    double TAX_RATE = 0.05; // Tax rate constant

    double calcTax(double salary); // Method to calculate tax
    double calcNetSalary(double grossSalary); // Method to calculate net salary
    void display(double grossSalary, double tax, double netSalary); // Method to display salary details
}

// Class Salary implementing the Tax interface
class Salary implements Tax {
    double grossSalary; // Data member for gross salary

    // Constructor to assign value to the data member using parameter
    Salary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    // Implementation of interface method to calculate tax
    public double calcTax(double salary) {
        return salary * TAX_RATE;
    }

    // Implementation of interface method to calculate net salary
    public double calcNetSalary(double grossSalary) {
        return grossSalary - calcTax(grossSalary);
    }

    // Implementation of interface method to display salary details
    public void display(double grossSalary, double tax, double netSalary) {
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Tax: $" + tax);
        System.out.println("Net Salary: $" + netSalary);
    }
}

// Main class
public class SalaryMain {
    public static void main(String[] args) {
        // Create an object of Salary class
        Salary salaryObj = new Salary(50000.0); // Example gross salary

        // Calculate tax
        double tax = salaryObj.calcTax(salaryObj.grossSalary);

        // Calculate net salary
        double netSalary = salaryObj.calcNetSalary(salaryObj.grossSalary);

        // Display salary details
        salaryObj.display(salaryObj.grossSalary, tax, netSalary);
    }
}


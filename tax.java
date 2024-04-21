interface Tax {
    double TAX_RATE = 0.05;

    double calcTax(double salary);

    double calcNetSalary(double grossSalary);

    void display(double grossSalary, double tax, double netSalary);
}

class Salary implements Tax {
    private double grossSalary;

    public Salary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public double calcTax(double salary) {
        return salary * TAX_RATE;
    }

    @Override
    public double calcNetSalary(double grossSalary) {
        double tax = calcTax(grossSalary);
        return grossSalary - tax;
    }

    @Override
    public void display(double grossSalary, double tax, double netSalary) {
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Tax: $" + tax);
        System.out.println("Net Salary: $" + netSalary);
    }
}

class ain {
    public static void main(String[] args) {
        double grossSalary = 50000; // Example gross salary
        Salary salaryObj = new Salary(grossSalary);
        double tax = salaryObj.calcTax(grossSalary);
        double netSalary = salaryObj.calcNetSalary(grossSalary);
        salaryObj.display(grossSalary, tax, netSalary);
    }
}

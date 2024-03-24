class Calculator {
    int intResult;
    double doubleResult;

    void Multiply(int a, int b) {
        intResult = a * b;
    }

    void Multiply(int a, int b, int c) {
        intResult = a * b * c;
    }

    void Multiply(double a, double b) {
        doubleResult = a * b;
    }

    void Multiply(double a, double b, double c) {
        doubleResult = a * b * c;
    }

    void displayResult() {
        if (intResult != 0)
            System.out.println("Result of integer multiplication: " + intResult);
        else if (doubleResult != 0.0)
            System.out.println("Result of double multiplication: " + doubleResult);
    }
}

public class CalcuMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.Multiply(2, 3);
        calc.displayResult();

        calc.Multiply(2, 3, 4);
        calc.displayResult();

        calc.Multiply(2.5, 3.5);
        calc.displayResult();

        calc.Multiply(2.5, 3.5, 4.5);
        calc.displayResult();
    }
}

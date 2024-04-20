class Boxm{
    private double length;
    private double breadth;
    private double height;

    // First setValues method with no parameters
    void setValues() {
        length = 10.0;
        breadth = 5.0;
        height = 8.0;
    }

    // Second setValues method with three parameters
    void setValues(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Third setValues method with one parameter to set values for all variables
    void setValues(double side) {
        length = side;
        breadth = side;
        height = side;
    }

    // Method to display length, breadth, height, and box type
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        
        if (length == breadth && breadth == height) {
            System.out.println("It is a cube.");
        } else {
            System.out.println("It is a normal box.");
        }
    }
}

public class b {
    public static void main(String[] args) {
        Boxm box = new Boxm();

        // Invoke all three setValues methods
        box.setValues();
        box.display();

        box.setValues(6.0, 6.0, 6.0);
        box.display();

        box.setValues(4.0);
        box.display();
    }
}


class Shape {
    double length, breadth;

    Shape() {
        length = 1;
        breadth = 1;
    }

    Shape(double side) {
        length = side;
        breadth = side;
    }

    Shape(double l, double b) {
        length = l;
        breadth = b;
    }

    void check() {
        if (length == breadth)
            System.out.println("It is a square.");
        else
            System.out.println("It is a rectangle.");
    }
}

public class shapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5);
        Shape shape3 = new Shape(4, 6);

        shape1.check();
        shape2.check();
        shape3.check();
    }
}

class Box {
    double length, breadth, height;

    void giveValues(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    void calcArea() {
        double area = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("Area of the box: " + area);
    }

    void calcVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume of the box: " + volume);
    }
}

public class BoxMain {
 
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.giveValues(3, 4, 5);
        box2.giveValues(2, 3, 6);
        box3.giveValues(4, 4, 4);

        box1.calcArea();
        box1.calcVolume();

        box2.calcArea();
        box2.calcVolume();

        box3.calcArea();
        box3.calcVolume();
    }
}

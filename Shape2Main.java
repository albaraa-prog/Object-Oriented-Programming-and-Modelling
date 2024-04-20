class Shape {
    double volumeCuboid; // renamed from volumeC to volumeCuboid to avoid method-variable name conflict
    double volumeCube;
    double volumeCylinder;

    // Method to calculate volume of a cuboid
    void calculateVolumeCuboid(double l, double b, double h) {
        volumeCuboid = l * b * h;
    }

    // Method to calculate volume of a cube
    void calculateVolumeCube(double side) {
        volumeCube = side * side * side;
    }

    // Method to calculate volume of a cylinder
    void calculateVolumeCylinder(double radius, double h) {
        volumeCylinder = 3.14 * radius * radius * h;
    }

    void display() {
        System.out.println("Volume for cuboid: " + volumeCuboid);
        System.out.println("Volume for cube: " + volumeCube);
        System.out.println("Volume for cylinder: " + volumeCylinder);
    }
}

public class Shape2Main {
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.calculateVolumeCuboid(10.0, 5.0, 10.0);
        sh.calculateVolumeCube(5.0);
        sh.calculateVolumeCylinder(3.5, 10.0);
        sh.display();
    }
}

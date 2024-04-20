class Shapem {
    double volume;

    double volume(double length, double breadth, double height){
        return volume = length * breadth * height;
    }
    double volume(double side){
        return volume = side * side * side;
    }
    double volume(double radius, double height){
        return volume = 3.14 * radius * radius * height;
    }

    void display(){ 
     System.out.println("volume of the shape: " + volume);
    }
}

public class ShapemMain {
    public static void main(String[] args) {

        Shapem cuboid = new Shapem();
        cuboid.volume(3,3,4);
        cuboid.display();

        Shapem cube = new Shapem();
        cube.volume(3);
        cube.display();

        Shapem cylinder = new Shapem();
        cylinder.volume(3,3);
        cylinder.display();
    }
}

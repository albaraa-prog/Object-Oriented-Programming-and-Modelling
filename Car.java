// Interface
interface Vehicle {
    void start();
    void accelerate();
    void brake();
}

// Class implementing the interface
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car braking.");
    }
}

class n{
    public static void main(String[] args) {
        Car s = new Car();
        s.start();
        s.accelerate();
        s.brake();
    }
}
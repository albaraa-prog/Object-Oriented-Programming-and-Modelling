class circleop{
    double radius;


    void assignRadius(double r){
        radius = r; 
    }

    public void area(){
        double area =  3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public void circumference(){
        double circumference =  2 * 3.14 * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}

public class examprac1 {
    public static void main(String[] args) {
        circleop c = new circleop();
        c.assignRadius(4);
        c.area();
        c.circumference();
    }
}

class Boxing {
    double length, breadth, height;

    void setValues(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void setValues() {
        length = 0;
        breadth = 0;
        height = 0;
    }

    void setValues(double side) {
        length = breadth = height = side;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        if (length == breadth && breadth == height) {
            System.out.println("This is a cube");
        } else {
            System.out.println("This is a normal box");
        }
    }
}

class Mai {
    public static void main(String[] args) {
        Boxing box1 = new Boxing();
        box1.setValues(5, 5, 6);
        box1.display();

        Boxing box2 = new Boxing();
        box2.setValues(6);
        box2.display();
    }
}

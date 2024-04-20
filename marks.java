public class marks {
    double mark1, mark2, mark3;
    String name;
    
    void setvalues(double m1, double m2, double m3, String n){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        name = n;
    }

    double calculatetotalmarks(){
        return mark1 + mark2 + mark3;
    }

    String calculategrade(){
        double totalmarks = calculatetotalmarks();
        String grade;

        if (totalmarks > 90){
            grade = "A";
        }
        else if (totalmarks < 90 && totalmarks > 70){
            grade = "B";
        }
        else if (totalmarks < 70 && totalmarks > 50){
            grade = "C";
        }  
        else{
            grade = "F";
        }
        return grade;
    }

    void display(){
        System.out.println("Student name: " + name);
        System.out.println("Total marks: " + calculatetotalmarks());
        System.out.println("Grade: " + calculategrade());
    }
}
class mainmarks{
    public static void main(String[] args) {
        marks m = new marks();
        m.setvalues(10, 20, 25, "Al Baraa");
        m.display();
    }
}

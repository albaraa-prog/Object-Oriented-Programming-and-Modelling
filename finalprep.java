class finals {
    String Name;
    String Id;

    void AddStudent(String N, String I) {
        this.Name = N;
        this.Id = I;
    }

    void Display() {
        System.out.println("Name: " + Name);
        System.out.println("ID: " + Id);
    }
}

class StudentDetails extends finals {
    String Age;

    void AddStudent(String Name, String Id, String Age) {
        super.AddStudent(Name, Id);
        this.Age = Age;
    }

    void Display() {
        super.Display();
        System.out.println("Age: " + Age);
    }
}

public class finalprep {
    public static void main(String[] args) {
        StudentDetails[] std = new StudentDetails[2];

        std[0] = new StudentDetails();
        std[0].AddStudent("Al Baraa", "20f20449", "21");

        std[1] = new StudentDetails();
        std[1].AddStudent("Reem", "20s20449", "22");

        for (StudentDetails student : std) {
            if (student.Age.equals("21") && student.Name.equals("Al Baraa")) {
                student.Display();
            }
        }
    }
}
/*
 * StudetDetails meow = new Std[0];
 * for(int i = 1; i < std.length; i++){
 * if (std[i].length > meow.length){
 * meow = std[i];
 * }
 * }
 * SOP(meow);
 */
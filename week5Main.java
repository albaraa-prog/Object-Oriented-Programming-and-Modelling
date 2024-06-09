abstract class InputOutputClass {
    public abstract void getData();

    public abstract void putData();
}

class Teacher extends InputOutputClass {
    private String teacherId;
    private String teacherName;
    private double salary;

    @Override
    public void getData() {
        // Simulated data input for teacher
        teacherId = "T001";
        teacherName = "John Doe";
        salary = 50000.0;
    }

    @Override
    public void putData() {
        // Displaying data for teacher
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Salary: " + salary);
    }
}

class Student extends InputOutputClass {
    private String studentId;
    private String studentName;
    private double GPA;

    @Override
    public void getData() {
        // Simulated data input for student
        studentId = "S001";
        studentName = "Jane Smith";
        GPA = 3.8;
    }

    @Override
    public void putData() {
        // Displaying data for student
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("GPA: " + GPA);
    }

}

public class week5Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.getData();
        teacher.putData();

        Student student = new Student();
        student.getData();
        student.putData();
    }
}

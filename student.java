class studentdata{
    String stdname;
    int stdid;
    double stdsalary, stdallowance;

    studentdata(String stdname, int stdid, double stdsalary, double stdallowance){
        this.stdname = stdname;
        this.stdid = stdid;
        this.stdsalary = stdsalary;
        this.stdallowance = stdallowance;
    }
    studentdata(){
        this("", 0 , 0.0, 0.0);
    }
    double stdcalculateTotalSalary(){
        return stdsalary + stdallowance;
    }
    void display(){
        System.out.println("student name: "+ stdname);
        System.out.println("student id: "+ stdid);
        System.out.println("student salary: "+ stdsalary);
        System.out.println("student allowance: "+ stdallowance);
        System.out.println("student total salary: "+ stdcalculateTotalSalary());
    }
}

public class student {
    public static void main(String args[]){
        studentdata std1 = new studentdata("Albaraa", 29654, 32356, 34346);
        System.out.println("\nFirst Student:");
        std1.display();
        System.out.println();
        studentdata std2 = new studentdata();
        std2.stdname = "khalid";
        std2.stdid = 23111;
        std2.stdsalary = 2000;
        std2.stdallowance = 500000000;
        System.out.println("second Student:");
        std2.display();
    }
}

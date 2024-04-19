class meow{
    String name;
    int age;

    meow(String name, int age){
        this.name = name;
        this.age = age;
    }

    meow(){
        this("", 0);
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
public class prepexam {
    public static void main(String[] args) {
       meow m = new meow("Al Baraa", 21);
       m.display();
       meow r = new meow();
       r.name = "khalid";
       r.age = 31;
       r.display();
    }
}

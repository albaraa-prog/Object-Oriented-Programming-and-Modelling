abstract class isangry{
    String name;
    int age;

    public isangry(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }


    public int getAge(){
        return age;
    }
    
    public void display(){
        System.out.println("Cat name: "+ name);
        System.out.println("Cat age: "+ age);
    }
    public abstract void checkmood();
}

class orangecat extends isangry {
    public orangecat(String name, int age){
        super(name, age);
    }
    public void checkmood(){
        System.out.println("mood: Angry");
    }
}

class whitecat extends isangry {
    public whitecat(String name, int age){
        super(name, age);
    }
    public void checkmood(){
        System.out.println("mood: chill");
    }
}

class maindisplay{
    public static void main(String[] args) {
        orangecat cat1 = new orangecat("meow", 3);
        cat1.display();
        cat1.checkmood();
        System.out.println();
        whitecat cat2 = new whitecat("huh", 2);
        cat2.display();
        cat2.checkmood();
    }
}
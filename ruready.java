abstract class school{
    
    protected String name;
    protected int age;

    public school(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public abstract void printinfo();
}

class person1 extends school{
    
    public person1(String name, int age){
        super(name, age);
    }
    
    public void printinfo(){
        System.out.println("person 1 info are:" + "\nName:"+ name + "\nAge:" + age);
    }

}

class person2 extends school{

    public person2(String name, int age){
        super(name, age);
    }

    public void printinfo(){
        System.out.println("person 2 info are:" + "\nName:"+ name + "\nAge:" + age);
    }

}

class ruready{
    public static void main(String[] args) {

        person1 pp1 = new person1("Al Baraa", 20);
        pp1.printinfo();

        person2 pp2 = new person2("Mohamed", 24);
        pp2.printinfo();

    }
}
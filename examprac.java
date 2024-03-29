public class examprac {
    private String username;
    private int age;


    public void setUsername(String username){
        this.username = username;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getUsername(){
        return username;
    }

    public int getAge(){
        return age;
    }
}

class master{
    public static void main(String args[]){
        examprac user1 = new examprac();
        examprac user2 = new examprac();

        user1.setUsername("Al Baraa");
        user1.setAge(21);

        user2.setUsername("khalid");
        user2.setAge(21);

        System.out.println("user1");
        System.out.println("username: " + user1.getUsername());
        System.out.println("Age: " + user1.getAge());

        System.out.println("user2");
        System.out.println("username: " + user2.getUsername());
        System.out.println("Age: " + user2.getAge());

    }
}
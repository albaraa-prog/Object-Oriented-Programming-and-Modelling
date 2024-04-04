abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}

public class abstractMain {
    public static void main(String args[]) {
        Cat cat = new Cat("Whiskers", 3);
        cat.makeSound();

        Dog dog = new Dog("Buddy", 5);
        dog.makeSound();
    }
}

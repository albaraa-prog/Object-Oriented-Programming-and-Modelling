// Person.java
public class APerson {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Method to assign values to attributes
    void assignInfo(String n, int a, String ad) {
        name = n;
        age = a;
        address = ad;
    }

    // Method to display information
     void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
// Main.java
  class Main {
    public static void main(String[] args) {
        // Creating objects of the Person class
        APerson person1 = new APerson();
        APerson person2 = new APerson();

        // Setting attributes using assignInfo() method
        person1.assignInfo("John", 30, "123 Main St");
        person2.assignInfo("Alice", 25, "456 Elm St");

        // Printing values using displayInfo() method
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }

}

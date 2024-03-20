// Product.java
public class Product {
    // Data members
    private int productId;
    private String name;
    private double price;

    // Set methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Get methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Main.java
 class AMain {
    public static void main(String[] args) {
        // Creating instances/objects of the Product class
        Product product1 = new Product();
        Product product2 = new Product();

        // Setting values using set methods
        product1.setProductId(101);
        product1.setName("Laptop");
        product1.setPrice(999.99);

        product2.setProductId(102);
        product2.setName("Smartphone");
        product2.setPrice(599.99);

        // Displaying values using get methods
        System.out.println("Product 1:");
        System.out.println("Product ID: " + product1.getProductId());
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: $" + product1.getPrice());

        System.out.println("\nProduct 2:");
        System.out.println("Product ID: " + product2.getProductId());
        System.out.println("Name: " + product2.getName());
        System.out.println("Price: $" + product2.getPrice());
    }
}

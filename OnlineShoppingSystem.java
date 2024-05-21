 import java.util.*;

// Product class represents items available for purchase
class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Customer class represents users of the online shopping system
class Customer {
    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// ShoppingCart class represents the shopping cart of a customer
class ShoppingCart {
    private Customer customer;
    private List<Product> items;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart for Customer: " + customer.getName());
        System.out.println("---------------------------------------------------");
        for (Product item : items) {
            System.out.println("Product ID: " + item.getProductId() + ", Name: " + item.getProductName() + ", Price: Rs." + item.getPrice());
        }
        System.out.println("---------------------------------------------------");
    }
}

// Main class to test the online shopping system
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create some sample products
        Product product1 = new Product(1, "Phone", 599.99);
        Product product2 = new Product(2, "Laptop", 999.99);
        Product product3 = new Product(3, "Headphones", 99.99);

        // Create a sample customer
        Customer customer1 = new Customer(101, "zakeer", "zakeer@gmail.com");

        // Create a shopping cart for the customer
        ShoppingCart cart = new ShoppingCart(customer1);

        // Add products to the cart
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        // Display the contents of the cart
        cart.displayCart();
    }
}

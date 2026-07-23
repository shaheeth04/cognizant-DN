package week1.algorithmdatastructures.ecommerceplatformsearch;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Wireless Mouse", "Electronics"),
            new Product(101, "Gaming Laptop", "Electronics"),
            new Product(103, "Mechanical Keyboard", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(104, "Bluetooth Headphones", "Electronics")
        };
        int targetId = 104;
        Arrays.sort(products);
        int result = Search.binarySearch(products, targetId);
        System.out.println(result != -1 ? "Product found at index: " + result : "Product not found");
    }
}

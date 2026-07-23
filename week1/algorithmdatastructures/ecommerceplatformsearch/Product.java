package week1.algorithmdatastructures.ecommerceplatformsearch;

public class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    void setProductId(int productId) {
        this.productId = productId;
    }

    void setProductName(String productName) {
        this.productName = productName;
    }

    void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int compareTo(Product other) {
        return this.productId - other.productId;
    }

    public String toString() {
        return "[Product ID: " + productId + ", Name: " + productName + ", category: " + category + "]";
    }
}

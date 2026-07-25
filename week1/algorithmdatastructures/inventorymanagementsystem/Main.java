package week1.algorithmdatastructures.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Inventory warehouse = new Inventory();

        Product p1 = new Product(1, "Laptop", 10, 999.99);
        Product p2 = new Product(2, "Mouse", 50, 19.99);
        warehouse.addProduct(p1);
        warehouse.addProduct(p2);

        System.out.println("After Adding Products:");
        warehouse.displayInventory();

        warehouse.updateProduct(new Product(2, "Wireless Mouse", 45, 24.99));
        System.out.println("After Updating Product P002:");
        warehouse.displayInventory();

        warehouse.deleteProduct(1);
        System.out.println("After Deleting Product P001:");
        warehouse.displayInventory();
    }
}

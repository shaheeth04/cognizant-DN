package week1.algorithmdatastructures.inventorymanagementsystem;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> productMap = new HashMap<>();
    public void addProduct(Product product){
        productMap.put(product.getProductId(), product);
    }
    public void updateProduct(Product product){
        Product productExisting = productMap.get(product.getProductId());
        if (productExisting != null) {
            productMap.put(product.getProductId(), product);
        }
    }
    public void deleteProduct(int productId){
        productMap.remove(productId);
    }
    public void displayInventory(){
        for(Product product : productMap.values()){
            System.out.println(product);
        }
    }
}

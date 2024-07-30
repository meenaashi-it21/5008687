package inventory_management_system;
import java.util.HashMap;
import java.util.Map;
public class InventoryManagementSystem {
	private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    @Override
    public String toString() {
        return "InventoryManagementSystem [inventory=" + inventory + "]";
    }
	

}

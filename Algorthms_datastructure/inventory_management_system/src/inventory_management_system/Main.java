package inventory_management_system;

public class Main {

	public static void main(String[] args) {
		 InventoryManagementSystem ims = new InventoryManagementSystem();
	        Product product1 = new Product("P001", "Laptop", 10, 999.99);
	        Product product2 = new Product("P002", "Smartphone", 25, 599.99);
	        Product product3 = new Product("P003", "Tablet", 15, 399.99);
	        ims.addProduct(product1);
	        ims.addProduct(product2);
	        ims.addProduct(product3);

	        System.out.println("Initial Inventory:");
	        System.out.println(ims);

	        product2.setPrice(549.99);
	        ims.updateProduct(product2);
	        System.out.println("\nInventory after updating product P002:");
	        System.out.println(ims);
	        ims.deleteProduct("P003");
	        System.out.println("\nInventory after deleting product P003:");
	        System.out.println(ims);
	        Product retrievedProduct = ims.getProduct("P001");
	        System.out.println("\nRetrieved product P001:");
	        System.out.println(retrievedProduct);

	}

}

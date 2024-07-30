package e_commerce;

public class Main {

	public static void main(String[] args) {
		 Product[] products = {
		            new Product("P001", "Laptop", "Electronics"),
		            new Product("P002", "Smartphone", "Electronics"),
		            new Product("P003", "Tablet", "Electronics"),
		            new Product("P004", "Headphones", "Accessories"),
		            new Product("P005", "Smartwatch", "Accessories")
		        };
		        System.out.println("Linear Search:");
		        Product foundProduct = LinearSearch.linearSearch(products, "P003");
		        if (foundProduct != null) {
		            System.out.println("Found: " + foundProduct);
		        } else {
		            System.out.println("Product not found.");
		        }
		        System.out.println("\nBinary Search:");
		        foundProduct = BinarySearch.binarySearch(products, "P003");
		        if (foundProduct != null) {
		            System.out.println("Found: " + foundProduct);
		        } else {
		            System.out.println("Product not found.");
		        }

	}

}

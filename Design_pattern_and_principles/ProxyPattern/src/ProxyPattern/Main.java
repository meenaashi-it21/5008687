package ProxyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Image image1 = new ProxyImage("image1.jpg");
	        Image image2 = new ProxyImage("image2.jpg");

	        // Load and display images
	        System.out.println("First display call:");
	        image1.display(); // Image is loaded and displayed

	        System.out.println("\nSecond display call:");
	        image1.display(); // Image is already loaded, only displayed

	        System.out.println("\nDisplay call for a new image:");
	        image2.display(); // Image is loaded and displayed
	}

}

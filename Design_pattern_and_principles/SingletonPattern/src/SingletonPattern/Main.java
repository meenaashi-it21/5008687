package SingletonPattern;
import SingletonPattern.Logger;
public class Main {

	public static void main(String[] args) {
		
		 Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();
	        
	        // Test if both references point to the same instance
	        if (logger1 == logger2) {
	            System.out.println("Logger has a single instance.");
	        } else {
	            System.out.println("Logger has multiple instances.");
	        }
	        
	        // Use the logger to log messages
	        logger1.log("First log message");
	        logger2.log("Second log message");
	}

}

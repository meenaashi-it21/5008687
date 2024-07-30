package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		 Computer gamingComputer = new Computer.Builder()
	                .setCPU("Intel i9")
	                .setRAM(32)
	                .setStorage(1000)
	                .setGraphicsCard(true)
	                .setBluetooth(true)
	                .setWiFi(true)
	                .build();

	        System.out.println("Gaming Computer Configuration:");
	        System.out.println("CPU: " + gamingComputer.getCPU());
	        System.out.println("RAM: " + gamingComputer.getRAM() + "GB");
	        System.out.println("Storage: " + gamingComputer.getStorage() + "GB");
	        System.out.println("Graphics Card: " + (gamingComputer.hasGraphicsCard() ? "Yes" : "No"));
	        System.out.println("Bluetooth: " + (gamingComputer.hasBluetooth() ? "Yes" : "No"));
	        System.out.println("WiFi: " + (gamingComputer.hasWiFi() ? "Yes" : "No"));

	        // Create another Computer with different configurations using the Builder pattern
	        Computer officeComputer = new Computer.Builder()
	                .setCPU("Intel i5")
	                .setRAM(16)
	                .setStorage(500)
	                .setGraphicsCard(false)
	                .setBluetooth(false)
	                .setWiFi(true)
	                .build();

	        System.out.println("\nOffice Computer Configuration:");
	        System.out.println("CPU: " + officeComputer.getCPU());
	        System.out.println("RAM: " + officeComputer.getRAM() + "GB");
	        System.out.println("Storage: " + officeComputer.getStorage() + "GB");
	        System.out.println("Graphics Card: " + (officeComputer.hasGraphicsCard() ? "Yes" : "No"));
	        System.out.println("Bluetooth: " + (officeComputer.hasBluetooth() ? "Yes" : "No"));
	        System.out.println("WiFi: " + (officeComputer.hasWiFi() ? "Yes" : "No"));

	}

}

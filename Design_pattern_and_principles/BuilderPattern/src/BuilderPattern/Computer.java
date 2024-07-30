package BuilderPattern;

public class Computer {
	  private String CPU;
	    private int RAM;
	    private int storage;
	    private boolean hasGraphicsCard;
	    private boolean hasBluetooth;
	    private boolean hasWiFi;

	    // Private constructor to be called by the Builder
	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	        this.hasGraphicsCard = builder.hasGraphicsCard;
	        this.hasBluetooth = builder.hasBluetooth;
	        this.hasWiFi = builder.hasWiFi;
	    }

	    // Getters for the attributes
	    public String getCPU() {
	        return CPU;
	    }

	    public int getRAM() {
	        return RAM;
	    }

	    public int getStorage() {
	        return storage;
	    }

	    public boolean hasGraphicsCard() {
	        return hasGraphicsCard;
	    }

	    public boolean hasBluetooth() {
	        return hasBluetooth;
	    }

	    public boolean hasWiFi() {
	        return hasWiFi;
	    }

	    // Static nested Builder class
	    public static class Builder {
	        private String CPU;
	        private int RAM;
	        private int storage;
	        private boolean hasGraphicsCard;
	        private boolean hasBluetooth;
	        private boolean hasWiFi;

	        // Methods to set each attribute
	        public Builder setCPU(String CPU) {
	            this.CPU = CPU;
	            return this;
	        }

	        public Builder setRAM(int RAM) {
	            this.RAM = RAM;
	            return this;
	        }

	        public Builder setStorage(int storage) {
	            this.storage = storage;
	            return this;
	        }

	        public Builder setGraphicsCard(boolean hasGraphicsCard) {
	            this.hasGraphicsCard = hasGraphicsCard;
	            return this;
	        }

	        public Builder setBluetooth(boolean hasBluetooth) {
	            this.hasBluetooth = hasBluetooth;
	            return this;
	        }

	        public Builder setWiFi(boolean hasWiFi) {
	            this.hasWiFi = hasWiFi;
	            return this;
	        }

	        // Build method to create a Computer instance
	        public Computer build() {
	            return new Computer(this);
	        }
	    }
}

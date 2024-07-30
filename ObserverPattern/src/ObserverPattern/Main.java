package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		 StockMarket stockMarket = new StockMarket();
	        Observer mobileApp = new MobileApp();
	        Observer webApp = new WebApp();

	        // Register observers
	        stockMarket.registerObserver(mobileApp);
	        stockMarket.registerObserver(webApp);

	        // Update stock price and notify observers
	        System.out.println("Setting stock price to $120.50");
	        stockMarket.setStockPrice(120.50);

	        // Deregister one observer and update stock price again
	        stockMarket.deregisterObserver(webApp);

	        System.out.println("\nSetting stock price to $125.75");
	        stockMarket.setStockPrice(125.75);
	}

}

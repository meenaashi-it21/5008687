package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPal());
	        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
	        PaymentProcessor squareProcessor = new SquareAdapter(new Square());

	        // Process payments using different payment gateways
	        payPalProcessor.processPayment(100.0);
	        stripeProcessor.processPayment(200.0);
	        squareProcessor.processPayment(300.0);
	}

}

package StrategyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentStrategy creditCard = new CreditCardPayment("John Doe", "1234-5678-9876-5432");
        PaymentContext context = new PaymentContext(creditCard);
        System.out.println("Testing Credit Card Payment:");
        context.executePayment(150.00);

        // Test PayPal Payment
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
        context = new PaymentContext(payPal);
        System.out.println("\nTesting PayPal Payment:");
        context.executePayment(200.00);
	}

}

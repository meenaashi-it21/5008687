package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card.");
        // Add additional logic for credit card payment here
    }
}

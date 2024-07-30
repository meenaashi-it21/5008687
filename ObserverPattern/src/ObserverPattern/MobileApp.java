package ObserverPattern;

public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App received stock price update: $" + stockPrice);
    }
}

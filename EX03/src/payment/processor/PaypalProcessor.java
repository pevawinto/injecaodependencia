public class PaypalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
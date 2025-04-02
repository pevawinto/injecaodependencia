public class PixProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("Processing PIX payment: " + amount);
    }
}
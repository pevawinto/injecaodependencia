public class PaymentService {
    private final PaymentProcessor processor;

    public PaymentService(String paymentMethod) {
        this.processor = PaymentProcessorFactory.getProcessor(paymentMethod);
    }

    public void makePayment(double amount) {
        processor.process(amount);
    }
}
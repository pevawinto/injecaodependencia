public class PaymentProcessorFactory {
    public static PaymentProcessor getProcessor(String method) {
        switch (method.toLowerCase()) {
            case "creditcard":
                return new CreditCardProcessor();
            case "pix":
                return new PixProcessor();
            case "paypal":
                return new PaypalProcessor();
            default:
                throw new IllegalArgumentException("Método de pagamento inválido: " + method);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService("pix");
        service.makePayment(150.0);
    }
}
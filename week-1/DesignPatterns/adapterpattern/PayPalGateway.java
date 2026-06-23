package adapterpattern;

public class PayPalGateway {

    public void sendPayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using PayPal");
    }
}

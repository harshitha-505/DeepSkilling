package adapterpattern;

public class StripeGateway {

    public void makeTransaction(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Stripe");
    }
}

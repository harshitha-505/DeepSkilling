package adapterpattern;

public class AdapterPatternExample {

    public static void main(String[] args) {

        PaymentProcessor payment1 =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor payment2 =
                new StripeAdapter(new StripeGateway());

        payment1.processPayment(1000);
        payment2.processPayment(2500);
    }
}

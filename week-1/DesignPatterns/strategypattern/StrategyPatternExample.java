package strategypattern;

public class StrategyPatternExample {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(1000);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(2000);
    }
}
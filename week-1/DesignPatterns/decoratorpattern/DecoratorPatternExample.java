package decoratorpattern;

public class DecoratorPatternExample {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        notifier = new SMSNotifierDecorator(notifier);

        notifier = new SlackNotifierDecorator(notifier);

        notifier.send("Meeting at 10 AM");
    }
}
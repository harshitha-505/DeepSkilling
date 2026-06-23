package observerpattern;

public class ObserverPatternExample {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Harshitha");
        Observer webUser = new WebApp("User1");

        market.registerObserver(mobileUser);
        market.registerObserver(webUser);

        System.out.println("Stock Price Updated:");

        market.setStockPrice("TCS", 4200);

        System.out.println();

        market.setStockPrice("Infosys", 1600);
    }
}
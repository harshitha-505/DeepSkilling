public class FinancialForecast {

    public static void main(String[] args) {

        double currentValue = 10000;

        double growthRate = 0.10;

        int years = 3;

        double futureValue =
                currentValue *
                Math.pow(
                        1 + growthRate,
                        years);

        System.out.println(
                "Future Value = ₹"
                        + futureValue);
    }
}
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD_TO_RUB = 95.5;
        final double USD_TO_EUR = 0.93;
        final double USD_TO_GBP = 0.81;
        final double USD_TO_CNY = 7.25;
        System.out.println("Валюты: USD, RUB, EUR, GBP, CNY");
        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();
        System.out.print("Введите валюту (USD/RUB/EUR/GBP/CNY): ");
        String currency = scanner.next().toUpperCase();
        double amountInUSD = 0;
        switch (currency) {
            case "USD":
                amountInUSD = amount;
                break;
            case "RUB":
                amountInUSD = amount / USD_TO_RUB;
                break;
            case "EUR":
                amountInUSD = amount / USD_TO_EUR;
                break;
            case "GBP":
                amountInUSD = amount / USD_TO_GBP;
                break;
            case "CNY":
                amountInUSD = amount / USD_TO_CNY;
                break;
            default:
                System.out.println("Неизвестная валюта!");
                scanner.close();
                return;
        }
        System.out.println("Конвертация:");
        System.out.println("USD: " + amountInUSD);
        System.out.println("RUB: " + (amountInUSD * USD_TO_RUB));
        System.out.println("EUR: " + (amountInUSD * USD_TO_EUR));
        System.out.println("GBP: " + (amountInUSD * USD_TO_GBP));
        System.out.println("CNY: " + (amountInUSD * USD_TO_CNY));
        scanner.close();
    }
}
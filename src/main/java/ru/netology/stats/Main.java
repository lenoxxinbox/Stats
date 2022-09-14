package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20_002_000, 7, 14, 14, 18
        };

        StatsService service = new StatsService();
        long arr = service.amountAllSales(sales);
        long average = service.averageAmountOfSalesPerMonth(sales);
        long min = service.minSales(sales);
        long max = service.maxSales(sales);
        long below = service.salesBelowAverage(sales);
        long above = service.salesAboveAverage(sales);
        System.out.println("Сумма всех продаж " + arr);
        System.out.println("Среднемесячные продажи " +average);
        System.out.println("Номер месяца минимальных продаж " + min);
        System.out.println("Номер месяца максимальных продаж " + max);
        System.out.println("Кол-во мес где продажи ниже среднего " + below);
        System.out.println("Кол-во мес где продажи выше среднего " + above);
    }
}

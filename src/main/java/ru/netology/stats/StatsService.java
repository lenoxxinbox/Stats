package ru.netology.stats;

public class StatsService {
    public int amountAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmountOfSalesPerMonth(long[] sales) {
        int averageAmount = amountAllSales(sales) / sales.length;
        return averageAmount;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int sumMonthBelow = 0;
        for (long sale : sales) {
            if (sale < averageAmountOfSalesPerMonth(sales)) {
                sumMonthBelow += 1;
            }
        }
        return sumMonthBelow;
    }

    public int salesAboveAverage(long[] sales) {
        int sumMonthBelow = 0;
        for (long sale : sales) {
            if (sale > averageAmountOfSalesPerMonth(sales)) {
                sumMonthBelow += 1;
            }
        }
        return sumMonthBelow;
    }

}

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
        System.out.println("����� ���� ������ " + arr);
        System.out.println("�������������� ������� " +average);
        System.out.println("����� ������ ����������� ������ " + min);
        System.out.println("����� ������ ������������ ������ " + max);
        System.out.println("���-�� ��� ��� ������� ���� �������� " + below);
        System.out.println("���-�� ��� ��� ������� ���� �������� " + above);
    }
}

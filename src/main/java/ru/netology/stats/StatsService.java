package ru.netology.stats;

public class StatsService {

    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(long[] sales) {
        double averageSales = 0;
        long totalSales = calculateTotalSales(sales);
        averageSales = (double) totalSales / sales.length;
        return averageSales;
    }

    public int findMonthWithMinSales(long[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int findMonthWithMaxSales(long[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int calculateMonthsBelowAverageSales(long[] sales) {
        int count = 0;
        double averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }

    public int calculateMonthsAboveAverageSales(long[] sales) {
        int count = 0;
        double averageSales = calculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }
}

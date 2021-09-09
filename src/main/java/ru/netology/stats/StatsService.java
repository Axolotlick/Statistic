package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            sumMonth = sumMonth + sale;
        }
        return sumMonth;
    }

    public int avgSales(int[] sales) {
        return salesAmount(sales) / sales.length;
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

    public int monthNumberBelowAvg(int[] sales) {
        int avg = avgSales(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthNumberAboveAvg(int[] sales) {
        int avg = avgSales(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

}


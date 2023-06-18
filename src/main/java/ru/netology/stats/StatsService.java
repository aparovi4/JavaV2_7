package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] amount) {
        long sum = 0;
        for (int i = 0; i < amount.length; i++) {
            sum = sum + amount[i];
        }
        return sum;
    }

    public long averageSalesAmount(long[] amount) {

        return salesAmount(amount) / amount.length;
    }

    public int maxSalesMonth(long[] amount) {
        int month = 0;
        long maxSale = amount[0];
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] >= maxSale) {
                month = i;
                maxSale = amount[i];
            }
        }
        return month + 1;
    }

    public int minSalesMonth(long[] amount) {
        int month = 0;
        long maxSale = amount[0];
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] <= maxSale) {
                month = i;
                maxSale = amount[i];
            }
        }
        return month + 1;
    }

    public int monthsBelowAverage(long[] amount) {
        int counter = 0;
        for (long l : amount) {
            if (l < averageSalesAmount(amount)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] amount) {
        int counter = 0;
        for (long l : amount) {
            if (l > averageSalesAmount(amount)) {
                counter++;
            }
        }
        return counter;
    }
}

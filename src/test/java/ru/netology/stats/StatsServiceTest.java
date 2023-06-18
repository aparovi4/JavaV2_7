package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateTheAmount() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.salesAmount(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAveregeAmount() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double  expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        double actual = service.averageSalesAmount(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthMaxSale() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        double actual = service.maxSalesMonth(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinSale() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        double actual = service.minSalesMonth(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthBelowAverage() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverage(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthAboveAverage() {
        StatsService service = new StatsService();
        long[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsAboveAverage(amount);
        Assertions.assertEquals(expected, actual);
    }
}

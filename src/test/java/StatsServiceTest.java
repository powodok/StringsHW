import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = statsService.calculateTotalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        double actual = statsService.calculateAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = statsService.findMonthWithMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = statsService.findMonthWithMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsBelowAverageSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.calculateMonthsBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsAboveAverageSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.calculateMonthsAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}

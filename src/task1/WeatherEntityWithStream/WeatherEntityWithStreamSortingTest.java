package task1.WeatherEntityWithStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task1.Day;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WeatherEntityWithStreamSortingTest {
    private WeatherEntityWithStreamSorting weatherEntityWithStreamSorting = new WeatherEntityWithStreamSorting("Spring", "Spring is the best season");


    @BeforeEach
    void setUp() {
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-01", 10.0, "Luck day"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-05", 14.0, "Day with highest temperature"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-02", 11.0, "Comment 1"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-06", 15.0, "Super day"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-04", 13.0, "Sunny day"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-03", 12.0, "Windy day"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-08", 17.0, "Snowy day"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-07", 16.0, "Bad weather"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-10", 19.0, "Day with longest comment"));
        weatherEntityWithStreamSorting.addDay(new Day("2021-03-09", 18.0, "Hot day"));

        System.out.println("Before sorting:");
        weatherEntityWithStreamSorting.daysList.forEach(System.out::println);
    }

    @Test
    void testSortByLowestTemperature() {
        weatherEntityWithStreamSorting.sortByLowestTemperature();

        for (int i = 0; i < weatherEntityWithStreamSorting.daysList.size() - 1; i++) {
            Day current = weatherEntityWithStreamSorting.daysList.get(i);
            Day next = weatherEntityWithStreamSorting.daysList.get(i + 1);
            boolean isSorted = current.getTemperature() <= next.getTemperature();
            assertTrue(isSorted);
        }

        System.out.println("After sorting by lowest temperature:");
        weatherEntityWithStreamSorting.daysList.forEach(System.out::println);
    }

    @Test
    void testSortCommentByAlphabetOrder() {
        weatherEntityWithStreamSorting.sortCommentByAlphabetOrder();

        for (int i = 0; i < weatherEntityWithStreamSorting.daysList.size() - 1; i++) {
            Day current = weatherEntityWithStreamSorting.daysList.get(i);
            Day next = weatherEntityWithStreamSorting.daysList.get(i + 1);
            boolean isSorted = current.getComment().compareTo(next.getComment()) <= 0;
            assertTrue(isSorted);
        }

        System.out.println("After sorting by comment alphabet order:");
        weatherEntityWithStreamSorting.daysList.forEach(System.out::println);
    }
}
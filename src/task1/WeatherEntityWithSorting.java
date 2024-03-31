package task1;

import java.util.Arrays;
import java.util.Comparator;

public class WeatherEntityWithSorting extends WeatherEntityWithArray {
    public WeatherEntityWithSorting(String season, String comment, Day[] days) {
        super(season, comment, days);
    }

    @Override
    public void sortByLowestTemperature() {
        Day[] days = getDays();
        Arrays.sort(days, Day::compareTo);
    }

    @Override
    public void sortCommentByAlphabetOrder() {
        Day[] days = getDays();
        Arrays.sort(days, Comparator.comparing(Day::getComment));
    }
}

package task1.WeatherEntityWithStream;

import task1.Day;

import java.util.Comparator;

public class WeatherEntityWithStreamSorting extends WeatherEntityWithStream {
    public WeatherEntityWithStreamSorting(String season, String comment) {
        super(season, comment);
    }
        @Override
        public void sortByLowestTemperature() {
            daysList = daysList.stream()
                    .sorted(Comparator.comparingDouble(Day::getTemperature))
                    .toList();
        }

        @Override
        public void sortCommentByAlphabetOrder() {
            daysList = daysList.stream()
                    .sorted(Comparator.comparing(Day::getComment))
                    .toList();
        }
}

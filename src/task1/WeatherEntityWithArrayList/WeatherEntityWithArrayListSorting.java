package task1.WeatherEntityWithArrayList;

import task1.Day;

import java.util.Collections;
import java.util.Comparator;

public class WeatherEntityWithArrayListSorting extends WeatherEntityWithArrayList {
    public WeatherEntityWithArrayListSorting(String season, String comment) {
        super(season, comment);
    }

    @Override
    public void sortByLowestTemperature() {
        daysList.sort(Comparator.comparingDouble(Day::getTemperature));
    }

    @Override
    public void sortCommentByAlphabetOrder() {
        daysList.sort(Comparator.comparing(Day::getComment));
    }

    public static void main(String[] args) {
        WeatherEntityWithArrayListSorting weatherEntityWithArrayListSorting = new WeatherEntityWithArrayListSorting("Spring", "Spring is the best season");
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-01", 10.0, "yBad weather"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-05", 14.0, "Day with highest temperature"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-02", 11.0, "Comment 1"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-06", 15.0, "Super day"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-04", 13.0, "Sunny day"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-03", 12.0, "Windy day"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-08", 17.0, "Bad weather"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-07", 16.0, "Luck day"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-10", 19.0, "Day with longest comment"));
        weatherEntityWithArrayListSorting.addDay(new Day("2021-03-09", 18.0, "Hot day"));

        System.out.println("Before sorting:");
        for (Day day : weatherEntityWithArrayListSorting.getDays()) {
            System.out.println(day);
        }
        weatherEntityWithArrayListSorting.sortByLowestTemperature();
        System.out.println("\nAfter sorting by lowest temperature:");
        for (Day day : weatherEntityWithArrayListSorting.getDays()) {
            System.out.println(day);
        }
        weatherEntityWithArrayListSorting.sortCommentByAlphabetOrder();
        System.out.println("\nAfter sorting by alphabet order of comment:");
        for (Day day : weatherEntityWithArrayListSorting.getDays()) {
            System.out.println(day);
        }
    }
}

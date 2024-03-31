package task1.WeatherEntityWithSortedSet;

import task1.Day;

import java.util.*;


public class WeatherEntityWithSortedSetSorting extends WeatherEntityWithSortedSet {
    public WeatherEntityWithSortedSetSorting(String season, String comment) {
        super(season, comment);
    }

    @Override
    public void sortByLowestTemperature() {
        SortedSet<Day> sortedSet = new TreeSet<>(Comparator.comparingDouble(Day::getTemperature));
        sortedSet.addAll(daysSet);
        daysSet = sortedSet;
    }

    @Override
    public void sortCommentByAlphabetOrder() {
        SortedSet<Day> sortedSet = new TreeSet<>(Comparator.comparing(Day::getComment));
        sortedSet.addAll(daysSet);
        daysSet = sortedSet;
    }

    public static void main(String[] args) {
         Day[] arr = new Day[]{
                new Day("2021-03-01", 10.0, "Bad weather"),
                new Day("2021-03-05", 14.0, "Day with highest temperature"),
                new Day("2021-03-02", 11.0, "Comment 1"),
                new Day("2021-03-06", 15.0, "Super day"),
                new Day("2021-03-04", 13.0, "Sunny day"),
                new Day("2021-03-03", 12.0, "Windy day"),
                new Day("2021-03-08", 17.0, "Snowy day"),
                new Day("2021-03-07", 16.0, "Luck day"),
                new Day("2021-03-10", 19.0, "Day with longest comment"),
                new Day("2021-03-09", 18.0, "Hot day"),
        };

        WeatherEntityWithSortedSetSorting weatherEntityWithSortedSetSorting = new WeatherEntityWithSortedSetSorting("Spring", "Spring is the best season");
        weatherEntityWithSortedSetSorting.daysSet.addAll(List.of(arr));
        System.out.println("Before sorting:");
        for (Day day : arr) {
            System.out.println(day);
        }
        weatherEntityWithSortedSetSorting.sortByLowestTemperature();
        System.out.println("\nAfter sorting by lowest temperature:");
        for (Day day : weatherEntityWithSortedSetSorting.getDays()) {
            System.out.println(day);
        }
        weatherEntityWithSortedSetSorting.sortCommentByAlphabetOrder();
        System.out.println("\nAfter sorting by alphabet order of comment:");
        for (Day day : weatherEntityWithSortedSetSorting.getDays()) {
            System.out.println(day);
        }
    }
}

package task1.WeatherEntityWithSortedSet;

import task1.Day;
import task1.Weather;

import java.util.SortedSet;
import java.util.TreeSet;

public abstract class WeatherEntityWithSortedSet extends Weather {
    public SortedSet<Day> daysSet;

    public WeatherEntityWithSortedSet(String season, String comment) {
        super(season, comment);
        this.daysSet = new TreeSet<>();
    }

    @Override
    public Day[] getDays() {
        return daysSet.toArray(new Day[0]);
    }
}

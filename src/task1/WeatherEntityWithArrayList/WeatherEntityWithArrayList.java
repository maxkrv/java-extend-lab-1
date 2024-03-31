package task1.WeatherEntityWithArrayList;

import task1.Day;
import task1.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherEntityWithArrayList extends Weather {
    public List<Day> daysList;

    public WeatherEntityWithArrayList(String season, String comment) {
        super(season, comment);
        this.daysList = new ArrayList<>();
    }

    public void addDay(Day day) {
        daysList.add(day);
    }

    @Override
    public Day[] getDays() {
        return daysList.toArray(new Day[0]);
    }
}

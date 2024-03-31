package task1.WeatherEntityWithStream;

import task1.Day;
import task1.Weather;

import java.util.List;

public class WeatherEntityWithStream extends Weather {
    public List<Day> daysList;

    public WeatherEntityWithStream(String season, String comment) {
        super(season, comment);
        this.daysList = new java.util.ArrayList<Day>();
    }

    @Override
    public Day[] getDays() {
        return daysList.toArray(new Day[0]);
    }

    public void addDay(Day day) {
        daysList.add(day);
    }
}

package task1;

public class WeatherEntityWithArray extends Weather {
    private final Day[] days;

    public WeatherEntityWithArray(String season, String comment, Day[] days) {
        super(season, comment);
        this.days = days;
    }

    @Override
    public Day[] getDays() {
        return days;
    }
}


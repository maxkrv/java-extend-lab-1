package task1;

import java.util.Objects;

public class Day implements Comparable<Day> {
    private final String date;
    private final double temperature;
    private final String comment;

    public Day(String date, double temperature, String comment) {
        this.date = date;
        this.temperature = temperature;
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Temperature: " + temperature + ", Comment: " + comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Day day)) return false;
        return Double.compare(day.temperature, temperature) == 0 && Objects.equals(date, day.date) && Objects.equals(comment, day.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, temperature, comment);
    }

    @Override
    public int compareTo(Day o) {
        return comment.compareTo(o.comment);
    }

    /**
     * Find average temperature of days
     * @param days array of days
     * @return average temperature
     */
    public static double findAverageTemperature(Day[] days) {
        double sum = 0;
        for (Day day : days) {
            sum += day.getTemperature();
        }
        return sum / days.length;
    }

    /**
     * Find day with the highest temperature
     * @param days array of days
     * @return day with the highest temperature
     */
    public static Day findDayWithHighestTemperature(Day[] days) {
        Day highestTemperatureDay = days[0];
        for (Day day : days) {
            if (day.getTemperature() > highestTemperatureDay.getTemperature()) {
                highestTemperatureDay = day;
            }
        }
        return highestTemperatureDay;
    }

    /**
     * Find day with the lowest temperature
     * @param days array of days
     * @return day with the lowest temperature
     */
    public static Day findDayWithLongestComment(Day[] days) {
        Day longestCommentDay = days[0];
        for (Day day : days) {
            if (day.getComment().length() > longestCommentDay.getComment().length()) {
                longestCommentDay = day;
            }
        }
        return longestCommentDay;
    }
}


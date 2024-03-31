package task1;

import java.util.Objects;

public abstract class Weather {
    private final String season;
    private final String comment;

    public Weather(String season, String comment) {
        this.season = season;
        this.comment = comment;
    }

    public String getSeason() {
        return season;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Season: " + season + ", Comment: " + comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Weather that = (Weather) obj;
        return Objects.equals(season, that.season) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(season, comment);
    }

    public abstract Day[] getDays();

    /**
     * Sort days by lowest temperature
     */
    public void sortByLowestTemperature() {
        Day[] days = getDays();
        for (int i = 0; i < days.length - 1; i++) {
            for (int j = 0; j < days.length - i - 1; j++) {
                if (days[j].getTemperature() > days[j + 1].getTemperature()) {
                    Day temp = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Sort days by alphabet order of comment
     */
    public void sortCommentByAlphabetOrder() {
        Day[] days = getDays();
        for (int i = 0; i < days.length - 1; i++) {
            for (int j = 0; j < days.length - i - 1; j++) {
                if (days[j].getComment().compareTo(days[j + 1].getComment()) > 0) {
                    Day temp = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Test methods
     */
    public void test() {
        Day[] days = this.getDays();

        System.out.println("Average temperature: " + Day.findAverageTemperature(days));
        System.out.println("Day with highest temperature: " + Day.findDayWithHighestTemperature(days).toString());
        System.out.println("Day with longest comment: " + Day.findDayWithLongestComment(days).toString());
        System.out.println();

        System.out.println("Before sorting: ");
        for (Day day : days) {
            System.out.println(day.toString());
        }
        System.out.println();

        this.sortByLowestTemperature();
        System.out.println("After sorting by lowest temperature: ");
        for (Day day : days) {
            System.out.println(day.toString());
        }
        System.out.println();

        this.sortCommentByAlphabetOrder();
        System.out.println("After sorting by alphabet order: ");
        for (Day day : days) {
            System.out.println(day.toString());
        }
    }
}

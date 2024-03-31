package task1;

public class Main {
    public static void main(String[] args) {
        WeatherEntityWithSorting weatherEntityWithSorting = new WeatherEntityWithSorting(
                "Spring",
                "Spring is the best season",
                new Day[]{
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
                }
        );

        weatherEntityWithSorting.test();
    }
}

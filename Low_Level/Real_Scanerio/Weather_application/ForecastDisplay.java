package Low_Level.Real_Scanerio.Weather_application;

public class ForecastDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public ForecastDisplay(WeatherObservable weatherStation) {

        this.weatherStation = weatherStation;

        weatherStation.addObserver(this);
    }

    @Override
    public void update() {

        System.out.println(
                "Updating weather analytics...");
        display();
    }

    public void display() {

        System.out.println(
                "Forecast Details:");
        System.out.println(
                "Rain Probability, Temperature Trends, "
                        + "and Weather Events Analysis");
    }
}
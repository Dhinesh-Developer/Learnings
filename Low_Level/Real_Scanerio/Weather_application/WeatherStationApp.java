package Low_Level.Real_Scanerio.Weather_application;

public class WeatherStationApp {

    public static void main(String[] args) {

        // Create Weather Station

        WeatherObservable weatherStation =
                new WeatherStation();

        // Create Observers

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherStation);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherStation);

        System.out.println("\n----> Initial Weather Update");

        weatherStation.setWeatherReadings(
                80,
                65,
                30.4f);

        System.out.println("\n----> Second Weather Update");

        weatherStation.setWeatherReadings(
                82,
                70,
                29.2f);

        // Remove Forecast Observer

        weatherStation.removeObserver(forecastDisplay);

        System.out.println("\n----> Third Weather Update");

        weatherStation.setWeatherReadings(
                70,
                21,
                29.2f);
    }
}
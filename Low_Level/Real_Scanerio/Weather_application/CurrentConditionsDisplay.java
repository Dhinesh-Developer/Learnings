package Low_Level.Real_Scanerio.Weather_application;

public class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherObservable weatherStation;

    public CurrentConditionsDisplay(WeatherObservable weatherStation) {

        this.weatherStation = weatherStation;

        weatherStation.addObserver(this);
    }

    @Override
    public void update() {

        System.out.println("Saving weather data...");
        display();
    }

    public void display() {

        System.out.println(
                "Current Weather Conditions:");
        System.out.println(
                "Temperature: "
                        + weatherStation.getTemperature());

        System.out.println(
                "Humidity: "
                        + weatherStation.getHumidity());

        System.out.println(
                "Pressure: "
                        + weatherStation.getPressure());
    }
}
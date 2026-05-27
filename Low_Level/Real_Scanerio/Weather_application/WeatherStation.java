package Low_Level.Real_Scanerio.Weather_application;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private final List<WeatherObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
        System.out.println("[+] Observer Registered: "
                + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        System.out.println("[-] Observer Removed: "
                + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {

        for (WeatherObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setWeatherReadings(float temperature,
                                   float humidity,
                                   float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        System.out.println("\nWeather readings updated!");

        notifyObservers();
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getHumidity() {
        return humidity;
    }

    @Override
    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {

        return "Temperature = " + temperature +
                "°F, Humidity = " + humidity +
                "%, Pressure = " + pressure;
    }
}
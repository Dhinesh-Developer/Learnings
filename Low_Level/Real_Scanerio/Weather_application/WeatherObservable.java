package Low_Level.Real_Scanerio.Weather_application;

public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temperature, float humidity, float pressure);

    float getTemperature();

    float getHumidity();

    float getPressure();
}
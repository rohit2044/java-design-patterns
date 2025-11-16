package observers;

public class StatisticsDisplay implements DisplayElement, Observer {

    private final WeatherData weatherData;
    private float maxTemp =-200;
    private float minTemp = 200;
    private float averageTemp = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        maxTemp = Float.max(temperature, maxTemp);
        minTemp = Float.min(temperature, minTemp);
        averageTemp = (minTemp + maxTemp) / 2;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + averageTemp + "/" + maxTemp + "/" + minTemp);
    }
}

package ObserverDesignPattern;

public class StatisticsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

   /* public StatisticsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }*/

    @Override
    public void display() {
        System.out.println("Statistics report : " + temperature + " F degree " +
                humidity + " humidity " + pressure + " pressure ");
    }

    @Override
    public void update(float temperature, float humidty, float pressure) {
        this.temperature=temperature;
        this.humidity=humidty;
        this.pressure=pressure;
        display();
    }
}

package ObserverDesignPattern;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

   /* public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
       // weatherData.registerObserver(this);

        //The constructor is passed with the WeatherData object(Subject)
        //and we use it to register the CurrentConditionDisplay as an observer
    }*/

    public void removeObserver(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition: " + temperature + "F Degree and " +
                humidity + " %humidity");
    }

    @Override
    public void update(float temperature, float humidty, float pressure) {
        this.temperature=temperature;
        this.humidity=humidty;
        display();
    }
}

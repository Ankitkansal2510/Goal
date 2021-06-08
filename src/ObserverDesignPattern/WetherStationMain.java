package ObserverDesignPattern;

public class WetherStationMain {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay();
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay();
        weatherData.registerObserver(currentConditionDisplay);
        weatherData.registerObserver(statisticsDisplay);
       // CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
       // StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,60,25);
        weatherData.setMeasurements(800,70,90);
        System.out.println("");
        System.out.println("After removing CurrentCondition Observer from the list of Observer");
       // currentConditionDisplay.removeObserver(weatherData);
        weatherData.removeObserver(currentConditionDisplay);
        weatherData.setMeasurements(10,15,20);

    }
}

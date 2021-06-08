package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList; //We have added the arraylist to add the observer and we will initialise it in the constructor
    private float temperature;
    private float humidty;
    private float pressure;

    public  WeatherData(){
        observerList=new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observerList){
            observer.update(temperature,humidty,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
        // we notify observer when we get updated measurement from the weather change
    }

    public void setMeasurements(float temperature,float humidty,float pressure){
        this.temperature=temperature;
        this.humidty=humidty;
        this.pressure=pressure;
        measurementChanged();
    }
}

package ObserverDesignPattern;

public interface Observer {

    public void update(float temperature,float humidty,float pressure);

    //These are the state values the observer get from the Subject when the weather measurement changes

}

package ObserverDesignPattern;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    //Both of the above method take Observer as an argument that-is ,the
    //Observer to be registered or removed

    public void notifyObservers();

}

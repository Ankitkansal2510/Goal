package Decorator;

public abstract class Beverage {

    String description="uknown Beveage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

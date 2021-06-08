package Decorator;

public class Decaf extends Beverage{

    public Decaf(){
        description="This is decaf";
    }

    @Override
    public double cost() {
        return 30;
    }
}

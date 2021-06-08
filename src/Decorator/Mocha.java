package Decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "mocha";
    }
}

package StrategyDesignPattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am Flying with Wings");
    }
}

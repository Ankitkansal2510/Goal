package StrategyDesignPattern;

public class Sneak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am sneak");
    }
}

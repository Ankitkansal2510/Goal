package StrategyDesignPattern;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I cannot Quack");
    }
}

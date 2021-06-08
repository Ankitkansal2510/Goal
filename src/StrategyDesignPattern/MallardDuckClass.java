package StrategyDesignPattern;

public class MallardDuckClass extends Duck{

    public MallardDuckClass(){
//Instaniting the concrete implementation inside this constructor is not good idea,
// We should avoid this , to handle this we fly add two setFlyBehaviour and setQuackBehaviur
// inside a abstract class Duck , and from the main class at runtime we will pass the behaior

        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am a MallardDuck a");
    }


}

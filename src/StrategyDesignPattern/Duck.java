package StrategyDesignPattern;

public abstract class Duck {

    FlyBehavior flyBehavior;//Has a relationship
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }

     public void performFly(){
         flyBehavior.fly();
     }

     public void performQuack(){
         quackBehavior.quack();
     }

     public void swim(){

         System.out.println("All Ducks can swim");
     }

     abstract void display();
}

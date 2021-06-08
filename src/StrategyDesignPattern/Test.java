package StrategyDesignPattern;

public class Test {
    public static void main(String[] args) {
       /* MallardDuckClass mallardDuckClass=new MallardDuckClass();
        mallardDuckClass.performQuack();
        mallardDuckClass.performFly();
        mallardDuckClass.display();
        mallardDuckClass.swim();
*/
        System.out.println(" ");
        System.out.println("Injecting Dynamically");
        System.out.println();
        Duck model=new MallardDuckClass();
        model.setFlyBehavior(new FlyWithWings());
        model.setQuackBehavior(new Sneak());
        model.display();
        model.performFly();
        model.performQuack();


        System.out.println();
        Duck muteDuck=new MuteDuck();
        muteDuck.setFlyBehavior(new FlyWithWings());
        muteDuck.setQuackBehavior(new Mute());
        muteDuck.display();
        muteDuck.performFly();
        muteDuck.performQuack();

    }
}

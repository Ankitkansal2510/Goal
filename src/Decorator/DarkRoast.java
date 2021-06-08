package Decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description="This is DarkRoast";
    }

    @Override
    public double cost(){
        return 250;
    }
}

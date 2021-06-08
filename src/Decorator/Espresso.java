package Decorator;

public class Espresso extends Beverage{

    public Espresso(){
        description="This is Espresso";//Description instance variable is inherited from the Berverage superclass
    }


    @Override
    public double cost() {
        return 120;
    }
}

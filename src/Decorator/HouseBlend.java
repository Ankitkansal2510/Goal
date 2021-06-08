package Decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description="This is House Blend";
    }
    @Override
    public double cost() {
        return 150;
    }
}

package Decorator;

public abstract class CondimentDecorator extends Beverage{//First we need to be interchangeable with the Beverage so we extends the Beverage

    Beverage beverage;
    /**
     *Here the Beverage that each Decorator will be wrapping, Notice we are using the Beverage
     * Notice we are using the Beverage supertype to refer to the Beverage so the Decorator can wrap any
     * Beverage
     *
     */


   public abstract String getDescription();
}

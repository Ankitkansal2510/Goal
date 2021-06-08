package Decorator;

public class StarBuck {
    public static void main(String[] args) {
        //Order only espresso with no condiments
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription() + " " + "RS " + beverage.cost());


        //Order DarkRoast with Condiments

        Beverage darkRoast=new DarkRoast();
        darkRoast=new Mocha(darkRoast);
        darkRoast=new Mocha(darkRoast);
        darkRoast=new Whip(darkRoast);

        System.out.println(darkRoast.getDescription() + " " + " $ " + darkRoast.cost());

        //Finally ordering HosueBlen

        Beverage houseblend=new HouseBlend();
        houseblend=new Soy(houseblend);
        System.out.println(houseblend.getDescription() + " $ " + houseblend.cost());

        Beverage decaf=new Decaf();
        decaf=new Mocha(decaf);
        System.out.println(decaf.getDescription() + " $ " + decaf.cost());
    }
}

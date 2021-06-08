package Java8.firstExample;

public class Apple {

    private  String colour;
    private Integer weight;

    @Override
    public String toString() {
        return "Apple{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Apple(String colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static boolean isGreenApple(Apple apple){
        return "green".equalsIgnoreCase(apple.getColour());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight()>150;
    }
}

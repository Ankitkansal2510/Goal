package Java8.Stream.mapToInt;

public class Dish {

    private int calorie;
    private String name;

    @Override
    public String toString() {
        return "Dish{" +
                "calorie=" + calorie +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCalorie() {
        return calorie;
    }

    public String getName() {
        return name;
    }

    public Dish(int calorie, String name) {
        this.calorie = calorie;
        this.name = name;
    }
}

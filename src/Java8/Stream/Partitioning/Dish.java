package Java8.Stream.Partitioning;

public class Dish {
    private final String name;
    private final int Calorie;
    private final boolean isVegerterian;

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return Calorie;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", Calorie=" + Calorie +
                ", isVegerterian=" + isVegerterian +
                '}';
    }

    public boolean isVegerterian() {
        return isVegerterian;
    }

    public Dish(String name, int calorie, boolean isVegerterian) {
        this.name = name;
        Calorie = calorie;
        this.isVegerterian = isVegerterian;
    }
}

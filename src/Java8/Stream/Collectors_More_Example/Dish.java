package Java8.Stream.Collectors_More_Example;

public class Dish {

    private String Name;
    private int calories;

    @Override
    public String toString() {
        return "Dish{" +
                "Name='" + Name + '\'' +
                ", calories=" + calories +
                '}';
    }

    public String getName() {
        return Name;
    }

    public int getCalories() {
        return calories;
    }

    public Dish(String name, int calories) {
        Name = name;
        this.calories = calories;
    }
}
